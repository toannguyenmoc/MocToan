/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab4;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai4_SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên Sản Phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }

    private double ThueNhapKhau() {
        return (donGia * 10 / 100);
    }

    public void output() {
        System.out.println("----------------------");
        System.out.println("Tên Sản Phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + ThueNhapKhau());
    }

    public Bai4_SanPham() {
    }

    
    public Bai4_SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Bai4_SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        giamGia = 0;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public static void main(String[] args) {
        
        Bai4_SanPham sp1 = new Bai4_SanPham("Iphone",20000,5000);
        sp1.input();
        sp1.output();
        System.out.println("----------------------");
        sp1.setTenSp("Oppo");
        System.out.println("Tên SP: "+sp1.getTenSp());
       
        sp1.output();
        
        Bai4_SanPham sp2 = new Bai4_SanPham("Samsung",18000);
        System.out.println("----------------------");
        sp2.input();
        sp2.output();
        System.out.println("----------------------");
        sp2.setDonGia(6000);
        System.out.println("Đơn giá mới: "+sp2.getDonGia());
        
        sp2.output();
    }
}
