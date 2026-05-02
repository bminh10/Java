/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVat {
    private int maNv;
    private String tenNv;
    private List<VatPham> vp = new ArrayList<>();
    private double hp = 75;
    private int luotChoi = 1;
    private static int dem;
    
    {
        dem++;
        this.maNv = dem;
    }

    public NhanVat( String tenNv) {
        this.tenNv = tenNv;
    }
    
    public void show(){
        System.out.printf("Ma nv: %d\nTen nv: %s\n",this.maNv, this.tenNv);
        this.vp.forEach(v -> v.show());
    }
    public void addVatPham(VatPham ...vp){
        this.getVp().addAll(Arrays.asList(vp));
        for(VatPham v : this.getVp()){
           if(v instanceof VpTangLuotChoi vpTangLuotChoi){
                setLuotChoi(getLuotChoi() + vpTangLuotChoi.getLuotChoi());
           }
        }
    }
    
    
    

    /**
     * @return the maNvs
     */
    public int getMaNv() {
        return maNv;
    }

    /**
     * @param maNv the maNv to set
     */
    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    /**
     * @return the tenNv
     */
    public String getTenNv() {
        return tenNv;
    }

    /**
     * @param tenNv the tenNv to set
     */
    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    /**
     * @return the vp
     */
    public List<VatPham> getVp() {
        return vp;
    }

    /**
     * @param vp the vp to set
     */
    public void setVp(List<VatPham> vp) {
        this.vp = vp;
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
