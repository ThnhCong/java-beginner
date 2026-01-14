/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn12 {
    public static void main(String[] args) {
        java.util.Scanner fahrenheit = new java.util.Scanner(System.in);
        System.out.print("Nhap do F de doi: ");
        double do_F = fahrenheit.nextInt();
        double celsius = (do_F - 32) * 5 / 9;

        System.out.printf("Nhiet do C: %.1f", celsius);

    }
}
