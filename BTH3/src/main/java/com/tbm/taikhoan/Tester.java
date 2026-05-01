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
public class Tester {
    public static void main(String[] args){
        TaiKhoan tk1 = new TaiKhoan("abc", "123", "minh@gmail.com", 123, LocalDate.now(), "Dang mo");
        TaiKhoan tk2 = new TaiKhoan("abc", "123", "mi@gmail.com", 144, LocalDate.now(), "Dang mo");
        TaiKhoanCoKyHan tk3 = new TaiKhoanCoKyHan("abc", "1234", "m@ou.edu", 155, LocalDate.now(), "Dang mo", QuanLyKyHan.KyHan.MOT_TUAN.getDescription(), "12/12/2003");
        TaiKhoanCoKyHan tk4 = new TaiKhoanCoKyHan("abc", "1234", "m@ou.edu", 155, LocalDate.now(), "Dang mo", QuanLyKyHan.KyHan.MOT_THANG.getDescription(), "12/12/2003");
        
        QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
        ql.add(tk1,tk2,tk3,tk4);
        ql.show();
        ql.traCuu("00001").forEach(tk -> System.out.println(tk));
        
    }
}
