/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3;

/**
 *
 * @author wayne
 */
public class Diem {
    double hoanh;
    double tung;
    
    public Diem(){
        this.hoanh = 0;
        this.tung = 0;
    }
    
    public Diem(double x, double y){
        this.hoanh = x;
        this.tung = y;
    }
    
    public double TinhKhoangCachGoc(){
        return Math.sqrt(hoanh*hoanh + tung*tung);
    }
    
    public double TinhKhoangCach(Diem B){
        return Math.sqrt(Math.pow(B.hoanh - this.hoanh, 2) + Math.pow(B.tung - this.tung, 2));
    }
    
    public void DiChuyen(double dx, double dy){
        hoanh += dx;
        tung += dy;
    }
    
    public Diem DoiXung() {
        return new Diem(-hoanh, -tung);
    }
    
    public void Xuat() {
        System.out.println("(" + hoanh + ", " + tung + ")");
    }
}
