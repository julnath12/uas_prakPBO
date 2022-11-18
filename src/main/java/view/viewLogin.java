/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.Login;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class viewLogin {
    JFrame frame = new JFrame("Login");

    public viewLogin() {
        Login login = new Login();
        frame.setSize(600, 380);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.PLAIN, 20);

        //label judul
        JLabel judul = new JLabel("Login");
        judul.setBounds(240, 5, 500, 60);
        judul.setFont(new Font("Serif", Font.BOLD, 35));

        //label username
        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(100, 100, 90, 40);
        userNameLabel.setFont(font1);

        //textfield username
        JTextField userName = new JTextField();
        userName.setBounds(240, 105, 240, 30);
        userName.setFont(font1);

        //label password
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(100, 140, 90, 40);
        passLabel.setFont(font1);

        //pass
        JTextField pass = new JTextField();
        pass.setBounds(240, 145, 240, 30);
        pass.setFont(font1);

        JButton submit = new JButton("Login");
        submit.setBounds(300, 200, 180, 50);
        submit.setFont(font1);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String result = controler.Login(userName.getText(),pass.getText());
                if(result.equals("Login Berhasil!")){
                    frame.dispose();
                    JOptionPane.showMessageDialog(null,result);
                    
                }else if(result.equals("Password Salah!")){
                    JOptionPane.showMessageDialog(null,result);
                    pass.setText("");
                    pass.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null,result);
                    userName.setText("");
                    pass.setText("");
                    userName.requestFocus();
                }
            }  
        });

        JButton back = new JButton("Kembali");
        back.setBounds(100, 200, 180, 50);
        back.setFont(font1);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new menuUtama();
            } 
        });

        frame.add(judul);
        frame.add(userNameLabel);
        frame.add(userName);
        frame.add(passLabel);
        frame.add(pass);
        frame.add(back);
        frame.add(submit);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
