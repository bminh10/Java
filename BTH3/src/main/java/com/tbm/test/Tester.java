/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.test;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[] agrs){
        NhanVat a = new NhanVat("Minh");
        NhanVat b = new NhanVat("Mi");
        NhanVat c = new NhanVat("Xinh");
        
        VatPham vp1 = new VpTangLuotChoi(1);
        VatPham vp3 = new VpTangLuotChoi(3);
        VatPham vp2 = new VpTangMau(23);
        
        
        QuanLyNhanVat ql = new QuanLyNhanVat();
        ql.addNv(a,b,c);
        a.addVatPham(vp1,vp2,vp3);
        ql.sapXep();
        ql.show();
        ql.xacDinhLuotChoi(1);
        
        
    }
}
