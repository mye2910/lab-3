/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhanvien;

/**
 *
 * @author Asus
 */
public class NhanVien {
public static void main (String[] args);
    private String tenNhanVien; 
    private double luongCoBan; 
    private double heSoLuong; 
    private static double Luong_max = 10000000;

   
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

 
    public double tinhLuong(double newHeSoLuong) {
        return luongCoBan * heSoLuong;
    }

  
    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        double newHeSoLuong = 0;
        System.out.println("Lương: " + tinhLuong(newHeSoLuong));
    }

    
    public boolean tangLuong(double tangHeSoLuong) {
        double newHeSoLuong = heSoLuong + tangHeSoLuong;
        if (tinhLuongMax(newHeSoLuong)) { 
            return false;
        }
        heSoLuong = newHeSoLuong;
        return true;
    }

    
    private boolean tinhLuongMax(double newHeSoLuong) {
        return tinhLuong(newHeSoLuong) > Luong_max && tinhLuong(newHeSoLuong) > Luong_max;
    }

    
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public static double getLuong_max() {
        return Luong_max;
    }

    public static void setLuong_max(double luong_max) {
        Luong_max = luong_max;
    }
}
    
    
