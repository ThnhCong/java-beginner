/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5.bt2;

/**
 *
 * @author wayne
 */
public class TaiKhoanTinDung extends TaiKhoan {

    private double hanMuc;

    public TaiKhoanTinDung(double soDu, double hanMuc) {
        super(soDu);
        this.hanMuc = hanMuc;
    }

    @Override
    public void rutTien(double soTien) {

        if (soDu - soTien >= -hanMuc) {
            soDu -= soTien;
            System.out.println("Rut thanh cong.");
            System.out.println("So du = " + soDu);
        } else {
            System.out.println("Vuot qua han muc tin dung!");
        }
    }
}