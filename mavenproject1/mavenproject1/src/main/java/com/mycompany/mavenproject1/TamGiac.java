/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class TamGiac extends Hinh {
    private double a;
    private double b;
    private double c;
    
    public final boolean isHopLe(){
        if(a < 0 || b < 0 || c < 0){
            return false;
        }
        return (Double.compare(this.a + this.b, this.c) > 0) && (Double.compare(this.a + this.c, this.b) > 0) && (Double.compare(this.b + this.c, this.a) > 0);
    }

    public TamGiac(double a, double b, double c) {

            this.a = a;
            this.b = b;
            this.c = c;
    }
    
    public double tinhChuVi(){
        return (this.a + this.b + this.c)/2;
    }

    public double tinhDienTich(){
        double p = this.tinhChuVi();
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    
    public String layTenHinh(){
        return "Hinh tam giac";
    }

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f",this.layTenHinh(), this.tinhDienTich(), this.tinhChuVi()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void show(){
        System.out.printf("%.1f %.1f %.1f", this.a, this.b, this.c);
    }
    
    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
    
    
}
