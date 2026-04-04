/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class HocVien {
    private int maHV;
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;
    private float[] diem;
    private static int soLuong = 0 ;
    
    {
        soLuong++;
        this.maHV = soLuong;
    }
    
    public void show(){
        System.out.print(this.maHV);
    }
}
