/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class Point {
    double x;
    double y;
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    //Ham 1
    public static void tinhKhoangCachGoc(Point p){
        System.out.println("khoang cach den tam O la: " + Math.sqrt(p.x*p.x + p.y*p.y));
        
    }
    //Ham 2
   public static void GocPhanTu(Point p){
       if (p.x > 0 && p.y > 0){
           System.out.print("p nam o goc phan tu thu 1");
       }
       else if (p.x < 0 && p.y > 0){
           System.out.print("p nam o goc phan tu thu 2");
       }
       else if (p.x < 0 && p.y < 0){
           System.out.print("p nam o goc phan tu thu 3");
       }
       else {
           System.out.print("p nam o goc phan tu thu 4");
       }
   } 
   
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap toa do y: ");
        double y = sc.nextDouble();

        Point p = new Point(x, y);
        tinhKhoangCachGoc(p);
        GocPhanTu(p);
    }
}
