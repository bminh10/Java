/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

/**
 *
 * @author admin
 */
public abstract class SanPham {
    private static int soLuong = 0;
    private int maSP;
    private String tenSP;
    private double giaBan;
    
    {
        soLuong++;
        this.maSP = soLuong;
    }

    public SanPham(String tenSP, double giaBan) {
        this.tenSP = tenSP;
        this.giaBan = giaBan;
    }

    
    
    public abstract void show();
    public abstract void search();
    /**
     * @return the maSP
     */
    public int getMaSP() {
        return maSP;
    }

    /**
     * @param maSP the maSP to set
     */
    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }


    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
    
}
