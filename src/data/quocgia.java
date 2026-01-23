/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class quocgia {
    String ten;
    double dientich;
    int danso;

    
    public quocgia(String ten, double dientich, int danso) {
        this.ten = ten;
        this.dientich = dientich;
        this.danso = danso;
    }
    
    private double tinhMatDoDS(){
        double matdo = danso/dientich;
        return matdo;
    }
    
    public void tinhMatDoDanSo(){
        System.out.println("Mat do dan so cua " + this.ten + " la: " + tinhMatDoDS() + " nguoi/km2");
    }
    
    public void inTenQuocGia(){
        System.out.println("Welcom to "+ this.ten);
    }
    
    public static void main(String[] args){
        quocgia qg = new quocgia("Viet Nam", 331690, 1000000);
        
        qg.tinhMatDoDanSo();
        qg.inTenQuocGia();
    }
}
