/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[]args){
        SanPham sp1 = new Sach(100,"CSDL", 120);
        SanPham sp2 = new Sach(100,"CSLT", 120);
        SanPham sp3 = new BangDia(80,"CSDL", 100);

        QuanLySanPham ql = new QuanLySanPham();
        ql.addSanPham(sp1,sp2,sp3);
        ql.show();
        System.out.println("============SACH=================");
        ql.timKiem("com.tbm.sanpham.Sach").forEach(s -> s.show());
        System.out.println("============BangDia=================");
        ql.timKiem("com.tbm.sanpham.BangDia").forEach(s -> s.show());
        
        System.out.println("============SORT 2=================");
        ql.sort2();
        ql.show();
        
    }
    
}
