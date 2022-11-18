/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.User;


/**
 *
 * @author user
 */
public class Registrasi {
    JFrame frame;
    JPanel panel;
    JLabel labelJudul, Lusername, Lemail,Lpass,Lcategory,Lgender;
    JTextField TFusername, TFpass, TFemail;
    JRadioButton radioButtonPria, radioButtonWanita;
    String jenisKelamin;
    JComboBox kategory;
    JButton insert, back;
    Font font1 = new Font("Serif", Font.PLAIN, 20);
    
    public Registrasi(User user){
        frame = new JFrame("New Register");
        frame.setSize(600, 700);
        
        panel = new JPanel();
        panel.setSize(600, 700);
        panel.setBackground(Color.gray);
        
        labelJudul = new JLabel("Register");
        labelJudul.setFont(new Font("Arial", Font.BOLD, 26));
        labelJudul.setBounds(230, 7, 250, 30);
        
        Lusername = new JLabel("username");
        Lusername.setBounds(5, 50, 150, 20);
        TFusername = new JTextField();
        TFusername.setBounds(105, 50, 150, 20);
        
        Lemail = new JLabel("email ");
        Lemail.setBounds(5, 75, 150, 20);
        TFemail = new JTextField();
        TFemail.setBounds(105, 75, 150, 20);
        
        Lpass = new JLabel("password ");
        Lpass.setBounds(5, 100, 150, 20);
        TFpass = new JTextField();
        TFpass.setBounds(105, 100, 150, 20);
        
        Lcategory = new JLabel("kategori ");
        Lcategory.setBounds(5, 125, 150, 20);
        String[] cat = {"Private Account", "Creator Account","Business Account"};
        kategory = new JComboBox(cat);
        kategory.setBounds(105, 125, 150, 20);
        
        
        Lgender = new JLabel("Jenis Kelamin: ");
        Lgender.setBounds(5, 150, 150, 20);
        radioButtonPria = new JRadioButton("Pria");
        radioButtonPria.setBounds(105, 150, 80, 20);
        radioButtonPria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jenisKelamin = radioButtonPria.getText();
            }
        });
        radioButtonWanita = new JRadioButton("Wanita");
        radioButtonWanita.setBounds(185, 150, 70, 20);
        radioButtonWanita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jenisKelamin = radioButtonWanita.getText();
            }
        });
        panel.setLayout(null);
        panel.setVisible(true);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        insert = new JButton("Insert Data");
            insert.setBounds(100, 200, 100, 30);
            insert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                }
            });
        JButton back = new JButton("Kembali");
        back.setBounds(100, 500, 180, 50);
        back.setFont(font1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new menuUtama();
            } 
        });
        panel.add(labelJudul);
        panel.add(Lusername);
        panel.add(Lemail);
        panel.add(Lpass);
        panel.add(Lcategory);
        panel.add(Lgender);
        panel.add(TFusername);
        panel.add(TFpass);
        panel.add(TFemail);
        panel.add(radioButtonPria);
        panel.add(radioButtonWanita);
        frame.add(panel);
        panel.add(insert);
        panel.add(back);
    }
}
