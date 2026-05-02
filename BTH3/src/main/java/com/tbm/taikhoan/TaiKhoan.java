    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.taikhoan;

/**
 *
 * @author admin
 */

public abstract class TaiKhoan {
    private static int dem;
    private String soTk;
    private String tenTk;
    private double soTienTk;
    
    {
        this.soTk = String.format("%06d", ++dem);
    }

    public TaiKhoan( String tenTk, double soTienTk) {
        this.tenTk = tenTk;
        this.soTienTk = soTienTk;
    }
    
    public void show(){
        System.out.printf("%s - %s\n%.1f\n", this.soTk, this.tenTk, this.soTienTk);
    }
    
    public abstract boolean isDaoHan();
    public abstract double tinhLai();
    
    public void napTien(double tien){
        if(isDaoHan()){
            this.soTienTk += tien;
        }
    }
    
    public void rutTien(double tien){
        if(isDaoHan() && Double.compare(this.soTienTk, tien) >= 0){
            this.soTienTk-= tien;
        }
        else{
            System.out.println("Khong the rut tien vi so du khong du");
        }
    }
     
    

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @param soTk the soTk to set
     */
    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    /**
     * @return the tenTk
     */
    public String getTenTk() {
        return tenTk;
    }

    /**
     * @param tenTk the tenTk to set
     */
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    /**
     * @return the soTienTk
     */
    public double getSoTienTk() {
        return soTienTk;
    }

    /**
     * @param soTienTk the soTienTk to set
     */
    public void setSoTienTk(double soTienTk) {
        this.soTienTk = soTienTk;
    }
}
