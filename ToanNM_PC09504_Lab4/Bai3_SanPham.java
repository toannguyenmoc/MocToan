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
public class Bai3_SanPham {

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
        System.out.println("---------");
        System.out.println("Tên Sản Phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + ThueNhapKhau());
    }

    public Bai3_SanPham() {
    }

    
    public Bai3_SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Bai3_SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        giamGia = 0;
    }
    
    public static void main(String[] args) {
        Bai3_SanPham sp1 = new Bai3_SanPham("Iphone",20000,5000);
        sp1.output();
        
        Bai3_SanPham sp2 = new Bai3_SanPham("Samsung",18000);
        sp2.output();
    }
}
