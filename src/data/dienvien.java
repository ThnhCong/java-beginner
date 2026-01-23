/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class dienvien {
    String tenKhaiSinh;
    String ngheDanh;
    String nickName;
    int soBoPhimDong;
    
    public dienvien(String tenKhaiSinh, String ngheDanh, String nickName, int soBoPhimDong) {
        this.tenKhaiSinh = tenKhaiSinh;
        this.ngheDanh = ngheDanh;
        this.nickName = nickName;
        this.soBoPhimDong = soBoPhimDong;
    }
    
    private double CatseDV(){
        double catse = soBoPhimDong * 20000000;
        return catse;
    }
    
    public void tinhCatSeDuKien(){
        System.out.println("Cat se nhan dc la: " + CatseDV());
    }
    
    public void doiNgheDanh(String ngheDanhMoi) {
    this.ngheDanh = ngheDanhMoi;
    System.out.println("Đã đổi nghệ danh thành: " + this.ngheDanh);
}
    
    public static void main(String[] args) {
        dienvien dv = new dienvien("Cong", "VuaKpop", "Narubako", 12);
        
        dv.tinhCatSeDuKien();
        dv.doiNgheDanh("ConGaCon");
    }    
}
    
