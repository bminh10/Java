/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.nhanvien;

/**
 *
 * @author Admin
 */

/* thông tin số mã số, chứng minh nhân dân, 
họ tên, quê quán, giới tính, số điện thoại liên lạc. Trong đó mã số là số nguyên tự động 
tăng mỗi khi thêm nhân viên mới.  */
public class NhanVien {
    private int maSo;
    private String CMND;
    private String hoTen;
    private String queQuan;
    private String gioiTinh;
    private String dienThoai;
    private int soNgayCong;
    private double tienPhuCap;
    private static int soLuong = 0;
    private String boPhan = "Khong co";
    
    
    {
       soLuong++;
       maSo = soLuong;
    }
    public NhanVien(String CMND, String hoTen, String queQuan, String gioiTinh, String dienThoai, int soNgayCong, String boPhan) {
        this.CMND = CMND;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.soNgayCong = soNgayCong;
        this.tienPhuCap = 1;
        this.boPhan = boPhan;
    }
    
    public NhanVien(String CMND, String hoTen, String queQuan, String gioiTinh, String dienThoai, int soNgayCong, double tienPhuCap, String boPhan) {
        this.CMND = CMND;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.soNgayCong = soNgayCong;
        this.tienPhuCap = tienPhuCap;
        this.boPhan = boPhan;
    }
    public NhanVien(String CMND, String hoTen, String queQuan, String gioiTinh, String dienThoai, int soNgayCong) {
        this.CMND = CMND;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.soNgayCong = soNgayCong;
        this.tienPhuCap = 1;
    }
    
    public NhanVien(String CMND, String hoTen, String queQuan, String gioiTinh, String dienThoai, int soNgayCong, double tienPhuCap) {
        this.CMND = CMND;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.soNgayCong = soNgayCong;
        this.tienPhuCap = tienPhuCap;
    }
    
    public double tinhLuong(){
        return this.tienPhuCap*QuyDinh.LUONG * this.soNgayCong;
    }   
    
    public void tinhTienLuong(){
        System.out.print("Nhap ngay cong cua nhan vien " + this.hoTen + ": ");
        this.soNgayCong = CauHinh.scanner.nextInt();
        System.out.println();
        System.out.printf("Ma so: %s\nHo ten: %s\nSo ngay cong: %d\nTien luong: %.2f\n",this.maSo, this.hoTen, this.soNgayCong, this.tinhLuong());
        
    }

    @Override
    public String toString() {
        return String.format("Ma so: %d\nCMND: %s\nHo ten: %s\nQue quan: %s\nGioi tinh: %s\nDien thoai: %s\nBo phan: %s", this.maSo, this.CMND, this.hoTen,this.queQuan,this.gioiTinh,this.dienThoai,this.boPhan);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    

    /**
     * @return the maSo
     */
    public int getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    /**
     * @return the CMND
     */
    public String getCMND() {
        return CMND;
    }

    /**
     * @param CMND the CMND to set
     */
    public void setCMND(String CMND) {
        this.CMND = CMND;
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
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the dienThoai
     */
    public String getDienThoai() {
        return dienThoai;
    }

    /**
     * @param dienThoai the dienThoai to set
     */
    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    /**
     * @return the soNgayCong
     */
    public int getSoNgayCong() {
        return soNgayCong;
    }

    /**
     * @param soNgayCong the soNgayCong to set
     */
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    /**
     * @return the tienPhuCap
     */
    public double getTienPhuCap() {
        return tienPhuCap;
    }

    /**
     * @param tienPhuCap the tienPhuCap to set
     */
    public void setTienPhuCap(double tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }

    /**
     * @return the boPhan
     */
    public String getBoPhan() {
        return boPhan;
    }

    /**
     * @param boPhan the boPhan to set
     */
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }
}
