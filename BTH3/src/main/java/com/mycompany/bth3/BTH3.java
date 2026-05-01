/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bth3;

/**
 *
 * @author Admin
 */
public class BTH3 {
    public static void main(String[] args) {
        Elipse e = new Elipse(2,3);
        Circle c = new Circle(3);
        TamGiac tg = new TamGiac(3,3,5);
        TamGiacCan tgc = new TamGiacCan(2,2);
        TamGiacDeu tgd = new TamGiacDeu(2);
        QuanLyHinh ds = new QuanLyHinh();
        ds.add(e,c,tg,tgc,tgd);
        ds.sapXep();
        ds.show();
        
        
    }
}
