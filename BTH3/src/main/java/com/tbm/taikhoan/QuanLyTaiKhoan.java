/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.taikhoan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void add(TaiKhoan tk){
        this.ds.add(tk);
    }
    
    public void add(TaiKhoan ... tk){
        this.ds.addAll(Arrays.asList(tk));
    }
    
    public void show(){
        this.ds.stream().forEach(tk -> System.out.println(tk));
    }
    
    public List<TaiKhoan> traCuu(String str){
        return this.ds.stream().filter(tk -> tk.getSoTaiKhoan().contains(str)).toList();
    }
}
