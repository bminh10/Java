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
 * @author admin
 */
public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<> ();
    
    public void add(TaiKhoan ... tk){
        this.ds.addAll(Arrays.asList(tk));
    }
    
    public List<TaiKhoan> traCuu(String str){
        return this.ds.stream().filter(tk -> tk.getSoTk().contains(str)).toList();
    }
    
    public void show(){
        this.ds.forEach(tk -> tk.show());
    }
    
    public List<TaiKhoan> timKiem(String kw){
        return this.ds.stream().filter(tk -> tk.getSoTk().equals(kw) || tk.getTenTk().contains(kw)).toList();
        //Nếu có tìm các tài khoản loại abc, ... cần có try catch
    }
    
}
