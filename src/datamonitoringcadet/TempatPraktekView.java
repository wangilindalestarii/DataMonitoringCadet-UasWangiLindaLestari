/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamonitoringcadet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class TempatPraktekView extends javax.swing.JPanel {

    /**
     * Creates new form TempatPraktekView
     */
    public TempatPraktekView() {
        initComponents();
        ulang();
        tampil_data();
    }
    
    Connection con = new Koneksi().getKoneksi();
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel dtm;
    
    private void ulang(){
        buttonTambah.setVisible(true);
        buttonUbah.setVisible(true);
        buttonHapus.setVisible(true);
        textTelepon.setText("");
        labelID.setText("");
        textNama.setText("");
        textAlamat.setText("");
        textPimpinan.setText("");
    }
    
    private void tampil_data(){
        try {
            String[] judul = {"ID","NAMA PERUSAHAAN","ALAMAT","NO TELP","NAMA PIMPINAN"};
            dtm = new DefaultTableModel(null, judul);
            tableTempat.setModel(dtm);
            String sql = "";
            if(textCari.getText().isEmpty()){
                sql = "select * from tempat_praktek";
            }else{
                sql = "select * from tempat_praktek where nama_tempat like '%" + textCari.getText() +"%'";
            }
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String[] data = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
            dtm.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTempat = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        textAlamat = new javax.swing.JTextField();
        labelID = new javax.swing.JLabel();
        textTelepon = new javax.swing.JTextField();
        textPimpinan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonTutup = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonUlang = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Cari data tempat praktek berdasarkan nama tempat");

        textCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariKeyReleased(evt);
            }
        });

        tableTempat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableTempat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTempatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTempat);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("NAMA PERUSAHAAN");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("ALAMAT");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("NO TELP");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("NAMA PIMPINAN");

        labelID.setText("jLabel8");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("FORM TEMPAT PRAKTEK");

        buttonTutup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonTutup.setText("TUTUP");
        buttonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTutupActionPerformed(evt);
            }
        });

        buttonUbah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonUbah.setText("UBAH");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonUlang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonUlang.setText("ULANG");
        buttonUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUlangActionPerformed(evt);
            }
        });

        buttonTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonTambah.setText("TAMBAH");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(textCari))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTutup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelID)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                        .addComponent(textNama)
                                        .addComponent(textTelepon)
                                        .addComponent(textPimpinan))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(textPimpinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTambah)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonUbah)
                                .addComponent(buttonHapus)
                                .addComponent(buttonUlang)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTutup))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyReleased
        // TODO add your handling code here:
        tampil_data();
    }//GEN-LAST:event_textCariKeyReleased

    private void tableTempatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTempatMouseClicked
        // TODO add your handling code here:
        int row = tableTempat.getSelectedRow();
        labelID.setText(tableTempat.getValueAt(row, 0).toString());
        textNama.setText(tableTempat.getValueAt(row, 1).toString());
        textAlamat.setText(tableTempat.getValueAt(row, 2).toString());
        textTelepon.setText(tableTempat.getValueAt(row, 3).toString());
        textPimpinan.setText(tableTempat.getValueAt(row, 4).toString());
        buttonTambah.setEnabled(false);
        buttonUbah.setEnabled(true);
        buttonHapus.setEnabled(true);
    }//GEN-LAST:event_tableTempatMouseClicked

    private void buttonTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTutupActionPerformed
        // TODO add your handling code here:
        int index = HomeView.jTabbedPane3.getSelectedIndex();
        HomeView.jTabbedPane3.remove(index);
    }//GEN-LAST:event_buttonTutupActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        // TODO add your handling code here:
               if(textNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan Nama Belum diisi");
            textNama.requestFocus();
        }else if(textAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan Alamat Belum diisi");
            textAlamat.requestFocus();
        }else if(textTelepon.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan No Telp Belum diisi");
            textTelepon.requestFocus();
        }else if(textPimpinan.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan Nama Pimpinan Belum diisi");
            textPimpinan.requestFocus();
        }else{
            ubah_data();
        }
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null,"Yakin Ingin Menghapus Data Ini?","Hapus Data?",0);
        if (konfirmasi == 0) {
            try {
                pst = con.prepareStatement("delete from cadet where id = ?");
                pst.setInt(1,Integer.parseInt(labelID.getText()));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Cadet Berhasil dihapus");
                ulang();
                tampil_data();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUlangActionPerformed
        // TODO add your handling code here:
        ulang();
    }//GEN-LAST:event_buttonUlangActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        if(textNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan Nama Perusahaan Belum diisi");
            textNama.requestFocus();
        }else if(textAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan Alamat Belum diisi");
            textAlamat.requestFocus();
        }else if(textTelepon.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan No Telp Belum diisi");
            textTelepon.requestFocus();
        }else if(textPimpinan.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Inputan Nama Pimpinan Belum diisi");
            textPimpinan.requestFocus();
        }else{
            tambah_data();
        }
    }//GEN-LAST:event_buttonTambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonTutup;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JButton buttonUlang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JTable tableTempat;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textPimpinan;
    private javax.swing.JTextField textTelepon;
    // End of variables declaration//GEN-END:variables
    private void tambah_data() {
        try {
           pst = con.prepareStatement("insert into tempat_praktek values (?,?,?,?,?)");
           pst.setInt(1, 0);
           pst.setString(2, textNama.getText());
           pst.setString(3, textAlamat.getText());
           pst.setString(4, textTelepon.getText());
           pst.setString(5, textPimpinan.getText());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data Tempat Praktek berhasil ditambahkan");
           ulang();
           tampil_data();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void ubah_data() {
        try {
           pst = con.prepareStatement("update tempat_praktek set nama_tempat=?, alamat=?, no_telp=?, nama_pimpinan=?, where id_tempat=?");
           pst.setString(1, textNama.getText());
           pst.setString(2, textAlamat.getText());
           pst.setString(3, textTelepon.getText());
           pst.setString(4, textPimpinan.getText());
           pst.setInt(5, Integer.parseInt(labelID.getText()));
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data Tempat PKL berhasil diPerbaharui");
           ulang();
           tampil_data();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
