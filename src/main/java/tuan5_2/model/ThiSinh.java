/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan5_2.model;




/**
 *
 * @author DELL
 */
public class ThiSinh {
    private String name, diachi,sbd,khoi;
    private int uutien;

    public ThiSinh() {
    }
    
    public ThiSinh(String name, String diachi, String sbd, String khoi, int uutien) {
        this.name = name;
        this.diachi = diachi;
        this.sbd = sbd;
        this.khoi = khoi;
        this.uutien = uutien;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    public int getUutien() {
        return uutien;
    }

    public void setUutien(int uutien) {
        this.uutien = uutien;
    }
    

    
    
}
