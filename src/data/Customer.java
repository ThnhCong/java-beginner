/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

public class Customer {
    private int id;
    private String ten;

    public Customer(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    // Getter
    public int getId() {
        return id;
    }

    // Hàm 1
    public static void capNhatTen(Customer c) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // In thông tin trước
        System.out.println("Ten khach hang: " + c.ten);
        System.out.println("ID khach hang: " + c.getId());

        // Hỏi sửa tên
        System.out.print("Ban co muon sua ten khong? (y/n): ");
        String chon = sc.nextLine();

        if (chon.equalsIgnoreCase("y")) {
            System.out.print("Nhap ten moi: ");
            c.ten = sc.nextLine();
            System.out.println("Cap nhat ten thanh cong!");
        }
    }

    // Hàm 2
    public static void layMaKhachHang(Customer c) {
        System.out.println("Ma khach hang: " + c.getId());
    }

    public static void main(String[] args) {
        Customer c = new Customer(101, "Nguyen Van A");

        capNhatTen(c);
        layMaKhachHang(c);
    }
}


