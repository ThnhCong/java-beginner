/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author wayne
 */
public class student {
    int id;
    String name;
    double mathScore;
    double englishScore;

    public student(int id, String name, double mathScore, double englishScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public double getAverageScore() {
        return (mathScore + englishScore) / 2;
    }

    public void display() {
        System.out.println(id + " - " + name + 
            " - Avg: " + getAverageScore());
    }
}
