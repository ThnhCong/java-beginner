/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5.bt2;

/**
 *
 * @author wayne
 */
public class TaiKhoanTietKiem extends TaiKhoan {

    private int kyHan;
    private double laiSuat;
    private boolean daDenHan;

    public TaiKhoanTietKiem(double soDu, int kyHan, double laiSuat) {
        super(soDu);
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.daDenHan = false;
    }

    @Override
    public void rutTien(double soTien) {
        if (!daDenHan) {
            System.out.println("Chua den han, khong duoc rut.");
        } else {
            super.rutTien(soTien);
        }
    }

    @Override
    public void daoHan() {
        double lai = soDu * laiSuat;
        soDu += lai;
        daDenHan = true;

        System.out.println("Dao han thanh cong.");
        System.out.println("Lai = " + lai);
        System.out.println("So du moi = " + soDu);
    }
}
