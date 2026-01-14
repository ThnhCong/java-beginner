/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn8 {
    public static void main(String[] args) {
        java.util.Scanner radius = new java.util.Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        int r = radius.nextInt();
        double dientich = Math.PI * r * r;
        double chuvi = 2*r*Math.PI;
        
        System.out.println("perimater " + chuvi + "pi");
        System.out.println("Area: " + dientich + "pi");
        
        
    }
}
