/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Hàm 1: Nhập thông tin, tạo và trả về đối tượng Author
    public static Author nhapThongTinTacGia() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhap ten tac gia: ");
        String name = sc.nextLine();

        System.out.print("Nhap email tac gia: ");
        String email = sc.nextLine();

        Author tg = new Author(name, email);

        // In ra tên và email trong Hàm 1
        System.out.println("Thong tin tac gia vua nhap:");
        System.out.println("Ten: " + tg.name);
        System.out.println("Email: " + tg.email);

        return tg;
    }

    // Hàm 2: Hiển thị email tác giả
    public static void hienThiEmail(Author tg) {
        System.out.println("Lien he tac gia " + tg.name + " qua email: " + tg.email);
    }

    public static void main(String[] args) {
        Author tg = nhapThongTinTacGia();
        hienThiEmail(tg);
    }
}