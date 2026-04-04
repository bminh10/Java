
public class HinhTron {
    private Diem toaDoTam;
    private double banKinh;
    
    public HinhTron(Diem toaDo, double bk){
        toaDoTam = toaDo;
        banKinh = bk;
    }
    
    public void hienThi(){
        System.out.printf(
            "Dien tich hinh tron: (%.1f)\nChu vi hinh tron: (%.1f)\n",
            tinhDienTichHinhTron(),
            tinhChuViHinhTron()
        );
    }
    
    public double tinhDienTichHinhTron(){
        return Math.PI * Math.pow(banKinh,2);
    }
    
    public double tinhChuViHinhTron(){
        return 2 * Math.PI * banKinh; 
    }
    
    public Diem getToaDoTam(){
        return toaDoTam;
    }
    
    public double getBanKinh(){
        return banKinh;
    }
    
    public double tinhViTriTuongDoiCuaMotDiem(Diem toaDo){
        return Math.sqrt(Math.pow(toaDo.getHoanhDo() - toaDoTam.getHoanhDo(),2) + Math.pow(toaDo.getTungDo() - toaDoTam.getTungDo(),2));
    }
    
    public void xacDinhViTriTuongDoiCuaMotDiem(Diem toaDo){
        double d = tinhViTriTuongDoiCuaMotDiem(toaDo);
        if(d < banKinh){
            System.out.println("Diem nam trong hinh tron");
        }
        else if( d == banKinh){
             System.out.println("Diem nam tren hinh tron");
        }
        else{
             System.out.println("Diem nam ngoai hinh tron");
        }
    }
    
    public double tinhViTriTuongDoiCuaHaiHinhTron(HinhTron ht){
        return Math.sqrt(Math.pow(toaDoTam.getHoanhDo() - ht.getToaDoTam().getHoanhDo() ,2) + Math.pow(toaDoTam.getTungDo() - ht.getToaDoTam().getTungDo(),2));
    }
}