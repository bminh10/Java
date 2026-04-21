/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.util.stream.DoubleStream;
/**
 *
 * @author Admin
 */
public class HocVien {
    private int maHV;
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;
    private double[] diem;
    private static int soLuong = 0 ;
    
    {
        soLuong++;
        this.setMaHV(soLuong);
    }
    
    public HocVien(String hoTen , LocalDate ngaySinh){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }
    public HocVien(String hoTen , String ngaySinh){
        this(hoTen, LocalDate.parse(ngaySinh, CauHinh.FORMATTER));
    }
    
    public void nhapDiem(){
        System.out.printf("\nNhap cho %s\n", this.hoTen);
        this.setDiem(new double[CauHinh.SO_MON]);
        for(int i = 0 ; i < CauHinh.SO_MON ; i++){
            System.out.printf("Mon thu %d = ", i + 1);
            this.getDiem()[i] = CauHinh.SC.nextDouble();
        }
        
    }
    
    public boolean isHocBong(){
        if(this.diem != null){
            for (var d : this.diem){
                if (d < 5)
                    return false;
            }
            return this.getDTB() >=8;
        }
        return false;
    }
    
    public double getDTB(){
        if(this.diem != null){
            return DoubleStream.of(this.diem).average().getAsDouble();
        }
        return 0;
    }
    
    public void show(){
        System.out.printf("%d - %s - %s\n", this.getMaHV(), this.getHoTen(), this.getNgaySinh().format(CauHinh.FORMATTER));
        if(this.diem!=null){
            for(var d: this.diem){
               System.out.printf("%.1f\t", d);
               System.out.printf("%n");
            }
            System.out.printf("%nDTB: %f%n", this.getDTB());
            
        }
    }
    
    public int compareDiem(HocVien a , HocVien b){
    
    }

    /**
     * @return the maHV
     */
    public int getMaHV() {
        return maHV;
    }

    /**
     * @param maHV the maHV to set
     */
    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }



}
