/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5.bt1;

/**
 *
 * @author wayne
 */
public class Sach {
    protected String maSach;
    protected String tenSach;
    protected double donGia;
    protected String nhaXuatBan;

    public Sach(String maSach, String tenSach, double donGia, String nhaXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
    }

    public double tinhThanhTien() {
        return donGia;
    }

    public void hienThi() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Don gia: " + donGia);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }
}
