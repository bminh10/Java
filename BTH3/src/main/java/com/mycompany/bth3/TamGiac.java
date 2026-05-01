/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth3;

/**
 *
 * @author Admin
 */
public class TamGiac extends Hinh{
    private double a,b,c;
    private String name;
    public boolean isTamGiac(double a, double b , double c){
        return a + b > c && a + c > b && c + b > a;
    }
    
    public TamGiac(double a, double b , double c){
        if(isTamGiac(a,b,c)){
            this.a = a;
            this.b = b;
            this.c = c;
            this.name = "Tam Giac";
        }
        else{
            System.out.println("Khong phai tam giac");
        }
    }
    public double tinhChuVi(){
        return (this.a + this.b + this.c)/2;
    }
    public double tinhDienTich(){
        double p = this.tinhChuVi();
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    
    public TamGiac(double a, double b , double c, String name){
        if(isTamGiac(a,b,c)){
            this.a = a;
            this.b = b;
            this.c = c;
            this.name = name;
        }
        else{
            System.out.println("Khong phai tam giac");
        }
    }

    @Override
    public String toString() {
        return String.format("Hinh %s", this.name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
