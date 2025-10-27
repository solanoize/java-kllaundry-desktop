package com.kartikalabs.kllaundry.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Yanzen
 */
public class DatabaseService {
    
    public static Path getDbPath() throws IOException {
        String appData = System.getenv("LOCALAPPDATA");
        Path appFolder = Paths.get(appData, "kllaundry");
        
        if (!Files.exists(appFolder)) {
            Files.createDirectories(appFolder);
        }
        
        Path dbPath = appFolder.resolve("store_00.sqlite");
        
        if (!Files.exists(dbPath)) {
            Files.createFile(dbPath);
        }
        
        return dbPath;
    }
    
    public static Connection getConnection() throws IOException, SQLException {
        Path dbPath = DatabaseService.getDbPath();
        String url = "jdbc:sqlite:" + dbPath.toAbsolutePath();
        return DriverManager.getConnection(url);
    }
    
    public static ErrorService testConnection() {
        try (Connection connection = getConnection()) {
            return new ErrorService(false, "Success create connection", "");
        } catch (Exception e) {
            return new ErrorService(true, "Connection failed", e.getMessage());
        }
    }
    
    public static ErrorService migrate() {
        String sql = "CREATE TABLE IF NOT EXISTS barang (" +
                "   kode_barang VARCHAR(6) PRIMARY KEY CHECK(kode_barang <> '')," +
                "   nama_barang TEXT NOT NULL CHECK(nama_barang <> '')" +
                ");";
        
        try (
                Connection connection = getConnection();
                Statement statement = connection.createStatement();
        ) {
            statement.execute(sql);
            return new ErrorService(false, "Berhasil migrasi tabel", "");
        } catch (Exception e) {
            return new ErrorService(true, "Gagagl migrasi tabel", e.getMessage());
        }
    }
}
