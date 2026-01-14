/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn14 {
    public static void main(String[] args) {
            java.util.Scanner do_C = new java.util.Scanner(System.in);
            
            System.out.print("Nhap do C can doi: ");
            double celsius = do_C.nextInt();
            double fahrenheit = (celsius*9/5)+32;
            
            System.out.printf("Nhiet do C: %.1f", fahrenheit);
        }
}
