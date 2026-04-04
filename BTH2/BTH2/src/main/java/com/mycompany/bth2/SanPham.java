/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private float giaSP;
    static int soLuong = 0;
    
    public SanPham(String tenSP){
        this.tenSP = tenSP;
        this.giaSP = 0f;
        soLuong++;
        this.maSP = "SP0000" + soLuong;
    }
    
    public SanPham(String tenSP, float giaSP){
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        soLuong++;
        this.maSP = "SP0000" + soLuong;
    }
    
    public void show(){
        System.out.printf("Ma san pham: %s%n", this.maSP);
        System.out.printf("Ten san pham: %s%n", this.tenSP);
        if(Float.compare(this.giaSP, 0) != 0){
            System.out.printf("Gia san pham: %.1f triệu%n", this.giaSP);
        }
    }
    
    static int getDem(){
        return soLuong;
    }
    
}
