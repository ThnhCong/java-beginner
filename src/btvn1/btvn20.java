/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn20 {
    public static void main(String[] args){
        java.util.Scanner canhben1 = new java.util.Scanner(System.in);
        java.util.Scanner canhben2 = new java.util.Scanner(System.in);
        java.util.Scanner canhben3 = new java.util.Scanner(System.in);
        
        System.out.print("Canh x la: ");
        int x = canhben1.nextInt();
        
        System.out.print("Canh y la: ");
        int y = canhben2.nextInt();
        
        System.out.print("Canh z la: ");
        int z = canhben3.nextInt();
        
        if ( x == y && y == z) {
            System.out.println("Tam giac deu");
    }
        else if ( x == y || x == z || y ==z){
            System.out.println("Tam gia can");
    }
        else if ( x*x == y*y + z*z || y*y == x*x + z*z || z*z == x*x + y*y) {
            System.out.println("Tam giac vuong");
        }
        else { System.out.println("Tam giac binh thuong");
        }
    }
}
