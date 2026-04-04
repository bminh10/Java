
public class Tester2 {
    public static void main(String[] args){
        Diem d1 = new Diem(8, 9);
        Diem d2 = new Diem(-7, 15);
        
        Diem d3 = new Diem(7, 3);
        Diem d4 = new Diem(12, 1);
        DoanThang dt = new DoanThang(d1, d2);
        DoanThang dt2 = new DoanThang(d3, d4);
        System.out.println(dt.tinhDoDaiDoanThang());
        Diem trungDiem = dt.timTrungDiemDoanThang();
        System.out.println("Toa do trung diem la: " + trungDiem.getHoanhDo() + " " + trungDiem.getTungDo());
        if(dt.isSongSong(dt2)){
            System.out.println("Song song !");
        }
        else{
            System.out.println("Khong Song song !");
        }
    }
}