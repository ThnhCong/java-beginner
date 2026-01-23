/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class monhoc {
    String tenmon;
    int sotinchi;
    
    public monhoc(String tenmon, int sotinchi){
        this.tenmon = tenmon;
        this.sotinchi = sotinchi;
    }
    
    public void kiemTraMonThucHanh(){
        if (this.sotinchi >= 3) {
            System.out.println("Môn học nặng");
        }
        else{System.out.println("Môn học nhẹ");}
    }
    
    public void tinhHocPhi(){
        System.out.println("Tong so tien mon hoc nay la: "+ this.sotinchi * 500 + "k" );
    }
    public static void main(String[] args){
        monhoc mh = new monhoc("OOP", 3);
        
        mh.kiemTraMonThucHanh();
        mh.tinhHocPhi();
    }
}
