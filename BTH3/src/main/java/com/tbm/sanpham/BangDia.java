/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

import java.time.LocalDate;


/**
 *
 * @author Admin
 */
public class BangDia extends SanPham{
    private LocalDate thoiGianPhat;

    public BangDia(LocalDate thoiGianPhat, String tenSP, String moTaSP, String nhaSX, double giaBan) {
        super( tenSP, moTaSP, nhaSX, giaBan);
        this.thoiGianPhat = thoiGianPhat;
    }
    
    public BangDia(String thoiGianPhat, String tenSP, String moTaSP, String nhaSX, double giaBan) {
        this(LocalDate.parse(thoiGianPhat, CauHinh.FORMATTER) ,tenSP, moTaSP, nhaSX, giaBan);
    }
    
    @Override
    public String toString() {
        return String.format("Ma sp: %d\nTen sp: %s\nMo ta sp: %s\nNha sx: %s\nGia ban: %.1f\nThoi gian phat: %s", super.getMaSP(), super.getTenSP(), super.getMoTaSP(), super.getNhaSX(), super.getGiaBan(), this.thoiGianPhat.format(CauHinh.FORMATTER)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    /**
     * @return the thoiGianPhat
     */
    public LocalDate getThoiGianPhat() {
        return thoiGianPhat;
    }

    /**
     * @param thoiGianPhat the thoiGianPhat to set
     */
    public void setThoiGianPhat(LocalDate thoiGianPhat) {
        this.thoiGianPhat = thoiGianPhat;
    }
    
    
}
