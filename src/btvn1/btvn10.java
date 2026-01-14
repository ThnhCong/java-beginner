/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn10 {
    public static void main(String[] args) {
    java.util.Scanner day = new java.util.Scanner(System.in);
    java.util.Scanner cao = new java.util.Scanner(System.in);
    
    System.out.print("Nhap canh day: ");
    int a = day.nextInt();
    System.out.print("Nhap do cao: ");
    int h = cao.nextInt();
    
    double dientich = a*h/2;
    System.out.printf("Dien tich hinh tam giac la: %.2f" , dientich);
    }
}
