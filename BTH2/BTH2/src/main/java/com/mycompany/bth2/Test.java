/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;

/**
 *
 * @author Admin
 */
public class Test {
    private int x, y;
    private Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Test() {
        this(6, 8);
    }
    public void hienThi() {
        System.out.println(x + y);
    }
    
    public static void main(String[] args){
        Test a2 = new Test();
        a2.hienThi();
    }
}
