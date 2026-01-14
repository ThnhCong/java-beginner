/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn6 {
    public static void main(String[] args) {
        java.util.Scanner width = new java.util.Scanner(System.in);
        java.util.Scanner lenght = new java.util.Scanner(System.in);
        
        System.out.print("Nhap canh rong cua hcn: ");
        int rong = width.nextInt();
        System.out.print("Nhap canh dai cua hcn: ");
        int dai = lenght.nextInt();
        
        int chuvi = 2*(dai + rong);
        int dientich = dai*rong;
        
        System.out.println("Chu vi hcn: "+ chuvi);
        System.out.println("Dien tich hcn la: " + dientich);
    }
}
