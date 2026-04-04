
public class Tester {
    public static void main(String[] args){
        Diem d1 = new Diem(8, 9);
        Diem d2 = new Diem(-7, 15);
        
        d1.hienThi();
        d2.hienThi();
        System.out.print("\n" + d1.tinhKhoangCach(d1.getHoanhDo(),d2.getHoanhDo(),d1.getTungDo(),d2.getTungDo()));
    }
}