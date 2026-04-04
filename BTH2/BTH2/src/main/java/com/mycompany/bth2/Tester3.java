
public class Tester3 {
    public static void main(String[] args){
        Diem d1 = new Diem(2, 10);
        Diem d2 = new Diem(8, 3);
        
        try {
            HinhChuNhat hcn = new HinhChuNhat(d1, d2);
            hcn.hienThi();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}