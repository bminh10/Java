/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author admin
 */
public class Mavenproject1 {
    public static void main(String[] args) {
        String dateString = "19-12-2024";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d = new Date();
        SimpleDateFormat f
        = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(f.format(d));
        
    }
}
