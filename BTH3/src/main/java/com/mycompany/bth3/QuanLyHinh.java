/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLyHinh {
    private List<Hinh> ds = new ArrayList<>();
    
    public void add(Hinh ... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void sapXep(){
        Collections.sort(ds, (Hinh h1, Hinh h2) -> -Double.compare(h1.tinhDienTich(),h2.tinhDienTich()));
    }
    
    public void show(){
        this.ds.forEach(h -> System.out.println(h.tinhDienTich()));
    }
}
