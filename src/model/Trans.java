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
public class Trans {
   private int no; 
   private String lama_sewa;
   private String harga;
   private String merek_mobil;
   private String total;

    public Trans(int no, String lama_sewa, String harga, String merek_mobil, String total) {  
     this.no=no;
     this.lama_sewa=lama_sewa;
     this.harga=harga;
     this.merek_mobil=merek_mobil;
     this.total=total;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getLama_sewa() {
        return lama_sewa;
    }

    public void setLama_sewa(String lama_sewa) {
        this.lama_sewa = lama_sewa;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getMerek_mobil() {
        return merek_mobil;
    }

    public void setMerek_mobil(String merek_mobil) {
        this.merek_mobil = merek_mobil;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }


}
