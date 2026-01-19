/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author wayne
 */
public class Dog {
    String name;
    int age;
    String color;
    double weight;
    
    
    public Dog(String iName, int iYob, double iWeight, String iColor){
        name = iName;
        age = iYob;
        weight = iWeight;
        color = iColor;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Dog con1 = new Dog("Vinh", 12, 56, "black" );
        Dog con2 = new Dog("Vi", 14, 33.3, "black" );
        
        if (con1.weight > con2.weight){
            System.out.println("con 1 nang hon con 2");
        }
    }
}
