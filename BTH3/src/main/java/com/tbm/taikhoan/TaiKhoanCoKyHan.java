/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.taikhoan;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class TaiKhoanCoKyHan extends TaiKhoan {
    private LocalDate ngayMoSo;
    private LocalDate ngayDaoHan;
    private String kyHan;
    
    
    public TaiKhoanCoKyHan( String tenTaiKhoan, String dienThoai, String email, double soTienTaiKhoan, LocalDate ngayTaoTaiKhoan, String trangThai, String kyHan, LocalDate ngayMoSo) {
        super(tenTaiKhoan, dienThoai, email, soTienTaiKhoan, ngayTaoTaiKhoan, trangThai);
        this.kyHan = kyHan;
        this.ngayMoSo = ngayMoSo;
        if(this.kyHan.equals(QuanLyKyHan.KyHan.MOT_TUAN.getDescription())){
            this.ngayDaoHan = this.ngayMoSo.plusDays(7);
        }
        if(this.kyHan.equals(QuanLyKyHan.KyHan.MOT_THANG.getDescription())){
            this.ngayDaoHan = this.ngayMoSo.plusMonths(1);
        }
        if(this.kyHan.equals(QuanLyKyHan.KyHan.MOT_NAM.getDescription())){
            this.ngayDaoHan = this.ngayMoSo.plusYears(365);
        }
    }
    
    public TaiKhoanCoKyHan( String tenTaiKhoan, String dienThoai, String email, double soTienTaiKhoan, LocalDate ngayTaoTaiKhoan, String trangThai, String kyHan, String ngayMoSo) {
        this(tenTaiKhoan, dienThoai, email, soTienTaiKhoan, ngayTaoTaiKhoan, trangThai, kyHan, LocalDate.parse(ngayMoSo, CauHinh.FORMATTER));
    }
    @Override
    public String toString() {
        return String.format("Ma tk: %s\nTen tk: %s\nDien thoai: %s\nEmail: %s\nSo Tien: %.3f\nNgay tao tk: %s\nTrang thai: %s\nKy han: %s\nNgay mo so: %s\nNgay dao han:  %s", super.getSoTaiKhoan(), super.getTenTaiKhoan(), super.getDienThoai(), super.getEmail(), super.getSoTienTaiKhoan(),super.getNgayTaoTaiKhoan().format(CauHinh.FORMATTER),super.getTrangThai(), this.kyHan,this.ngayMoSo, this.ngayDaoHan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

    
