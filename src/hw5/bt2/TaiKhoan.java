/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5.bt2;

/**
 *
 * @author wayne
 */
public class TaiKhoan {
    protected double soDu;
    public static double laisuatchung = 0.005;
    public static double tonglaisuat;
    
    public TaiKhoan(double soDu) {
        this.soDu = soDu;
        tonglaisuat += laisuatchung;
    }

    public static double getLaisuatchung() {
        return laisuatchung;
    }

    public static double getTonglaisuat() {
        return tonglaisuat;
    }
    
    
    
    public void napTien(double soTien) {
        soDu += soTien;
        System.out.println("Nap thanh cong. So du = " + soDu);
    }

    public void rutTien(double soTien) {
        if (soDu >= soTien) {
            soDu -= soTien;
            System.out.println("Rut thanh cong. So du = " + soDu);
        } else {
            System.out.println("Khong du tien.");
        }
    }

    public void daoHan() {
        // mac dinh khong lam gi
    }

    public void hienThi() {
        System.out.println("So du = " + soDu);
    }
}
