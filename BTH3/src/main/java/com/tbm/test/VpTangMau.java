/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.test;

/**
 *
 * @author admin
 */
public class VpTangMau extends VatPham{
    private double hp;
    
    public VpTangMau(double hp) {
        super("B");
        this.hp = hp;
    }

    /**
     * @return the hp
     */
    public double getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(double hp) {
        this.hp = hp;
    }
    
}
