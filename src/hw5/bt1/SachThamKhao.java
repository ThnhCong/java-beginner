/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5.bt1;

/**
 *
 * @author wayne
 */
public class SachThamKhao extends Sach {

    private double thue;

    public SachThamKhao(String maSach, String tenSach, double donGia, String nhaXuatBan, double thue) {
        super(maSach, tenSach, donGia, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public double tinhThanhTien() {
        return donGia + thue;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}
