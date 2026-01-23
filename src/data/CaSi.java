/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class CaSi {
    private String tenKhaiSinh;
    private String ngheDanh;
    private String nickName;
    private int soBaiHits;

    
    public CaSi(String tenKhaiSinh, String ngheDanh, String nickName, int soBaiHits) {
        this.tenKhaiSinh = tenKhaiSinh;
        this.ngheDanh = ngheDanh;
        this.nickName = nickName;
        this.soBaiHits = soBaiHits;
    }
    
    public void soSanhDoHot(CaSi csKhac) {
        if (this.soBaiHits > csKhac.soBaiHits) {
            System.out.println("Ca si hot hon la: " + this.ngheDanh);
        } else if (this.soBaiHits < csKhac.soBaiHits) {
            System.out.println("Ca si hot hon la: " + csKhac.ngheDanh);
        } else {
            System.out.println("Hai ca si co do hot ngang nhau");
        }
    }
    
    public void HienThiProfile(){
        System.out.println("Ca sĩ " + this.ngheDanh + " (tên thật: " + this.tenKhaiSinh + ") " + "có " + this.soBaiHits + " bài hit");
    }

    public static void main(String[] args) {
        CaSi casi1 = new CaSi("Cong", "VuaKpop", "Narubako", 12);
        CaSi casi2 = new CaSi("Vinh", "VuaHipHop", "TaiLoc", 13);

        // gọi đúng
        casi1.soSanhDoHot(casi2);
        casi1.HienThiProfile();
        casi2.HienThiProfile();
    }
}
