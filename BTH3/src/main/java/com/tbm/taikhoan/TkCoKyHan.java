/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.taikhoan;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TkCoKyHan extends TaiKhoan{
    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TkCoKyHan(KyHan kyHan, String tenTk, double soTienTk) {
        super(tenTk, soTienTk);
        this.kyHan = kyHan;
        this.ngayDaoHan = kyHan.tinhDaoHan();
    }
    
    @Override
    public void show() {
        super.show();
        System.out.printf("Ky han: %s\nNgay dao han: %s\n", this.kyHan, this.getNgayDaoHan().format(CauHinh.FORMATTER));// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isDaoHan() {
        return this.getNgayDaoHan().compareTo(LocalDate.now()) == 0;
    }

    /**
     * @return the ngayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

    @Override
    public double tinhLai() {
        return this.getSoTienTk() + this.kyHan.getLai();
    }
    
    
    
}
