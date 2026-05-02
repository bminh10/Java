    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.test;

/**
 *
 * @author admin
 */
public abstract class VatPham {
    private String maVp;
    private static int dem;
    {
        dem++;
    }
    
    public VatPham(String maVp) {
        this.maVp = String.format("%s%02d", maVp, dem);
    }
    
    public void show(){
        System.out.printf("Ma vp: %s\n",this.maVp);
    }
    
}
