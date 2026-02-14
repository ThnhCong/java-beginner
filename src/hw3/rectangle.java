/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

/**
 *
 * @author wayne
 */
public class rectangle {
    private Diem topLeft;
    double len;
    double wit;
    
    public rectangle(double len, double wit){
        this.len = len;
        this.wit = wit;
    }
    
    public double getArea(){
        return len*wit;
    }
    
    public double getPerimeter(){
        return 2*(len + wit);
    }
    
    public boolean contains(Diem p){
        if (this.topLeft.hoanh + this.len > p.hoanh && this.topLeft.tung > p.tung &&this.topLeft.tung - this.wit > p.tung ){
            return true;
        }
        else return false;
    }
    
}
