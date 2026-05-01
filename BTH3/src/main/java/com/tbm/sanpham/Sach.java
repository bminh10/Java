/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

/**
 *
 * @author Admin
 */
public class Sach extends SanPham{
    private int soTrang;

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    public Sach(int soTrang, String tenSP, String moTaSP, String nhaSX, double giaBan) {
        super(tenSP, moTaSP, nhaSX, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return String.format("Ma sp: %d\nTen sp: %s\nMo ta sp: %s\nNha sx: %s\nGia ban: %.1f\nSo trang: %d", super.getMaSP(), super.getTenSP(), super.getMoTaSP(), super.getNhaSX(), super.getGiaBan(), this.soTrang); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
