/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab3;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class ToanNM_PC09504_Lab3_Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int n, i, dem = 0;

            System.out.print("Nhập vào số nguyên cần kiểm tra: ");
            n = sc.nextInt();

            for (i = 2; i < n; i++) {
                if (n % i == 0 || n < 2) {
                    dem++;
                    break;
                }
            }

            if (dem == 1 || n < 2) {
                System.out.println(n + " Không phải là số nguyên tố");
            } else {
                System.out.println(n + " là số nguyên tố");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số !!!");
        }
    }
}
