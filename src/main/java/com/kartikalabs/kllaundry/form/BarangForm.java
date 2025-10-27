package com.kartikalabs.kllaundry.form;

import com.kartikalabs.kllaundry.dao.BarangDao;
import com.kartikalabs.kllaundry.entity.BarangEntity;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Yanzen
 */
public class BarangForm extends javax.swing.JFrame {
     private static final Logger logger = LoggerFactory.getLogger(BarangForm.class);
    
    public BarangForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldKodeBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldNamaBarang = new javax.swing.JTextField();
        buttonSimpan = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        textFieldSearchKodeBarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Barang");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonBatal.setText("Reset");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        textFieldSearchKodeBarang.setText("Cari data");
        textFieldSearchKodeBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSearchKodeBarangKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textFieldNamaBarang)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(textFieldSearchKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonHapus)
                    .addComponent(buttonBatal)
                    .addComponent(textFieldSearchKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBarang.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelBarang.setShowGrid(true);
        tabelBarang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabelBarangPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        try {
            String kodeBarang = textFieldKodeBarang.getText();
            String namaBarang = textFieldNamaBarang.getText();
            
            BarangDao barangDao = new BarangDao();
            if (barangEntity == null) {
                barangDao.create(new BarangEntity(kodeBarang, namaBarang));
            } else {
                barangDao.update(barangEntity.getKodeBarang(), new BarangEntity(kodeBarang, namaBarang));
            }
            
            textFieldKodeBarang.setText("");
            textFieldNamaBarang.setText("");
            
            onRefreshData();
            barangEntity = null;
            logger.info("Berhasil menyimpan data");
        } catch (Exception e) {
            logger.error(e.getMessage());
            JOptionPane.showMessageDialog(
                    null, 
                    "Gagal menyimpan data", 
                    "Ups", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        onRefreshData();
    }//GEN-LAST:event_formWindowOpened

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        // TODO add your handling code here:
        barangEntity = null;
        textFieldKodeBarang.setText("");
        textFieldNamaBarang.setText("");
        tabelBarang.clearSelection();
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void textFieldSearchKodeBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSearchKodeBarangKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            try {
                DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
                model.setRowCount(0);

                BarangDao barangDao = new BarangDao();
                String keyword = textFieldSearchKodeBarang.getText();
                for (BarangEntity barang: barangDao.search(keyword)) {
                    model.addRow(new Object[]{barang.getKodeBarang(), barang.getNamaBarang()});
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
            
        }
    }//GEN-LAST:event_textFieldSearchKodeBarangKeyPressed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        try {
            int selectedRow = tabelBarang.getSelectedRow();
            if (selectedRow == -1 && barangEntity == null) {
                JOptionPane.showMessageDialog(null, "Anda belum memilih data", "Info", JOptionPane.WARNING_MESSAGE);
            } else {
                int result = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus?", "Hapus Data", JOptionPane.WARNING_MESSAGE);
                if (result == 0) {
                    BarangDao barangDao = new BarangDao();
                    if (barangDao.delete(barangEntity.getKodeBarang())) {
                        JOptionPane.showMessageDialog(null, "Berhasil menghapus data.", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                        barangEntity = null;
                        textFieldKodeBarang.setText("");
                        textFieldNamaBarang.setText("");
                        onRefreshData();
                    } else {
                        JOptionPane.showMessageDialog(null, "Gagal menghapus data.", "Hapus Data", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            JOptionPane.showMessageDialog(
                    null, 
                    "Gagal menyimpan data", 
                    "Ups", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void tabelBarangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelBarangPropertyChange
        // TODO add your handling code here:
        int selectedRow = tabelBarang.getSelectedRow();
        if (selectedRow != -1) {
            String kodeBarang = tabelBarang.getValueAt(selectedRow, 0).toString();
            String namaBarang = tabelBarang.getValueAt(selectedRow, 1).toString();
            barangEntity = new BarangEntity(kodeBarang, namaBarang);
            textFieldKodeBarang.setText(kodeBarang);
            textFieldNamaBarang.setText(namaBarang);
        }
    }//GEN-LAST:event_tabelBarangPropertyChange

    public void onRefreshData() {
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
        model.setRowCount(0);
        
        BarangDao barangDao = new BarangDao();
        for (BarangEntity barang: barangDao.all()) {
            model.addRow(new Object[]{barang.getKodeBarang(), barang.getNamaBarang()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField textFieldKodeBarang;
    private javax.swing.JTextField textFieldNamaBarang;
    private javax.swing.JTextField textFieldSearchKodeBarang;
    // End of variables declaration//GEN-END:variables

    private BarangEntity barangEntity;
}
