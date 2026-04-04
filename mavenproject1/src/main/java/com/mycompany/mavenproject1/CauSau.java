/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class CauSau {
    public static void main(String[] args){
        PhanSo x1 = new PhanSo(1,3);
        PhanSo x2 = new PhanSo(2,3);
        PhanSo x3 = new PhanSo(5,1);
        DsPhanSo ds = new DsPhanSo();
        ds.addPhanSo(x3,x1,x2); 
        ds.removePhanSo(x3);
        ds.hienThi();
        /*   
        ds.tinhTong().hienThi();
        System.out.print('\n');
        System.out.print("So lon nhat la: ");
        ds.find(1).hienThi();
        System.out.print('\n');
        System.out.print("So nho nhat la: ");
        ds.find(-1).hienThi();
        System.out.print('\n');
        System.out.print("Sau khi sap xep: ");
        ds.sapXep(-1);
        ds.hienThi();  
        */
         
    }
}
