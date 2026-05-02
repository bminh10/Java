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
public class QuanLyNhanVat {
    private List<NhanVat> ds = new ArrayList<>();
    
    public void addNv(NhanVat ... nv){
        this.ds.addAll(Arrays.asList(nv));
    }
    
    public void addVatPham(NhanVat n, VatPham... vp){
        n.addVatPham(vp);
    }
    
    public void show(){
        this.ds.forEach(nv -> nv.show());
    }
    
    public void sapXep(){
        this.ds.sort((a,b) -> -Integer.compare(a.getVp().size(), b.getVp().size()));
    }
    
    public void xacDinhLuotChoi(int maNhanVat){
        NhanVat tmp = this.ds.stream().filter(nv -> nv.getMaNv() == maNhanVat).toList().get(0);
        System.out.printf("Tong so luot choi: %d",tmp.getLuotChoi());
    }
    
}
