/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

/**
 *
 * @author Admin
 */
public class TestSanPham {
    public static void main(String[] args){
        SanPham sp1 = new SanPham("iPhone 7 Plus");
        SanPham sp2 = new SanPham("Galaxy Note 9", 21);
        sp1.show();
        sp2.show();
        System.out.println("-> Tổng SP: " + SanPham.getDem());
    }
}
