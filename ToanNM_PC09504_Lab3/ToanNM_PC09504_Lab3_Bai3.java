/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class ToanNM_PC09504_Lab3_Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int n;

            do {
                System.out.print("Nhập vào số phần tử mảng: ");
                n = sc.nextInt();
            } while (n < 1);

            int mang[] = new int[n];
            int i;
            for (i = 0; i < n; i++) {
                System.out.print("Nhập vào số thứ " + (i + 1) + ": ");
                mang[i] = sc.nextInt();
            }
            Arrays.sort(mang);

            System.out.println("Mảng được sắp xếp là:");
            for (i = 0; i < n; i++) {
                System.out.printf("%d\t", mang[i]);
            }
            System.out.println();

            int min = mang[0];
            for (i = 0; i < n; i++) {
                min = Math.min(min, mang[i]);
            }
            System.out.println("Số nhỏ nhất trong mảng là: " + min);

            int tong = 0, dem = 0;

            for (i = 0; i < n; i++) {
                if (mang[i] % 3 == 0) {
                    tong += mang[i];
                    dem++;
                }
            }
            System.out.println("Trung bình cộng của các phần tử chia hết cho 3: " + (double) tong / dem);
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số !!!");
        }
    }
}
