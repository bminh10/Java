/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham {
    private int thoiGianPhat;

    public BangDia(int thoiGianPhat, String tenSP, double giaBan) {
        super(tenSP, giaBan);
        this.thoiGianPhat = thoiGianPhat;
    }
    
     @Override
    public void show() {
        System.out.printf("Ma SP: %d\nTen SP: %s\nGia ban: %.1f\nThoi gian phat: %d\n", super.getMaSP(), super.getTenSP(),super.getGiaBan(),this.thoiGianPhat);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    /**
     * @return the thoiGianPhat
     */
    public int getThoiGianPhat() {
        return thoiGianPhat;
    }

    /**
     * @param thoiGianPhat the thoiGianPhat to set
     */
    public void setThoiGianPhat(int thoiGianPhat) {
        this.thoiGianPhat = thoiGianPhat;
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
