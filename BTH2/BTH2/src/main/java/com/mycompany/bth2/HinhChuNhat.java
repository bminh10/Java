

public class HinhChuNhat {
    private Diem diemTrenTrai;
    private Diem diemDuoiPhai;
    
    
    
    public HinhChuNhat(Diem a, Diem b) throws Exception{
        if(b.getHoanhDo() > a.getHoanhDo() && a.getTungDo() > b.getTungDo()){
            diemTrenTrai = a;
            diemDuoiPhai = b;
        }
        else{
            throw new Exception("Invalid Data");
        }
        
    }
    
    public double tinhChuViHinhChuNhat(){
        return 2 * (Math.abs(diemTrenTrai.getHoanhDo() - diemDuoiPhai.getHoanhDo()) + Math.abs(diemTrenTrai.getTungDo() - diemDuoiPhai.getTungDo()));
    }
    
    public double tinhDienTichHinhChuNhat(){
        return Math.abs(diemTrenTrai.getHoanhDo() - diemDuoiPhai.getHoanhDo()) * Math.abs(diemTrenTrai.getTungDo() - diemDuoiPhai.getTungDo());
    }
    
    public void hienThi(){
        System.out.printf(
            "Diem tren trai: (%.1f, %.1f)\nDiem duoi phai: (%.1f, %.1f)\nChu vi: %.1f\nDien tich: %.1f\n",
            diemTrenTrai.getHoanhDo(),
            diemTrenTrai.getTungDo(),
            diemDuoiPhai.getHoanhDo(),
            diemDuoiPhai.getTungDo(),
            tinhChuViHinhChuNhat(),
            tinhDienTichHinhChuNhat()
        );
    }
}