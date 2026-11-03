/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;


public class KamarDeluxe extends Kamar {
    public KamarDeluxe(String nomor, double harga, String status){
        super(nomor, harga, status);
    }
    
    @Override
    public String getTipe() { return "DELUXE"; }

    @Override
    public String getFasilitas() { return "AC, TV, WiFi, Kulkas mini, Balkon"; }

    @Override
    public double hitungBiaya(int malam) {
        return getHarga() * malam * 1.10;   
    }
}
