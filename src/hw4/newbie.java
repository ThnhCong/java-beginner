/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw4;

/**
 *
 * @author wayne
 */
public class newbie extends nhanvien {
    String uni;
    
    public newbie(String ten, int luongcoban, String uni){
            super(ten, luongcoban);
            this.uni = uni;
    }
    @Override
    public double tinhLuong(){
        return super.luongcoban*0.8;
    }

    
}
