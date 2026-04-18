/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();

    public void addSanPham(SanPham sp){
        this.ds.add(sp);
    }
    
    public void addSanPham(SanPham ... sp){
        this.ds.addAll(Arrays.asList(sp));
    }
    
    public void removeSanPham(SanPham sp){
        this.ds.remove(sp);
    }
    
    public void show(){
        this.ds.forEach(sp -> sp.show());
    }
    
    public List<SanPham> timKiem(String str){
        try {
            Class c = Class.forName(str);
            
            return this.ds.stream().filter(sp -> c.isInstance(sp) ).collect(Collectors.toList());
        } catch (ClassNotFoundException ex) {
            return this.ds.stream().filter(sp -> sp.getTenSP().contains(str)).collect(Collectors.toList());
        }
    }
    
    
    
    public void sort(){
        this.ds.sort((sp1, sp2) -> -Double.compare(sp1.getGiaBan(), sp2.getGiaBan()));
    }
    
    public void sort2(){
        
        
        this.ds.sort((sp1, sp2) -> {
            if(sp1.getTenSP().equals(sp2.getTenSP()))
                return -Double.compare(sp1.getGiaBan(), sp2.getGiaBan());
            return sp1.getTenSP().compareTo(sp2.getTenSP());
        });
    }
    
    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
    
    
}
