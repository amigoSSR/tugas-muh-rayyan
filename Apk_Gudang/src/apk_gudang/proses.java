/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apk_gudang;

import java.sql.*;
import java.sql.PreparedStatement;
public class proses {
    private Connection conn;
    
    public void inputData(String nama_barang, String stock, String harga) {
    conn = config.getConnection();
    if (conn == null) {
        System.out.println("Koneksi database gagal! Tidak dapat menyimpan data.");
        return;
    }
    try {
        String query = "INSERT INTO barang1 (nama_barang, stock, harga) VALUES (?, ?, ?)";
        PreparedStatement preparedStmt = conn.prepareStatement(query);

        preparedStmt.setString(1, nama_barang);
        preparedStmt.setString(2, stock);
        preparedStmt.setString(3, harga);

        preparedStmt.execute();
        System.out.println("Data berhasil disimpan!");
        gudang p = new gudang();

    } catch (SQLException e) {
        System.out.println("Gagal menyimpan data: " + e.getMessage());
    }
}

    public void UpdateData(int id, String nama_barang, String stock, String harga) {
    conn = config.getConnection();
    if (conn == null) {
        System.out.println("Koneksi database gagal! Tidak dapat memperbarui data.");
        return;
    }

    try {
        // Cetak nilai untuk debugging
        System.out.println("Mencoba memperbarui barang dengan ID: " + id);
        
        String query = "UPDATE barang1 SET nama_barang = ?, stock = ?, harga = ? WHERE id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);

        preparedStmt.setString(1, nama_barang);
        preparedStmt.setString(2, stock);
        preparedStmt.setString(3, harga);
        preparedStmt.setInt(4, id);
        
        int rowsAffected = preparedStmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Data berhasil diperbarui!");
        } else {
            System.out.println("Gagal memperbarui data! Cek apakah no_barang " + id + " ada di database.");
        }
        gudang p = new gudang();
    } catch (SQLException e) {
        System.out.println("Terjadi kesalahan saat memperbarui data: " + e.getMessage());
    }
    }
}
