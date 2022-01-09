/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class PilihMobil {
    private int no;
    private  String no_plat;
    private  String merek_mobil;
    private  String harga;

  

    public PilihMobil(int no, String no_plat, String merek_mobil, String harga) {
     this.no=no;
     this.no_plat=no_plat;
     this.merek_mobil=merek_mobil;
     this.harga=harga;    
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNo_plat() {
        return no_plat;
    }

    public void setNo_plat(String no_plat) {
        this.no_plat = no_plat;
    }

    public String getMerek_mobil() {
        return merek_mobil;
    }

    public void setMerek_mobil(String merek_mobil) {
        this.merek_mobil = merek_mobil;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    
}
