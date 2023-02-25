/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinh;

/**
 *
 * @author Asus
 */
public class Hinh {
public static void main (String[] args);
    
        public class HinhVuong {
   
    private double canh;

    
    public HinhVuong(double canh) {
        this.canh = canh;
    }

   
    public double getCanh() {
        return canh;
    }

    
    public void setCanh(double canh){
        this.canh = canh;
    }

    
    public double tinhDienTich() {
        return canh * canh;
    }
}


public class HinhTron {
    
    private double banKinh;

    
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    
    public double getBanKinh() {
        return banKinh;
    }

   
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

   
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}

    
}
    
    

