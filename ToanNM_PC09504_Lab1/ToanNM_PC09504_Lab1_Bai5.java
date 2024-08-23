/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class ToanNM_PC09504_Lab1_Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập vào tên sản phẩm: ");
        String tenSP = sc.nextLine();
        System.out.print("Nhập vào đơn giá: ");
        double donGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập vào màu sắc: ");
        String mauSac = sc.nextLine();
        
        Random rd = new Random();
        
        int soLuong = 5+ rd.nextInt(20-5+1);
        int giamGia = 10000 + rd.nextInt(50000-10000+1);
        
        double thanhTien = soLuong * donGia;
        double tienPhaiTra = thanhTien - giamGia;
        
        System.out.println("\nTên Sản Phẩm: "+tenSP);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Màu sắc: "+mauSac);
        System.out.println("Giảm giá: "+giamGia);
        System.out.println("Thành tiền: "+thanhTien);
        System.out.println("Tiền giảm: "+giamGia);
        System.out.println("Tiền thanh toán: "+tienPhaiTra);
    }
}
