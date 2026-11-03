/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;


public class KamarSuite extends Kamar{
    public KamarSuite(String nomor, double harga, String status){
        super(nomor, harga, status);
    }
    @Override
    public String getTipe() { return "SUITE"; }

    @Override
    public String getFasilitas() { return "AC, TV, WiFi, Ruang tamu, Bathtub, Sarapan"; }

    @Override
    public double hitungBiaya(int malam) {
        return getHarga() * malam * 1.15 + 50000 * malam;  
    }
}
