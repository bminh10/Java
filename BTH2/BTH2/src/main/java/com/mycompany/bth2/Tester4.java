
public class Tester4 {
    public static void main(String[] args){
        Diem tam = new Diem(2, 3);
        Diem test = new Diem(10,10);
        HinhTron hinhTron = new HinhTron(tam, 4);
        HinhTron hinhTron2 = new HinhTron(tam, 4);
        
        hinhTron.hienThi();
        hinhTron.xacDinhViTriTuongDoiCuaMotDiem(test);
        System.out.println(hinhTron.tinhViTriTuongDoiCuaHaiHinhTron(hinhTron2));
        
    }
}