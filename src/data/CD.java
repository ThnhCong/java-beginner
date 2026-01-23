/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class CD {
    int cccd;
    String ten;
    int namsinh;
    
    public CD(int cccd, String ten, int namsinh) {
        this.cccd = cccd;
        this.ten = ten;
        this.namsinh = namsinh;
    }
    public void TuoiBauCu(){
        if (2026 - namsinh > 18){
            System.out.println(ten + "Được đi bầu cử");
        }
        else {System.out.print("Ko Được đi bầu cử");}
    }
    
    public void ThongTinCD(){
        System.out.println("number cccd: " + cccd);
        System.out.println("Ho va ten: " + ten);
    }
    
    public static void main(String[] args) {

        // ✅ Tạo đối tượng ĐÚNG
        CD cd = new CD(12345, "Cong", 2015);

        // ✅ Gọi hàm ĐÚNG
        cd.ThongTinCD();
        cd.TuoiBauCu();
    }
}
