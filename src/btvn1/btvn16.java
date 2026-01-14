/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn16 {
    public static void main(String[] args){
        java.util.Scanner stn = new java.util.Scanner(System.in);
        java.util.Scanner sm = new java.util.Scanner(System.in);
        
        System.out.print("Nhap base: ");
        int base = stn.nextInt();
        System.out.print("Nhap exponent: ");
        int exponent = sm.nextInt();
        
        int result = 1;
        for (int i = 1; i <= exponent; i++ ){
            result *= exponent;
        }
        System.out.println("Ket qua: " + base + "^" + exponent + "=" + result);
    } 
}
