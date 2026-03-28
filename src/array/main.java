/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author wayne
 */
public class main {
    public static void main(String[] args) {
        product[] list = new product[5];

        list[0] = new product(1, "Iphone", 1000);
        list[1] = new product(2, "Samsung", 900);
        list[2] = new product(3, "Xiaomi", 500);
        list[3] = new product(4, "Oppo", 400);
        list[4] = new product(5, "Nokia", 300);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten can tim: ");
        String keyword = sc.nextLine();

        boolean found = false;

        for (product p : list) {
            if (p.name.equalsIgnoreCase(keyword)) {
                p.Inf();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay!");
        }
        
        
        student[] stlist = {
            new student(1, "An", 9, 8.5),
            new student(2, "Binh", 7, 6),
            new student(3, "Chi", 9.5, 9),
            new student(4, "Dung", 8, 8),
            new student(5, "Em", 6, 7)
        };

        System.out.println("Sinh vien DTB > 8:");
        for (student s : stlist) {
            if (s.getAverageScore() > 8) {
                s.display();
            }
        }

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (stlist[i].getAverageScore() < stlist[j].getAverageScore()) {
                    student temp = stlist[i];
                    list[i] = list[j];
                    stlist[j] = temp;
                }
            }
        }

        System.out.println("\nDanh sach sau khi sap xep:");
        for (student s : stlist) {
            s.display();
        }
    }
    }
