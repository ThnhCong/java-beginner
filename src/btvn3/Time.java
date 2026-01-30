/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3;

/**
 *
 * @author wayne
 */
public class Time {
    int gio;
    int phut;
    int giay;
    
    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
        ChuanHoa();
    }
    
    public void ChuanHoa() {
        if (giay >= 60) {
            phut += giay / 60;
            giay %= 60;
        }

        if (phut >= 60) {
            gio += phut / 60;
            phut %= 60;
        }
    }

    public Time Cong(Time t2) {
        return new Time(
            this.gio + t2.gio,
            this.phut + t2.phut,
            this.giay + t2.giay
        );
    }

    public int Tru(Time t2) {
        int s1 = gio * 3600 + phut * 60 + giay;
        int s2 = t2.gio * 3600 + t2.phut * 60 + t2.giay;
        return Math.abs(s1 - s2);
    }

    public void TangGiay(int n) {
        giay += n;
        ChuanHoa();
    }

    public void Xuat() {
        System.out.println(gio + " gio " + phut + " phut " + giay + " giay");
    }
}
