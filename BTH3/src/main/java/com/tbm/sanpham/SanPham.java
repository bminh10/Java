/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

/**
 *
 * @author Admin
 */
public class SanPham {
    private int maSP;
    private String tenSP;
    private String moTaSP;
    private String nhaSX;
    private double giaBan;
    private static int soLuong = 0;
    
    {
        setSoLuong(getSoLuong() + 1);
        this.setMaSP(getSoLuong());
    }

    public SanPham(String tenSP, String moTaSP, String nhaSX, double giaBan) {
        this.tenSP = tenSP;
        this.moTaSP = moTaSP;
        this.nhaSX = nhaSX;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return String.format("Ma sp: %d\nTen sp: %s\nMo ta sp: %s\nNha sx: %s\nGia ban: %.1f", getMaSP(), tenSP, moTaSP, nhaSX, giaBan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
     * @return the moTaSP
     */
    public String getMoTaSP() {
        return moTaSP;
    }

    /**
     * @param moTaSP the moTaSP to set
     */
    public void setMoTaSP(String moTaSP) {
        this.moTaSP = moTaSP;
    }

    /**
     * @return the nhaSX
     */
    public String getNhaSX() {
        return nhaSX;
    }

    /**
     * @param nhaSX the nhaSX to set
     */
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
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
     * @return the soLuong
     */
    public static int getSoLuong() {
        return soLuong;
    }

    /**
     * @param aSoLuong the soLuong to set
     */
    public static void setSoLuong(int aSoLuong) {
        soLuong = aSoLuong;
    }
    
    
}
