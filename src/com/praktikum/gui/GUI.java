/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum.gui;
import javax.swing.*;
import java.awt.event.*;
import com.praktikum.ruang.Balok;

/**
 *
 * @author cemil
 */
public class GUI extends JFrame implements ActionListener{
       JLabel lpanjang = new JLabel("Panjang");
       JTextField fpanjang = new JTextField(10);
       
       JLabel llebar = new JLabel("Lebar");
       JTextField flebar = new JTextField(10);
       
       JLabel ltinggi = new JLabel("Tinggi");
       JTextField ftinggi = new JTextField(10);
       
       JLabel lluas = new JLabel();
       JLabel lkeliling = new JLabel();
       JLabel lluaspermukaan = new JLabel();
       JLabel lvolume = new JLabel();
       
       JButton bhitung = new JButton("Hitung");
       JButton breset = new JButton("Reset");

       public GUI(){
           setTitle("Hitung Balok");
           
//         setSize(lebar, tinggi);
           setSize( 310 ,  300 );
           setLayout(null);
           add(lpanjang);
           add(fpanjang);
           add(llebar);
           add(flebar);
           add(ltinggi);
           add(ftinggi);
           add(bhitung);
           add(lluas);
           add(lkeliling);
           add(lluaspermukaan);
           add(lvolume);
           add(breset);
           
           lpanjang.setBounds(10,10,120,20);
           fpanjang.setBounds(130,10,150,20);
           llebar.setBounds(10,35,120,20);
           flebar.setBounds(130,35,150,20);
           ltinggi.setBounds(10,60,120,20);
           ftinggi.setBounds(130,60,150,20);
           bhitung.setBounds(10,95,100,20);
           breset.setBounds(180,95,100,20);
           lluas.setBounds(10,125,200,20);
           lkeliling.setBounds(10,150,200,20);
           lluaspermukaan.setBounds(10,175,200,20);
           lvolume.setBounds(10,200,200,20);
           
           setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
       
           bhitung.addActionListener(this);
           breset.addActionListener(this);
       }
       
       public void actionPerformed(ActionEvent e){
           int panjang,lebar,tinggi;
           
           if(e.getSource() == bhitung){
               if(fpanjang.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "'Panjang' tidak boleh kosong.");
               } else if(flebar.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "'Lebar' tidak boleh kosong.");
               } else if(ftinggi.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "'Tinggi' tidak boleh kosong.");
               } else {
                    try{
                         panjang = Integer.parseInt(fpanjang.getText());
                         lebar = Integer.parseInt(flebar.getText());
                         tinggi = Integer.parseInt(ftinggi.getText());
                         Balok balok = new Balok(panjang, lebar, tinggi);
                         lluas.setText("Luas Persegi Panjang = " + balok.luas());
                         lkeliling.setText("Keliling Persegi Panjang = " + balok.keliling());
                         lluaspermukaan.setText("Luas Permukaan = " + balok.luasPermukaan());
                         lvolume.setText("Volume Balok = " + balok.volume());
                     } catch(Exception err){
                         JOptionPane.showMessageDialog(this, "Hanya menerima inputan integer (bilangan bulat).");
                     }
               }
           }
           
           if(e.getSource() == breset){
               fpanjang.setText("");
               flebar.setText("");
               ftinggi.setText("");
               lluas.setText("");
               lkeliling.setText("");
               lluaspermukaan.setText("");
               lvolume.setText("");
           }
        }
}
