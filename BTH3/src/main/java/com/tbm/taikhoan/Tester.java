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
public class Tester {
    public static void main(String[] args){
        TaiKhoan tk2 = new TkKhongKyHan("Nguyen Van B", 20000);
        TaiKhoan tk3 = new TkCoKyHan(KyHan.MOT_TUAN,"Nguyen Van E", 20000);
        TaiKhoan tk4 = new TkCoKyHan(KyHan.MOT_THANG,"Nguyen Van C", 20000);
        TaiKhoan tk5 = new TkCoKyHan(KyHan.MOT_NAM,"Nguyen Van D", 25000);
        
        
        QuanLyTaiKhoan ds = new QuanLyTaiKhoan();
        ds.add(tk2,tk3,tk4,tk5);
        tk2.napTien(3000);
        tk3.napTien(3000);
        ds.show();
    }
}
