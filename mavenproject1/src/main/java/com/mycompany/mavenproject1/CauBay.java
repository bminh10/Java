/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class CauBay {   
    public static void main(String[] args) throws FileNotFoundException{
        
        
        HocVien hv1 = new HocVien("Nguyen Van A", "04/02/2000");
        HocVien hv2 = new HocVien("Nguyen Van B", LocalDate.of(2003,2,4));
        HocVien hv3 = new HocVien("Nguyen Van C", LocalDate.of(2003,2,4));
        
        QuanLyHocVien ql = new QuanLyHocVien();
        ql.themHocVien(hv1,hv2,hv3);
        //ql.themHocVien("src/main/resources/HocVien.txt");
        System.out.println("----");
        ql.nhapDiem();
        ql.hienThi();
        
        System.out.println("----");
        for (var d : ql.timKiem()){
            d.show();
        }   
    }
}   
    