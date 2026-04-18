    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class Ellipse extends Hinh {
    private double bkTrucLon;
    private double bkTrucNho;

    public Ellipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }
    
    public double tinhDienTich(){
        return Math.PI * getBkTrucLon() * getBkTrucNho();
    }
    
    public double tinhChuVi(){
        return 2*Math.PI*Math.sqrt((Math.pow(this.bkTrucLon, 2) + Math.pow(this.bkTrucNho, 2))/2);
    }
    
    public String layTenHinh(){
        return "Hinh ellipse";
    }

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f",this.layTenHinh() ,this.tinhDienTich(),this.tinhChuVi()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucNho
     */
    public double getBkTrucNho() {
        return bkTrucNho;
    }

    /**
     * @param bkTrucNho the bkTrucNho to set
     */
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }
}
