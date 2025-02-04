/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apk_gudang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class gudang extends javax.swing.JFrame {

    private Connection conn;
    
    public gudang() throws SQLException {
        initComponents();
        setVisible(true);
        conn = config.getConnection();
        getData();
        nonAktifButton();
        aktifButton();
    }

    private void getData(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        try{
            String sql = "Select * from barang1";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int no_barang = rs.getInt("id");
                String nama_barang = rs.getString("nama_barang");
                String stock = rs.getString("stock");
                String harga = rs.getString("harga");
                
                Object[] rowData = {no_barang,nama_barang,stock,harga};
                model.addRow(rowData);

            }
            rs.close();
            st.close();
        } catch (Exception e){
            System.out.println("Gagal menampilkan data yang ada di database: " + e.getMessage());
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Harga_barang = new javax.swing.JTextField();
        txt_nama_barang = new javax.swing.JTextField();
        txt_stock_barang = new javax.swing.JTextField();
        txt_cari = new javax.swing.JTextField();
        btn_input = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        Btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Gudang toko GW");
        jLabel1.setToolTipText("");

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No barang", "Nama barang", "Stock", "Harga"
            }
        ));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Stock barang");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Harga Barang");

        txt_cari.setText("Pencarian");
        txt_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cariMouseClicked(evt);
            }
        });
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cariKeyTyped(evt);
            }
        });

        btn_input.setText("INPUT");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        Btn_delete.setText("DELETE");
        Btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Harga_barang, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txt_nama_barang, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txt_stock_barang, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cari)
                    .addComponent(jScrollPane1))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_stock_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Harga_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_input)
                            .addComponent(btn_cancel)
                            .addComponent(Btn_delete)
                            .addComponent(btn_update))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        try{
            String nama_barang = txt_nama_barang.getText();
            String stock = txt_stock_barang.getText();
            String harga = txt_Harga_barang.getText();
            
            if(nama_barang.isEmpty() || stock.isEmpty() || harga.isEmpty()){
                JOptionPane.showMessageDialog(this, "Semua kolom harus di isi!", "validasi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            proses p = new proses();
            p.inputData(nama_barang, stock, harga);
            this.dispose();
        } catch (Exception e){
            
        }
    }//GEN-LAST:event_btn_inputActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
       int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow != -1){
            
            String nama_barang= tbl_data.getValueAt(selectedRow, 1).toString();
            String stock= tbl_data.getValueAt(selectedRow, 2).toString();
            String harga= tbl_data.getValueAt(selectedRow, 3).toString();

            txt_nama_barang.setText(nama_barang);
            txt_stock_barang.setText(stock);
            txt_Harga_barang.setText(harga);
        }
        btn_update.setEnabled(true);
        btn_input.setEnabled(false);
        Btn_delete.setEnabled(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
      String nama_barang = txt_nama_barang.getText();
      String stock = txt_stock_barang.getText();
      String harga = txt_Harga_barang.getText();
      

      
      if(nama_barang.isEmpty() || stock.isEmpty() || harga.isEmpty()){
          JOptionPane.showMessageDialog(this, "Semua kolom harus di isi!", "validasi", JOptionPane.ERROR_MESSAGE);
          return;
      }       
      
       proses p = new proses();
       p.UpdateData(WIDTH, nama_barang, stock, harga);
//       
//     this.dispose();  
      } catch (Exception e){
          System.out.println("gagal menyimpan barang" + e.getMessage());
      }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void Btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_deleteActionPerformed
        int selectedRow =tbl_data.getSelectedRow();
       if(selectedRow == -1){
           JOptionPane.showMessageDialog(this, "Pilih baris yang akan di hapus");
           return;
       }
       int confirm = JOptionPane.showConfirmDialog(this, "apakah anda yakin ingin menghapus data ini? ", "konfirmasi", JOptionPane.YES_NO_OPTION);
       if(confirm == JOptionPane.YES_OPTION){
           String id = tbl_data.getValueAt(selectedRow, 0).toString();
           
           try{
               String sql = "DELETE FROM barang WHERE no_barang=?";
               PreparedStatement st = conn.prepareStatement(sql);
               st.setString(1, id);
               
               int rowDelete = st.executeUpdate();
               if(rowDelete > 0){
                   JOptionPane.showMessageDialog(this, "data berhasil di hapus");
                   resetForm();
                   getData(); 
               }
           } catch (Exception e){
               System.out.println("Data gagal di hapus" + e.getMessage());
           }
       }
    }//GEN-LAST:event_Btn_deleteActionPerformed

    private void txt_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyTyped
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
    model.setRowCount(0);
    
    String cari = txt_cari.getText();
    
    try {
        String sql = "SELECT * FROM barang1 WHERE nama_barang LIKE ? OR stock LIKE ? OR harga LIKE ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, "%" + cari + "%");
        st.setString(2, "%" + cari + "%");
        st.setString(3, "%" + cari + "%");

        ResultSet rs = st.executeQuery();
        
        while (rs.next()) {
            int id = rs.getInt("no_barang");
            String nama_barang = rs.getString("nama_barang");
            String stock_barang = rs.getString("stock");
            String kode_barang = rs.getString("harga");
            
            Object[] rowData = {id, nama_barang, stock_barang, kode_barang};
            model.addRow(rowData);
        }
        
        rs.close();
        st.close();
    } catch (Exception e) {
        System.out.println("Gagal menampilkan data yang ada di database: " + e.getMessage());
    }
    }//GEN-LAST:event_txt_cariKeyTyped

    private void txt_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cariMouseClicked
        txt_cari.setText("");
    }//GEN-LAST:event_txt_cariMouseClicked

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        resetForm();
        aktifButton();
        nonAktifButton();
        
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_delete;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_Harga_barang;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_nama_barang;
    private javax.swing.JTextField txt_stock_barang;
    // End of variables declaration//GEN-END:variables

    private void resetForm(){
        txt_nama_barang.setText("");
        txt_stock_barang.setText("");
        txt_Harga_barang.setText("");

    }

    private void nonAktifButton() {
       btn_update.setEnabled(false);
       Btn_delete.setEnabled(false);

    }

    private void aktifButton() {
        btn_input.setEnabled(true);
        btn_cancel.setEnabled(true);

    }
}
