// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here

public class Diem {
    private double hoanhDo;
    private double tungDo;
    
    public void hienThi(){
        System.out.printf("%.1f, %.1f", hoanhDo, tungDo);
    }
    
    public double tinhKhoangCach(double x1, double x2,double y1, double y2){
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }
    
    public Diem(double hd, double td){
        hoanhDo = hd;
        tungDo = td;
    }
    
    
    public void setHoanhDo(double hd){
        hoanhDo = hd;
    }
    
    public void setTungDo(double td){
        tungDo = td;
    }
    
    public double getHoanhDo(){
        return hoanhDo;
    }
    
    public double getTungDo(){
        return tungDo;
    }
}