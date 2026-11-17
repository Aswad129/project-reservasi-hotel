/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package app;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import ui.LoginForm;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // pakai tampilan bawaan Swing
        }
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}