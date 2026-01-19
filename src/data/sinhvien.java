/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class sinhvien {
    int maSV;
    String Hoten;
    double DTB;
    
    public sinhvien(int maSV, String Hoten, double DTB){
        this.maSV = maSV;
        this.Hoten = Hoten;
        this.DTB = DTB;
    }
    //Ham 1:
    public static void xepLoaiHocLuc(sinhvien sv){
        if (sv.DTB >= 5.0) {
            System.out.println("Đậu");
        }
        else {System.out.println("Rớt");}
    }
    //Ham 2
    public static void chuanHoaTen(sinhvien sv){
        System.out.print("Ho va ten: " + sv.Hoten.toUpperCase());
    }
    
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Nhap maSV: ");
        int maSV = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nhap Hoten: ");
        String Hoten = sc.nextLine();
        
        System.out.print("Nhap DTB: ");
        double DTB = sc.nextDouble();
        
        
        sinhvien sv = new sinhvien(maSV, Hoten, DTB);
        
        xepLoaiHocLuc(sv);
        
        chuanHoaTen(sv);
    }
}
