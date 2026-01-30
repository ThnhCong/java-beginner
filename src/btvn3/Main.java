/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3;
import java.util.Scanner;
/**
 *
 * @author wayne
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        System.out.println("=== SO PHUC ===");
        sophuc sp1 = new sophuc();
        sophuc sp2 = new sophuc();

        System.out.println("Nhap so phuc thu nhat:");
        sp1.Nhap();
        System.out.println("Nhap so phuc thu hai:");
        sp2.Nhap();

        System.out.print("So phuc 1: ");
        sp1.Xuat();
        System.out.print("So phuc 2: ");
        sp2.Xuat();

        sophuc tong = sp1.Cong(sp2);
        System.out.print("Tong: ");
        tong.Xuat();

        sophuc hieu = sp1.Tru(sp2);
        System.out.print("Hieu: ");
        hieu.Xuat();

        sophuc tich = sp1.Nhan(sp2);
        System.out.print("Tich: ");
        tich.Xuat();

        System.out.println("Module so phuc 1: " + sp1.Module());

        //2
        System.out.println("\n=== DIEM 2D ===");
        Diem A = new Diem(3, 4);
        Diem B = new Diem(1, 2);

        System.out.print("Diem A: ");
        A.Xuat();
        System.out.print("Diem B: ");
        B.Xuat();

        System.out.println("Khoang cach A den goc: " + A.TinhKhoangCachGoc());
        System.out.println("Khoang cach A den B: " + A.TinhKhoangCach(B));

        A.DiChuyen(2, -1);
        System.out.print("A sau khi dich chuyen: ");
        A.Xuat();

        Diem C = A.DoiXung();
        System.out.print("Diem doi xung cua A: ");
        C.Xuat();

        //3
        System.out.println("\n=== THOI GIAN ===");
        Time t1 = new Time(1, 65, 50);
        Time t2 = new Time(0, 30, 20);

        System.out.print("Thoi gian t1: ");
        t1.Xuat();
        System.out.print("Thoi gian t2: ");
        t2.Xuat();

        Time tongTG = t1.Cong(t2);
        System.out.print("Tong thoi gian: ");
        tongTG.Xuat();

        int hieuGiay = t1.Tru(t2);
        System.out.println("Hieu thoi gian (giay): " + hieuGiay);

        t1.TangGiay(500);
        System.out.print("t1 sau khi tang 500 giay: ");
        t1.Xuat();
    }
}
