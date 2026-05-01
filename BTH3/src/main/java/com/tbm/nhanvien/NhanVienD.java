/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.nhanvien;

/**
 *
 * @author Admin
 */
public class NhanVienD extends NhanVien{
    public NhanVienD(String CMND, String hoTen, String queQuan, String gioiTinh, String dienThoai, int soNgayCong) {
        super(CMND, hoTen, queQuan, gioiTinh, dienThoai, soNgayCong, 1.4, "D");
    }

    @Override
    public double tinhLuong() {
        return QuyDinh.LUONG * super.getSoNgayCong() + super.getTienPhuCap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
