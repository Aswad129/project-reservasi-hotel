/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;
    
public abstract class Orang {
    private String nama;
    private String noHp;
    
    public Orang(String nama, String noHp){
        this.nama = nama;
        this.noHp = noHp;
    }
    
    public String getNama() { return nama;}
    public void setNama(String nama) { this.nama = nama; }
    public String GetnoHp() { return noHp; }
    public void setnoHp (String noHp) { this.noHp = noHp; }
    
    public abstract String getPeran();
}


