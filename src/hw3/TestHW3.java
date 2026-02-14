/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author wayne
 */
package hw3;

public class TestHW3 {
    public static void main(String[] args) {

        // ===== Test DIEM =====
        Diem d1 = new Diem(0, 0);
        Diem d2 = new Diem(3, 4);

        System.out.println("Khoang cach d1 -> d2 = " + d1.TinhKhoangCach(d2));
        System.out.print("Diem doi xung cua d2: ");
        d2.DoiXung().Xuat();

        // ===== Test TAM GIAC =====
        Diem A = new Diem(0, 0);
        Diem B = new Diem(4, 0);
        Diem C = new Diem(2, 3);

        triangle tg = new triangle(A, B, C);

        System.out.println("\n=== TAM GIAC ===");
        System.out.println("Canh AB = " + tg.canhAB());
        System.out.println("Canh BC = " + tg.canhBC());
        System.out.println("Canh CA = " + tg.canhCA());

        System.out.println("Hop le? " + tg.isvalid());
        System.out.println("Loai tam giac: " + tg.getType());

        tg.nuachuvi();
        System.out.println("Dien tich tam giac = " + tg.getArea());

        // ===== Test HINH TRON =====
        circle c = new circle(new Diem(0, 0), 5);
        c.pi();

        System.out.println("\n=== HINH TRON ===");
        c.getArea();
        System.out.println();
        c.getPerimeter();
        System.out.println();

        System.out.println("Diem (3,4) nam trong hinh tron? "
                + c.contains(new Diem(3, 4)));

        // ===== Test HINH CHU NHAT =====
        rectangle r = new rectangle(10, 5);

        System.out.println("\n=== HINH CHU NHAT ===");
        System.out.println("Dien tich = " + r.getArea());
        System.out.println("Chu vi = " + r.getPerimeter());
    }
}
