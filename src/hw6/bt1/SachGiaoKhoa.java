/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw6.bt1;

/**
 *
 * @author wayne
 */
public class SachGiaoKhoa extends Sach {

    private String tinhTrang; // moi hoặc cu

    public SachGiaoKhoa(String maSach, String tenSach, double donGia, String nhaXuatBan, String tinhTrang) {
        super(maSach, tenSach, donGia, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("cu")) {
            return donGia * 0.5;
        }
        return donGia;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}
