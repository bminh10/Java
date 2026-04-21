/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyHinh {
    private List<Object> ds = new ArrayList<>();
    
    public void addObject(Object...obj){
        this.ds.addAll(Arrays.asList(obj));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
    
    
    
    /**
     * @return the ds
     */
    public List<Object> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Object> ds) {
        this.ds = ds;
    }
    
    
    
}
