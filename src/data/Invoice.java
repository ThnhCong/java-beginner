/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class Invoice {
    String id;
    double amount;
    
    public Invoice (String id, double amount){
        this.id = id;
        this.amount = amount;
    }
    
    //Ham 1
    public static void tinhThueVAT(Invoice inv){
        double thue = inv.amount/10;
        System.out.print("Gia tri thue 10% la: " + thue);
    }
    //Ham 2
    public static void kiemTraHoaDonLon(Invoice inv){
        if ( inv.amount > 1000000) {
        System.out.print("\nHóa đơn giá trị cao");
    }
        else {System.out.print("\nHóa đơn bình thường");}
    }
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Nhap id hoa don: ");
        String id = sc.nextLine();
        
        System.out.print("Nhap tong tien cua hoa don: ");
        double amount = sc.nextDouble();
        
        Invoice inv = new Invoice(id, amount);
        tinhThueVAT(inv);
        
        kiemTraHoaDonLon(inv);
        
    }
    
}
