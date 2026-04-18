/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

/**
 *
 * @author admin
 */
public class Sach extends SanPham{
    private int soTrang;

    public Sach(int soTrang, String tenSP, double giaBan) {
        super(tenSP, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public void show() {
        System.out.printf("Ma SP: %d\nTen SP: %s\nGia ban: %.1f\nSo trang: %d\n", super.getMaSP(), super.getTenSP(),super.getGiaBan(),this.soTrang);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    /**
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
