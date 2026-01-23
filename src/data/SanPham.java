/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class SanPham {
    String tensp;
    int giatien;
    boolean conhang;
    
    public SanPham (String tensp, int giatien, boolean conhang) {
        this.tensp = tensp;
        this.giatien = giatien;
        this.conhang = conhang;
    }
    
    public void kiemTraTonKho(){
        if (this.conhang = true){
            System.out.println("Con hang");
        }
        else {System.out.println("Het hang");}
    }
    
    public void hienThiGia(){
        System.out.println("Ten sp: " + this.tensp + " co gia " + this.giatien + " dong");
    }
    
    public static void main(String[] args){
        SanPham sp = new SanPham("Trung vang", 6000, false);
        
        sp.kiemTraTonKho();
        sp.hienThiGia();
    }
}
