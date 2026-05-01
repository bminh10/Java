/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.nhanvien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien {
    private List<NhanVien> ds = new ArrayList<>();
    
    public void add(NhanVien nv){
        this.ds.add(nv);
    }
    
    public void add(NhanVien ... nv){
        this.ds.addAll(Arrays.asList(nv));
    }
    
    public void remove(NhanVien nv){
        this.ds.remove(this.ds.indexOf(nv));
    }
    
    public void remove(String str){
        try {
            Class c = Class.forName(str);
            this.ds.removeAll(this.ds.stream().filter(nv -> c.isInstance(nv)).toList());
        } catch (Exception e) {
        }
    }
    
    public void tinhTienLuong(){
        this.ds.forEach(nv -> {
            nv.tinhTienLuong();
        });
    }
    
    public void show(){
        this.ds.forEach(nv -> System.out.println(nv));
    }
    
}
