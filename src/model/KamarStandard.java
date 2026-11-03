/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;


public class KamarStandard extends Kamar{
    public KamarStandard(String nomor, double harga, String Status){
        super(nomor, harga, Status);
    }
    
    @Override
    public String getTipe() { return "STANDARD"; }

    @Override
    public String getFasilitas() { return "AC, TV, WiFi"; }

    @Override
    public double hitungBiaya(int malam) {
        return getHarga() * malam;
    }
}
