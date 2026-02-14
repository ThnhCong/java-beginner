/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4;

/**
 *
 * @author wayne
 */
public class nhanvien {
    String ten;
    double luongcoban;
    public nhanvien(String ten, double luongcoban){
        this.ten = ten;
        this.luongcoban = luongcoban;
    }

    public String getTen() {
        return ten;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }
    
    public double tinhLuong(){
        return this.luongcoban;
    }
    
    @Override 
    public String toString(){
        return "Nhan vien " + this.ten+ " luong la " + this.luongcoban; 
    }
    
}
