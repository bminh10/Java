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
public class Tester {
    public static void main(String []args){
       SanPham sp = new SanPham( "Sua tam", "abc", "abc", 123000);
       Sach sach1 = new Sach(100, "Trinh tham", "abc", "abc", 140000);
       BangDia bd1 = new BangDia("22/12/2003", "Dia CD", "Dia cung", "abc", 160000);
       
       
       QuanLySanPham ql = new QuanLySanPham();
       ql.add(sp,sach1,bd1);
       ql.timKiem("com.tbm.sanpham.Sach").forEach(ten -> System.out.println(ten));
       ql.sort(1);
       ql.show();
       ql.sort(-1);
       ql.show();
    }
}
