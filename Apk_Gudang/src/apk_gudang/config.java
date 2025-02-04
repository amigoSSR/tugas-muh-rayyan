/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apk_gudang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/gudang";
                String user = "root";
                String password = "";
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi ke database berhasil!");
            } catch (SQLException e) {
                System.out.println("Gagal koneksi: " + e.getMessage());
            }
        }
        return conn;
    }
}

