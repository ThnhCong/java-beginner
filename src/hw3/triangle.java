/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

/**
 *
 * @author wayne
 */
public class triangle {
    Diem A;
    Diem B;
    Diem C;
    double p;
    double s;
    

    // Hàm tạo
    public triangle(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double canhAB() {
        return A.TinhKhoangCach(B);
    }

    public double canhBC() {
        return B.TinhKhoangCach(C);
    }

    public double canhCA() {
        return C.TinhKhoangCach(A);
    }
    
    public double nuachuvi(){
        return p = (canhAB() + canhBC() + canhCA())/2;
    }
    
    public double getArea(){
        return s = Math.sqrt(p*(p - canhAB())*(p - canhBC())*(p - canhCA()));
    }
    
    public boolean isvalid(){
        if (canhAB() + canhBC() > canhCA() && canhAB() < canhBC() + canhCA() && canhAB() + canhCA() > canhBC() ){
            return true;
        }
        else {return false;}
    }
    
    
    public String getType(){
        if (!isvalid()) {
            return "Khong phai tam giac";
        }
        double ab = canhAB();
        double bc = canhBC();
        double ca = canhCA();
        if (ab == bc && bc == ca ){
            return "Tam giac can";
        }
        else if (ab == bc && bc == ca && ab == ca){
        return "tam giac deu";
        }
        
        else if (Math.pow(ab, 2) + Math.pow(bc, 2) == Math.pow(ca, 2) || Math.pow(ca, 2) + Math.pow(bc, 2) == Math.pow(ab, 2) || Math.pow(ab, 2) + Math.pow(ca, 2) == Math.pow(bc, 2) ){
            if (ab == bc || bc == ca || ab == ca){
                return "Tam giac vuong can";
            }
            else return "Tam giac vuong";
        }
        
        return "Tam giac thuong";
    }
}

