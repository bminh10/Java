/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.nhanvien;

/**
 *
 * @author Admin
 */
public class Tester {
    public static void main(String[]args){
        NhanVien nv1 = new NhanVien("079099123456", "Nguyen Van Mot", "TP.HCM", "Nam", "0901234567", 22);
        
        // Dùng constructor 7 tham số (truyền chủ động hệ số phụ cấp, ví dụ: 1.5)
        NhanVien nv2 = new NhanVien("001099654321", "Tran Thi Hai", "Ha Noi", "Nu", "0912345678", 24);

        // 2. Test class NhanVienA
        // Có 6 tham số, bên trong tự gọi super() truyền phụ cấp là 1.2
        NhanVienA nvA = new NhanVienA("048099111222", "Le Van Ba", "Da Nang", "Nam", "0923456789", 26);

        // 3. Test class NhanVienB
        // Giả định constructor nhận 6 tham số tương tự NhanVienA
        NhanVienB nvB = new NhanVienB("092099333444", "Pham Thi Tu", "Can Tho", "Nu", "0934567890", 20);

        // 4. Test class NhanVienC
        // Giả định constructor nhận 6 tham số tương tự NhanVienA
        NhanVienC nvC = new NhanVienC("031099555666", "Hoang Van Nam", "Hai Phong", "Nam", "0945678901", 25);
        NhanVienD nvD = new NhanVienD("031099555666", "Hoang Van Sang", "Hai Phong", "Nam", "0945678901", 19);
        
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.add(nv1,nv2,nvA,nvB,nvC,nvD);
        ql.show();
        ql.tinhTienLuong();
        
    }
}
