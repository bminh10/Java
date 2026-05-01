/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth3;

/**
 *
 * @author Admin
 */
public class Elipse extends Hinh{
    private String name;
    private double bkTrucLon;
    private double bkTrucNho;
    
    public Elipse(double bkTrucLon, double bkTrucNho){
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
        this.name = "Elipse";
    }
    public Elipse(double bkTrucLon, double bkTrucNho, String name){
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
        this.name = name;
    }
    public double tinhDienTich(){
        return Math.PI * this.bkTrucLon * this.bkTrucNho;
    }
    
    public double tinhChuVi(){
        return 2*Math.PI * Math.sqrt((Math.pow(bkTrucLon, 2) + Math.pow(bkTrucNho, 2))/2);
    }

    @Override
    public String toString() {
        return String.format("Hinh %s\nDien tich: %.1f\nChu vi: %.1f\n", this.getName(), tinhDienTich(), tinhChuVi()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
