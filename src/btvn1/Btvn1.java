/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class Btvn1 {

        public static void demSNT1k() {
    int count = 0;  // number of primes found
    int num = 2;    // number to check

    while (count < 1000) {
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.print(num + " ");
            count++;
            if (count % 10 == 0) {  
                System.out.println();
            }
        }

        num++;
    }
}
    public static void main(String[] args) {
        demSNT1k();
    }
    
}
