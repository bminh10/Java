/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth2;
import java.util.ArrayList;
import java.util.Collections;

public class DsPhanSo {
    private ArrayList<PhanSo> ds = new ArrayList<PhanSo>();
    //them mot phan so vao danh sach
    
    public void addPhanSo(PhanSo x){
        this.ds.add(x);
    }
    
    public void hienThi(){
        for (PhanSo ps: ds){
            ps.hienThi();
            System.out.print(' ');
        }
        System.out.print('\n');
    }
    
    
    public void removePhanSo(int index){
        ds.remove(index);
    }
    
    public void removePhanSo(PhanSo ps){
        this.ds.remove(ds.indexOf(ps));
    }
    
    public void removePhanSo(int tuSo, int mauSo){
        this.ds.remove(ds.indexOf(new PhanSo(tuSo,mauSo)));
    }
    
    public PhanSo tinhTong(){
        PhanSo res = new PhanSo(0, 1);

        for (int i = 0; i < ds.size(); i++){
            int tuMoi = res.getTuSo() * ds.get(i).getMauSo() 
                      + ds.get(i).getTuSo() * res.getMauSo();

            int mauMoi = res.getMauSo() * ds.get(i).getMauSo(); 

            res = new PhanSo(tuMoi, mauMoi);
            res.rutGonPhanSo();
        }

        return res;
    }
    
    public PhanSo find(int dieuKien){
        PhanSo tmp = this.ds.get(0);
        for (int i = 1 ; i < this.ds.size() ; i++){
            float a = tmp.getTuSo() / tmp.getMauSo();
            float b = this.ds.get(i).getTuSo() / this.ds.get(i).getMauSo();
            if(dieuKien == 1){
               if(Float.compare(a,b) < 0 ){
                   tmp = this.ds.get(i);
               }
            }
            else{
                if(Float.compare(a,b) > 0 ){
                  tmp = this.ds.get(i);
               }
            }
        }
        return tmp;
    }
    
    public int compare(PhanSo a , PhanSo b){
        float num1 = a.getTuSo() / a.getMauSo();
        float num2 = b.getTuSo() / b.getMauSo();
        int res = Float.compare(num1,num2);
        return res;
    }
    
    public void sapXep(int thuTu){
        if(thuTu == 1){
            this.ds.sort((PhanSo a , PhanSo b)-> {
                return this.compare(a, b);
            });
        }
        else{
            this.ds.sort((PhanSo a , PhanSo b)-> {
                return this.compare(a, b);
            });
            Collections.reverse(this.ds);
        }
    }
    
}
    