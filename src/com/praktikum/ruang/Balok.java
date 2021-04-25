/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum.ruang;

import com.praktikum.bidang.PersegiPanjang;

/**
 *
 * @author cemil
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return this.luas() * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        int p = this.panjang;
        int l = this.lebar;
        int t = this.tinggi;
        return 2 * ((p * l) + (p * t) + (l * t)) ;
    }
    
    
}
