/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3;
import java.util.Scanner;
/**
 *
 * @author wayne
 */
public class sophuc {
    double thuc;
    double ao;
    
    public sophuc(){
        this.thuc = 0;
        this.ao = 0;
    }
    
    private sophuc(double thuc, double ao){
        this.thuc = thuc;
        this.ao = ao;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so thuc: ");
        thuc = sc.nextDouble();
        
        System.out.print("Nhap so ao: ");
        ao = sc.nextDouble();
        
    }
    
    public void Xuat(){
        if (ao >= 0){
            System.out.print("So phuc la: " + thuc + ao + "i");
        }
        else {System.out.print("So phuc la: " + thuc);}
    }
    
    public double Module(){
        double z = Math.sqrt(thuc*thuc + ao*ao);
        return z;
    }
    
    public sophuc Cong(sophuc p2) {
        return new sophuc(this.thuc + p2.thuc, this.ao + p2.ao);
    }

    public sophuc Tru(sophuc p2) {
        return new sophuc(this.thuc - p2.thuc, this.ao - p2.ao);
    }

    public sophuc Nhan(sophuc p2) {
        double a = this.thuc * p2.thuc - this.ao * p2.ao;
        double b = this.thuc * p2.ao + this.ao * p2.thuc;
        return new sophuc(a, b);
    }
    
}
