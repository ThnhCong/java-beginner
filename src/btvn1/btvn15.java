/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn15 {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            System.out.println("Ket qua: " + base + "^" + exponent + "=" + result);
    }
}
