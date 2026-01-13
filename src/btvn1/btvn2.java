/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

public class btvn2 {

    public static void YourName() {
        java.util.Scanner banphim = new java.util.Scanner(System.in);

        System.out.print("Nhập tên: ");
        String name = banphim.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = banphim.nextInt();

        System.out.print("Nhập cân nặng (kg): ");
        double canNang = banphim.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = banphim.nextDouble();

        System.out.println("\n--- Thông tin đã nhập ---");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Cân nặng: " + canNang + " kg");
        System.out.println("Chiều cao: " + chieuCao + " m");
    }

    public static void main(String[] args) {
        YourName();
    }
}


