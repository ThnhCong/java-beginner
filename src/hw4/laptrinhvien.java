/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw4;

/**
 *
 * @author wayne
 */
public class laptrinhvien extends nhanvien{
    int ot;
    
    public laptrinhvien(String ten, int luongcoban, int ot){
            super(ten, luongcoban);
            this.ot = ot;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + ot*300; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
   
}
