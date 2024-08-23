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
public class ToanNM_PC09504_Lab2_Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int n;
            double toan, ly, hoa, sinh, tongDiem;

            System.out.print("Mời bạn chọn khối thi 1 hoặc 2: ");
            n = sc.nextInt();

            if (n == 1) {
                System.out.print("Nhập điểm Toán: ");
                toan = sc.nextDouble();
                System.out.print("Nhập điểm Lý: ");
                ly = sc.nextDouble();
                System.out.print("Nhập điểm Hoá: ");
                hoa = sc.nextDouble();
                
                if(toan <0 || toan>10 || ly<0 || ly >10 || hoa<0 || hoa >10){
                    System.out.println("Bạn nhập không đúng điểm.");
                    return;
                }
                tongDiem = toan + ly + hoa;

                if (tongDiem >= 21 && toan >= 7 && ly >= 7 && hoa >= 7) {
                    System.out.println("Chúc mừng bạn đậu ngành CNTT.");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời bạn xét nguyện vọng 2.");
                }
            } else if (n == 2) {
                System.out.print("Nhập điểm Toán: ");
                toan = sc.nextDouble();
                System.out.print("Nhập điểm Hoá: ");
                hoa = sc.nextDouble();
                System.out.print("Nhập điểm Sinh: ");
                sinh = sc.nextDouble();
                
                if(toan <0 || toan>10 || sinh<0 || sinh >10 || hoa<0 || hoa >10){
                    System.out.println("Bạn nhập không đúng điểm.");
                    return;
                }
                tongDiem = toan + hoa + sinh;

                if (tongDiem >= 24 && toan >= 8 && hoa >= 8 && sinh >= 8) {
                    System.out.println("Chúc mừng bạn đậu ngành Bác sĩ.");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời bạn xét nguyện vọng 2.");
                }
            } else {
                System.out.println("Bạn nhập không đúng khối thi!");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số, không nhập ký tự!");
        }
    }
}
