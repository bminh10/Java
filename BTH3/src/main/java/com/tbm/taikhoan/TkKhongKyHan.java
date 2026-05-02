/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.taikhoan;

/**
 *
 * @author admin
 */
public class TkKhongKyHan extends TaiKhoan{

    public TkKhongKyHan(String tenTk, double soTienTk ) {
        super(tenTk, soTienTk);
    }

    @Override
    public boolean isDaoHan() {
        return true;
    }

    @Override
    public double tinhLai() {
        return super.getSoTienTk() + 0.1/100;
    }

    
    
    
    
}
