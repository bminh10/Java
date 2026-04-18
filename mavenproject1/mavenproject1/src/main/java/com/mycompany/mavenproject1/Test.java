/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Test {

    public static void main(String[] args) {
        
        
        Ellipse e1 = new Ellipse(2,3);
        Ellipse e2 = new Circle(4);
        /*
        System.out.println(e1);
        System.out.println(e2);
        */
        
        TamGiac tg1 = new TamGiac(5, 7, 6);
        TamGiac tg2 = new TamGiacCan(5,6);
        TamGiac tg3 = new TamGiacDeu(5);
        
        Hinh[] obj = {tg1,tg2,tg3,e1,e2};
        Arrays.sort(obj,(h1,h2) -> Double.compare(h1.tinhDienTich(), h2.tinhDienTich()));
        for(Hinh j : obj){
            System.out.println(j);
        }
        
    }   
}
