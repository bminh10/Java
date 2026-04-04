/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLyHocVien {
    private List<HocVien> ds = new ArrayList<>();
    
    public void themHocVien(HocVien... hv){
        this.ds.addAll(Arrays.asList(hv));
    }
    
    public void themHocVien(String tapTin) throws FileNotFoundException{
        File f = new File(tapTin);
        try( Scanner sc = new Scanner(f) ){
            while(sc.hasNext()){
                this.ds.add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }
    
    public void nhapDiem(){
        this.ds.forEach(h -> h.nhapDiem());
    }
    
    void hienThi(){
        this.ds.forEach(hv -> {
            hv.show();
        });
    }

    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
    
    public HocVien timKiem(int id){
        return this.ds.stream().filter(hv ->
            hv.getMaHV() == id
        ).findFirst().get();
    }
    
    public List<HocVien> timKiem(String tuKhoa){
        return this.ds.stream().filter(h -> h.getHoTen().contains(tuKhoa)).collect(Collectors.toList());
    }
    public List<HocVien> timKiem(){
        return this.ds.stream().filter(h -> h.isHocBong()).collect(Collectors.toList());
    }
    
    public int compareDiem(HocVien a , HocVien b){
        //return Double.compare(a.)
        return 0;
    }
    
    public void writeFile(String tapTin){
        try(FileOutputStream output = new FileOutputStream(tapTin)) {
            output.write(tapTin.getBytes());
            System.out.println("Successfully wrote to files");
        } catch (Exception e) {
        }
    }
    
    public void sapXep(){
        //this.ds.sort((HocVien a, HocVien b) -> );
    }
    
    
}
