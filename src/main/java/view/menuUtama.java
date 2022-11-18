/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.User;

/**
 *
 * @author user
 */
public class menuUtama implements ActionListener{

    static JFrame frame;
    JPanel panel;
    JLabel labelJudul;
    JButton buttonLogin, buttonRegistrasi, kategori;
    
    public menuUtama() {
        frame = new JFrame ("tok-tok");
        frame.setSize (500, 350);
        
        panel = new JPanel();
        panel.setSize (500, 700);
        panel.setBackground(Color.white);
        
        Font font = new Font("impact", Font.BOLD, 18);
        
        labelJudul = new JLabel ("Menu Utama");
        labelJudul.setFont(new Font("impact", Font.BOLD, 26));
        labelJudul.setBounds(175, 20, 150, 30);
        
        buttonLogin = new JButton("Log-in");
        buttonLogin.setFont(font);
        buttonLogin.setBounds (150, 80, 190, 40);
        
        buttonRegistrasi = new JButton("Register");
        buttonRegistrasi.setFont(font);
        buttonRegistrasi.setBounds (150, 140, 190, 40);
        
        kategori = new JButton("kategori");
        kategori.setFont(font);
        kategori.setBounds (150, 200, 190, 40);
        
        buttonLogin.addActionListener(this);
        buttonRegistrasi.addActionListener(this);
        kategori.addActionListener(this);
        
        panel.add(labelJudul);
        panel.add(buttonLogin);
        panel.add(buttonRegistrasi);
        panel.add(kategori);
        
        frame.add(panel);
        
        panel.setLayout(null);
        panel.setVisible(true);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command) {
            case "Log-in": 
                new view.viewLogin();
                break;
            case "Register":
                User user = null;
                new view.Registrasi(user);
                break;
        }
    }
    
}
