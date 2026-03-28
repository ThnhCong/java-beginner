/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author wayne
 */
public class product {
    int id;
    String name;
    double price;
    
    public product( int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public void Inf(){
        System.out.println("Ten san pham: " + name + "|" + " gia " + price + "|" + " id " + id);
    }
    
}
