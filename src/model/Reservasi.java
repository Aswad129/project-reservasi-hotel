/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservasi {
    private int id;
    private Tamu tamu;      // association
    private Kamar kamar;    // association
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double total;
    private String status;
    
    public Reservasi(int id, Tamu tamu, Kamar kamar, LocalDate checkIn, LocalDate checkOut, double total, String status){
        this.id = id;
        this.tamu = tamu;
        this.kamar = kamar;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.total = total;
        this.status = status;
    }
    
    
    public int getId() { return id; }
    public Tamu getTamu() { return tamu; }
    public Kamar getKamar() { return kamar; }
    public LocalDate getCheckIn() { return checkIn; }
    public LocalDate getCheckOut() { return checkOut; }
    public double getTotal() { return total; }
    public String getStatus() { return status; }

    public long getMalam() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }
}

