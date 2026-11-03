/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;


public class Tamu extends Orang {
    private int id;
    private String noKtp;
    
    public Tamu(int id, String nama, String noHp, String noKtp){
        super(nama, noHp);
        this.id = id;
        this.noKtp = noKtp;
    }
    
    public Tamu(String nama, String noHp, String noKtp){
        this(0, nama, noHp, noKtp);
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNoKtp() { return noKtp; }
    public void setNoKtp(String noKtp) { this.noKtp = noKtp; }

    @Override
    public String getPeran() { return "Tamu"; }
    
    @Override
    public String toString() {return id + "-" + getNama(); }
}
