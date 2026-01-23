/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class CauThu {
    String ten;
    String vitri;
    String quocgia;

    
    public CauThu(String ten, String vitri, String quocgia) {
        this.ten = ten;
        this.vitri = vitri;
        this.quocgia = quocgia;
    }
    
    public void kiemTraCauThuNuocNgoai(){
        if (!this.quocgia.equals("Viet Nam")){
            System.out.println("Cầu thủ ngoại binh");
        }
        else {System.out.println("Cầu thủ nội binh");}
    }
    
    public void doiViTriThiDau( String viTriMoi){
        this.vitri = viTriMoi;
        System.out.println("Vi tri moi cua " + this.ten + " la: " + this.vitri);
    }
    
    public static void main(String[] args){
        CauThu ct = new CauThu("Cong", "Tien dao", "Viet Nam");
        
        System.out.println("Thong tin cau thu: " + " Ten: "+ ct.ten + ", Vi tri: " + ct.vitri + ", Quoc tich: " + ct.quocgia);
        
        ct.kiemTraCauThuNuocNgoai();
        ct.doiViTriThiDau("Thu mon");
    }
}
