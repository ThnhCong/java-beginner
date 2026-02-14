/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw6.bt1;

/**
 *
 * @author wayne
 */
public class main {
    public static void main(String[] args) {

        SachGiaoKhoa sgk = new SachGiaoKhoa(
                "SGK01",
                "Toan 12",
                100000,
                "Giao Duc",
                "cu"
        );

        SachThamKhao stk = new SachThamKhao(
                "STK01",
                "Lap trinh Java",
                200000,
                "Tre",
                20000
        );

        System.out.println("=== Sach Giao Khoa ===");
        sgk.hienThi();

        System.out.println("\n=== Sach Tham Khao ===");
        stk.hienThi();
    }
}

