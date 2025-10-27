package com.kartikalabs.kllaundry.dao;

import com.kartikalabs.kllaundry.entity.BarangEntity;
import com.kartikalabs.kllaundry.service.DatabaseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BarangDao implements BaseDao<BarangEntity, String>{
    private static final Logger logger = LoggerFactory.getLogger(BarangDao.class);
    
    @Override
    public List<BarangEntity> all() {
        String sql = "SELECT * FROM barang;";
        try (
                Connection connection = DatabaseService.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            
            List<BarangEntity> barangEntities = new ArrayList<>();
            
            while (resultSet.next()) {
                String kodeBarang = resultSet.getString("kode_barang");
                String namaBarang = resultSet.getString("nama_barang");
                barangEntities.add(new BarangEntity(kodeBarang, namaBarang));
            }
            
            return barangEntities;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException("Gagal ambil data", e);
        }
    }

    @Override
    public BarangEntity get(String identifier) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BarangEntity create(BarangEntity object) {
        String sql = "INSERT INTO barang(kode_barang, nama_barang) VALUES(?,?);";
        
        try (
                Connection connection = DatabaseService.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ) {
            preparedStatement.setString(1, object.getKodeBarang());
            preparedStatement.setString(2, object.getNamaBarang());
            preparedStatement.executeUpdate();
            return object;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public BarangEntity update(String identifier, BarangEntity object) {
        String sql = "UPDATE barang SET nama_barang=?, kode_barang=? WHERE kode_barang=?";
        
        try (
                Connection connection = DatabaseService.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ) {
            preparedStatement.setString(1, object.getNamaBarang());
            preparedStatement.setString(2, object.getKodeBarang());
            preparedStatement.setString(3, identifier);
            preparedStatement.executeUpdate();
            return object;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public boolean delete(String identifier) {
        String sql = "DELETE FROM barang WHERE kode_barang=?";
        
        try (
                Connection connection = DatabaseService.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ) {
            preparedStatement.setString(1, identifier);
            
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    public List<BarangEntity> search(String keyword) {
        String sql = "SELECT * FROM barang WHERE kode_barang LIKE ?;";
        
        try (
                Connection connection = DatabaseService.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            
            List<BarangEntity> barangEntities = new ArrayList<>();
            preparedStatement.setString(1, "%" + keyword + "%");
            
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String kodeBarang = resultSet.getString("kode_barang");
                    String namaBarang = resultSet.getString("nama_barang");
                    barangEntities.add(new BarangEntity(kodeBarang, namaBarang));
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                throw new RuntimeException("Gagal ambil data", e);
            }
            
            return barangEntities;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException("Gagal ambil data", e);
        }
    }

    
    
   
}
