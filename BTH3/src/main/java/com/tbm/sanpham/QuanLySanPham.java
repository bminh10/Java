/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.sanpham;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();
    
    public void add(SanPham sp){
        this.ds.add(sp);
    }
    
    public void add(SanPham ... sp){
        this.ds.addAll(Arrays.asList(sp));
    }
    
    public void del(SanPham sp){
        this.ds.remove(this.ds.indexOf(sp));
    }
    
    public void del(SanPham...sp){
        this.ds.removeAll(Arrays.asList(sp));
    }
    
    public List<SanPham> timKiem(String str){
        try {
            Class c = Class.forName(str);
            return this.ds.stream().filter(sp -> c.isInstance(sp)).toList();
        } catch (ClassNotFoundException ex) {
            return this.ds.stream().filter(sp -> sp.getTenSP().contains(str)).toList();
        }
    }
    

    public void show(){
        this.ds.forEach(sp -> System.out.println(sp));
    }
    
    public void sort(int result){
        this.ds.sort((a,b) -> {
            if(result == 1){
                return Double.compare(a.getGiaBan(), b.getGiaBan());
            }
            return -Double.compare(a.getGiaBan(), b.getGiaBan());
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
