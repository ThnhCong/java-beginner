/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author wayne
 */
public class btvn2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhập chieu cao: ");
        double chieucao = sc.nextDouble();
        
        System.out.print("Nhập can nag: ");
        int cannang = sc.nextInt();

        System.out.println("\n--- Thông tin vừa nhập ---");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("chieu cao: " + chieucao + "cm");
        System.out.println("can nang: " + cannang + "kg");
    }
}

