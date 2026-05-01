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
public class TaiKhoan {
    private String soTaiKhoan;
    private String tenTaiKhoan;
    private String dienThoai;
    private String email;
    private double soTienTaiKhoan;
    private LocalDate ngayTaoTaiKhoan;
    private String trangThai;
    private static int soLuong = 0;
    {
        soLuong++;
        soTaiKhoan = String.format("%05d", soLuong);
    }

    public TaiKhoan( String tenTaiKhoan, String dienThoai, String email, double soTienTaiKhoan, LocalDate ngayTaoTaiKhoan, String trangThai) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.dienThoai = dienThoai;
        this.email = email;
        this.soTienTaiKhoan = soTienTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return String.format("Ma tk: %s\nTen tk: %s\nDien thoai: %s\nEmail: %s\nSo Tien: %.3f\nNgay tao tk: %s\nTrang thai: %s", this.soTaiKhoan, this.tenTaiKhoan, this.dienThoai, this.email, this.soTienTaiKhoan,this.ngayTaoTaiKhoan.format(CauHinh.FORMATTER),this.trangThai); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
//LocalDate.parse(ngayTaoTaiKhoan, CauHinh.FORMATTER)
    
    /**
     * @return the soTaiKhoan
     */
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    /**
     * @param soTaiKhoan the soTaiKhoan to set
     */
    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    /**
     * @return the tenTaiKhoan
     */
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    /**
     * @param tenTaiKhoan the tenTaiKhoan to set
     */
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    /**
     * @return the dienThoai
     */
    public String getDienThoai() {
        return dienThoai;
    }

    /**
     * @param dienThoai the dienThoai to set
     */
    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the soTienTaiKhoan
     */
    public double getSoTienTaiKhoan() {
        return soTienTaiKhoan;
    }

    /**
     * @param soTienTaiKhoan the soTienTaiKhoan to set
     */
    public void setSoTienTaiKhoan(double soTienTaiKhoan) {
        this.soTienTaiKhoan = soTienTaiKhoan;
    }

    /**
     * @return the ngayTaoTaiKhoan
     */
    public LocalDate getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    /**
     * @param ngayTaoTaiKhoan the ngayTaoTaiKhoan to set
     */
    public void setNgayTaoTaiKhoan(LocalDate ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    /**
     * @return the trangThai
     */
    public String getTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
    
}
