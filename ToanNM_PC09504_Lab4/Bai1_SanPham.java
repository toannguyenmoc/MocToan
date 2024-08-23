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
public class Bai1_SanPham {

    public String tenSp;
    public double donGia;
    public double giamGia;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên Sản Phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }

    public double ThueNhapKhau() {
        return (donGia * 10 / 100);
    }

    public void output() {
        System.out.println("---------");
        System.out.println("Tên Sản Phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + ThueNhapKhau());
    }

    public static void main(String[] args) {
        Bai1_SanPham sp = new Bai1_SanPham();
        sp.input();
        sp.output();
    }
}
