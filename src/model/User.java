/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author Luzkyyy
 */
public class User {
    private final String username;
    private final String role;
    
    public User(String username, String role){
        this.username = username;
        this.role = role;
    }
    
    public String getUsername() {return username; }
    public String getRole() { return role; }
    
}
