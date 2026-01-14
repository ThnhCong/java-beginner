/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn18 {
    public static void main(String[] args) {
        java.util.Scanner one = new java.util.Scanner(System.in);
        java.util.Scanner two = new java.util.Scanner(System.in);
        java.util.Scanner three = new java.util.Scanner(System.in);
      
        System.out.print("Nhap so one: ");
        int a = one.nextInt();
        
        System.out.print("Nhap so two: ");
        int b = two.nextInt();
        System.out.print("Nhap so three: ");
        int c = three.nextInt();

        int solonnhat = Math.max(a, Math.max(b, c));

        System.out.println("So lon nhat trong " 
                + a + ", " + b + ", " + c 
                + " la: " + solonnhat);
    }
}
