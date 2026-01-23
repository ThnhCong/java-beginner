/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class BenhAn {
    String tenbenhnhan;
    int vienphi;
    
    public BenhAn (String tenbenhnhan, int vienphi){
        this.tenbenhnhan = tenbenhnhan;
        this.vienphi = vienphi;
    }
    
    public void  capNhatVienPhi(int phiPhatSinh){
        this.vienphi = phiPhatSinh + this.vienphi;
        System.out.println("Cap nhat vien phi: " + this.vienphi);
    }
    
    public void xuatVien(){
        System.out.println(this.tenbenhnhan + "da thanh toan vien phi " + this.vienphi + " va xuat vien");
    }
    
    public static void main(String[] args){
        BenhAn ba = new BenhAn("Vinh", 1500000);
        
        ba.capNhatVienPhi(400000);
        ba.xuatVien();
    }
}
