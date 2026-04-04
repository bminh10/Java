package com.mycompany.bth2;

public class PhanSo{
    private int tuSo;
    private int mauSo;
    
    public PhanSo(){
        tuSo = 0;
        mauSo = 1;
    }
    
    public PhanSo(int tuSo){
        this.tuSo = tuSo;
        mauSo = 1;
    }
    
    public PhanSo(int ts , int ms){
        tuSo = ts;
        mauSo = ms;
    }
    
    public void hienThi(){
        if(mauSo!=1){
            System.out.printf(
            "%d/%d" , tuSo, mauSo
            );
        }
        else{
            System.out.printf(
            "%d" , tuSo
            );
        }
    }
    
    static int timUocChungLonNhat(int a,  int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public void setTuSo(int ts){
        this.tuSo = ts;
    }
    
    public void setMauSo(int ms){
        this.mauSo = ms;
    }
    
    public int getTuSo(){
        return this.tuSo;
    }
    
    public int getMauSo(){
        return this.mauSo;
    }
    
    public double getPhanSo(){
        return this.getTuSo()/this.getMauSo();
    }
    
    public void rutGonPhanSo(){
        int u = timUocChungLonNhat(this.tuSo, this.mauSo);
        setTuSo(getTuSo()/u);
        setMauSo(getMauSo()/u);
    }
    
    public PhanSo cong(PhanSo ps) {
        int tuMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mauMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuMoi, mauMoi);
    }
    
    public PhanSo tru(PhanSo ps) {
        int tuMoi = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mauMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuMoi, mauMoi);
    }
    
    public PhanSo nhan(PhanSo ps) {
        int tuMoi = this.tuSo * ps.tuSo;
        int mauMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuMoi, mauMoi);
    }
    
    public PhanSo chia(PhanSo ps) {
        int tuMoi = this.tuSo * ps.mauSo;
        int mauMoi = this.mauSo * ps.tuSo;
        return new PhanSo(tuMoi, mauMoi);
    }
    
    public boolean bangNhau(PhanSo ps) {
        return this.tuSo * ps.mauSo == ps.tuSo * this.mauSo;
    }
    
    public boolean lonHon(PhanSo ps) {
        return this.tuSo * ps.mauSo > ps.tuSo * this.mauSo;
    }
    
    public boolean beHon(PhanSo ps) {
        return this.tuSo * ps.mauSo < ps.tuSo * this.mauSo;
    }
}