/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

/**
 *
 * @author wayne
 */
public class btvn4 {
        public static void main(String[] args) {
        java.util.Scanner canhnhap = new java.util.Scanner(System.in);
        
        System.out.print("Nhập canh: ");
        int canh = canhnhap.nextInt();

        int chuVi = 4 * canh;
        int dienTich = canh * canh;

        System.out.println("Chu vi hình vuông: " + chuVi);
        System.out.println("Diện tích hình vuông: " + dienTich);
    }
    
}
