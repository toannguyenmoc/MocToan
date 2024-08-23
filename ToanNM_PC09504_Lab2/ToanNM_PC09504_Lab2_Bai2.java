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
public class ToanNM_PC09504_Lab2_Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int suDung, tienTra;

            System.out.print("Số (kwh) điện sử dụng: ");
            suDung = sc.nextInt();

            if (suDung < 0) {
                System.out.println("Nhập sai số (kwh), vui lòng nhập số dương! ");
            } else {

                if (suDung >= 0 && suDung <= 50) {
                    tienTra = suDung * 1678;
                } else if (suDung > 50 && suDung <= 100) {
                    tienTra = 50 * 1678 + (suDung - 50) * 1734;
                } else if (suDung > 100 && suDung <= 200) {
                    tienTra = 50 * (1678 + 1734) + (suDung - 100) * 2014;
                } else if (suDung > 200 && suDung <= 300) {
                    tienTra = 50 * (1678 + 1734) + 100 * 2014 + (suDung - 200) * 2536;
                } else if (suDung > 300 && suDung <= 400) {
                    tienTra = 50 * (1678 + 1734) + 100 * (2014 + 2536) + (suDung - 300) * 2834;
                } else {
                    tienTra = 50 * (1678 + 1734) + 100 * (2014 + 2536 + 2834) + (suDung - 400) * 2927;
                }

                System.out.println("Số tiền phải trả: " + tienTra+" VND");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số, không nhập ký tự!");
        }
    }
}
