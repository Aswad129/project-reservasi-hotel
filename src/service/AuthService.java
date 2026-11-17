/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package service;

import config.koneksi;
import exception.ValidasiException;
import model.User;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AuthService {

    public static String hash(String teks) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] h = md.digest(teks.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : h) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public User login(String username, String password) throws ValidasiException, SQLException {
        if (username.isBlank() || password.isBlank()){
            throw new ValidasiException("Username dan password wajib di isi!");
        }
        String sql = "SELECT username, role FROM users WHERE username=? AND password=?";
        try (Connection c = koneksi.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, hash(password));
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getString("username"), rs.getString("role"));
                }
            }
        }
        throw new ValidasiException("Username atau password salah!");
    }

}
