/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import antarmuka.DapatDipesan;


public abstract class Kamar implements DapatDipesan {
    public static final String TERSEDIA = "TERSEDIA";
    public static final String DIPESAN = "DIPESAN";
    
    private String nomor;
    private double harga;
    private String status;
    
    public Kamar(String nomor, double harga, String status){
        this.nomor = nomor;
        this.harga = harga;
        this.status = status;
    }
    
    public String getNomor() { return nomor; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public abstract String getTipe();
    public abstract String getFasilitas();
    public abstract double hitungBiaya(int malam);
    
    public double hitungBiaya(int malam, double diskonPersen){
        return hitungBiaya(malam) * (1 - diskonPersen / 100);
    }
    
    @Override
    public boolean isTersedia() { return TERSEDIA.equals(status); }

    @Override
    public void pesan() { status = DIPESAN; }

    @Override
    public void kosongkan() { status = TERSEDIA; }

    @Override
    public String toString() { return nomor + " (" + getTipe() + ")"; }
}
