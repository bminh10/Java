/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.test;

/**
 *
 * @author admin
 */
public class VpTangLuotChoi extends VatPham{
    private int luotChoi;
    
    public VpTangLuotChoi(int luotChoi) {
        super("A");
        this.luotChoi = luotChoi;
    }

    /**
     * @return the luotChoi
     */
    public int getLuotChoi() {
        return luotChoi;
    }

    /**
     * @param luotChoi the luotChoi to set
     */
    public void setLuotChoi(int luotChoi) {
        this.luotChoi = luotChoi;
    }
    
}
