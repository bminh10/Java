

public class DoanThang{
    private Diem A;
    private Diem B;
    
    public DoanThang(Diem a, Diem b){
        A = a;
        B = b;
    }
    
    public void hienThi(){
        System.out.println(
            "[(" + A.getHoanhDo() + ", " + A.getTungDo() + "), (" + B.getHoanhDo() + ", " + B.getTungDo() + ")]" 
        );
    }
    
    public double tinhDoDaiDoanThang(){
        return Math.sqrt(Math.pow(B.getHoanhDo()-A.getHoanhDo(),2) + Math.pow(B.getTungDo()-A.getTungDo(),2));
    }
    
    public Diem timTrungDiemDoanThang(){
        Diem tmp = new Diem((A.getHoanhDo() + B.getHoanhDo())/2, (A.getTungDo()+B.getTungDo())/2);
        return tmp;
    }
    
    public Boolean isSongSong(DoanThang b){
        return 
            Double.compare(((A.getHoanhDo() - B.getHoanhDo())/(A.getTungDo()-B.getTungDo())), 
            ((b.getDiemA().getHoanhDo() - b.getDiemB().getHoanhDo())/(b.getDiemA().getTungDo()-b.getDiemB().getTungDo()))) == 0;
    }
    
    public void setDiemA(Diem a){
        A = a;
    }
    
    public void setDiemB(Diem b){
        B = b;
    }
    
    public Diem getDiemA(){
        return A;
    }
    
    public Diem getDiemB(){
        return B;
    }
    
}