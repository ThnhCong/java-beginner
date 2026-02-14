/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

/**
 *
 * @author wayne
 */
public class circle {
    private Diem center;
    double r;
    private double pi;

    
    public circle(){}
    
    
    
    public circle(Diem p, double r){
        this.center = p;
        this.r = r;
    }
    
    public double pi(){
        return pi = 3.14;
    }
    
    public double dientich(){
        return pi * r * r;
    }
    
    public void getArea(){
        System.out.print("Dien tich hinh tron la" + dientich());
    }
    
    public double chuvi(){
        return 2*pi*r;
    }
    
    public void getPerimeter(){
        System.out.print("Chu vi hinh tron la: " + chuvi());
    }
    
    public boolean contains(Diem p){
        if (this.r >= (double) Math.sqrt(Math.pow(p.hoanh - this.center.hoanh, 2) + Math.pow(p.tung - this.center.tung, 2))){
            return true;
        } else {
            return false;
        }

    }
    
}
