/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5.bt2;

/**
 *
 * @author wayne
 */
public class main {
   public static void main(String[] args) {

        System.out.println("=== Tai khoan tiet kiem ===");

        //TaiKhoanTietKiem tk1 = new TaiKhoanTietKiem(1000000, 6, 0.1);
        TaiKhoanTietKiem tk2 = new TaiKhoanTietKiem(1000000, 6, 0.13);
        TaiKhoanTietKiem tk3 = new TaiKhoanTietKiem(1000000, 6, 0.05);
        TaiKhoanTietKiem tk4 = new TaiKhoanTietKiem(1000000, 6, 0.03);

        //tk1.rutTien(500000); // bi chan

        //tk1.daoHan(); // cong lai

        //tk1.rutTien(500000); // rut duoc
        System.out.println("Tong so lai nhan dc sau 1 nam la: " + TaiKhoan.getTonglaisuat());


        System.out.println("\n=== Tai khoan tin dung ===");

        TaiKhoanTinDung tk2n = new TaiKhoanTinDung(0, 10000000);

        tk2n.rutTien(5000000);

        tk2n.rutTien(6000000); // vuot han muc
        
        
        
    } 
}
