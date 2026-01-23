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
    private String name;
    private int age;
    private String color;
    private double weight;
    private int yob;
    
    
    public Dog(String Name, int Yob, double Weight, String Color){
        this.name = Name;
        this.yob = Yob;
        this.weight = Weight;
        this.color = Color;
    }
    public String getName(){
        return this.name;
    }
    public int getYob(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getColor(){
        return this.color;
    }
    private int iAge(){
        this.age = 2026 - this.yob;
        return this.age;
    }
    public int getAge(){
        return iAge();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Dog con1 = new Dog("Vinh", 2006, 56, "black" );
        Dog con2 = new Dog("Vi", 346, 33.3, "black" );
        
        //System.out.println(con1.getName() + " " + con1.getYob() + " " + con1.getWeight() + " " + con1.getColor() );
        //System.out.println(con2.getName() + " " +  con2.getYob() + " " + con2.getWeight() + " " + con2.getColor() );
        System.out.println(con1.getAge());
        System.out.println(con2.getAge());
        //if (con1.weight > con2.weight){
          //  System.out.println("con 1 nang hon con 2");
        //}
    }
}
