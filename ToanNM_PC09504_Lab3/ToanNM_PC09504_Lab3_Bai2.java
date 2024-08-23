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
public class ToanNM_PC09504_Lab3_Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int n;

            do {
                System.out.print("Mời bạn chọn cửu chương (2-9): ");
                n = sc.nextInt();
            } while (n < 2 || n > 9);

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", n, i, n * i);
            }

            System.out.println("Bảng cửu chương từ (2-9):");
            for (int i = 2; i <= 9; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.printf("%d x %d = %d\n", i, j, i * j);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số !!!");
        }
    }
}
