/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab2;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class ToanNM_PC09504_Lab2_Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Các mệnh giá tiền có thể đổi: ");
            System.out.println("500000,200000,100000,50000,20000,10000,5000,2000,1000");
            System.out.print("Nhập vào mệnh giá tiền cần đổi: ");
            int menhGia = sc.nextInt();

            if (menhGia == 500000) {
                System.out.println("Số tiền đổi được là: 2 tờ 200000 và 1 tờ 100000");
            } else if (menhGia == 200000) {
                System.out.println("Số tiền đổi được là: 2 tờ 100000");
            } else if (menhGia == 100000) {
                System.out.println("Số tiền đổi được là: 2 tờ 50000");
            } else if (menhGia == 50000) {
                System.out.println("Số tiền đổi được là: 2 tờ 20000 và 1 tờ 10000");
            } else if (menhGia == 20000) {
                System.out.println("Số tiền đổi được là: 2 tờ 10000");
            } else if (menhGia == 10000) {
                System.out.println("Số tiền đổi được là: 2 tờ 5000");
            } else if (menhGia == 5000) {
                System.out.println("Số tiền đổi được là: 2 tờ 2000 và 1 tờ 1000");
            } else if (menhGia == 2000) {
                System.out.println("Số tiền đổi được là: 2 tờ 1000");
            } else if (menhGia == 1000) {
                System.out.println("Số tiền đổi được là: 2 tờ 500");
            } else {
                System.out.println("Bạn nhập không đúng mệnh giá tiền.");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số, không nhập ký tự!");
        }
    }
}
