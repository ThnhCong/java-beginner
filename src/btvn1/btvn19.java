/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn19 {
    public static void main(String[] args){
        int x = 4;
        int y = 3;
        int z = 5;

        if (x == y && y == z) {
            System.out.println("Tam giac deu");
        }
        else if (
            x * x == y * y + z * z ||
            y * y == x * x + z * z ||
            z * z == x * x + y * y
        ) {
            System.out.println("Tam giac vuong");
        }
        else if (x == y || y == z || x == z) {
            System.out.println("Tam giac can");
        }
        else {
            System.out.println("Tam giac nhon");
        }

            }
}
