/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.taikhoan;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public enum KyHan {
    MOT_TUAN(7){
        @Override
        public LocalDate tinhDaoHan() {
            return LocalDate.now().plusDays(this.description); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public double getLai() {
            return 0.5/100; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    },
    MOT_THANG(1){
        @Override
        public LocalDate tinhDaoHan() {
            return LocalDate.now().plusMonths(this.description); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public double getLai() {
            return 4.5/100; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    },
    MOT_NAM(1){
        @Override
        public LocalDate tinhDaoHan() {
            return LocalDate.now().plusYears(this.description); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        @Override
        public double getLai() {
            return 6.8/100; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    };
    
    protected int description;
    
    private KyHan(int description){
        this.description = description;
    }

    public int getDescription() {
        return description;
    }
    
    public LocalDate tinhDaoHan(){
        return LocalDate.now();
    };
    
    public double getLai(){
        return 1;
    }
    
}
