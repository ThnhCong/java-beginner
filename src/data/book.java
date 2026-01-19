/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

public class book {
    private String tenSach;
    private double giaTien;

    public book(String tenSach, double giaTien) {
        this.tenSach = tenSach;
        this.giaTien = giaTien;
    }

    // Hàm 1: In thông tin sách
    public static void inThongTinSach(book b) {
        System.out.println("Ten sach: " + b.tenSach);
        System.out.printf("Gia tien: %,.0f VNĐ%n", b.giaTien);
    }

    // Hàm 2: Giảm giá sách
    public static void giamGiaSach(book b, double phanTram) {
        double giaSauGiam = b.giaTien * (1 - phanTram / 100);
        System.out.printf(
            "Gia sach \"%s\" sau khi giam %.0f%% la: %,.0f VNĐ%n",
            b.tenSach, phanTram, giaSauGiam
        );
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap gia tien: ");
        double gia = sc.nextDouble();

        book b = new book(ten, gia);

        inThongTinSach(b);

        System.out.print("Nhap phan tram giam gia: ");
        double giam = sc.nextDouble();

        giamGiaSach(b, giam);
    }
}

