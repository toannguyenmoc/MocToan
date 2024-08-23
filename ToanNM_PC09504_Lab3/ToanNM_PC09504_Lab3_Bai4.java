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
public class ToanNM_PC09504_Lab3_Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int n;

            do {
                System.out.print("Nhập vào số lượng sinh viên: ");
                n = sc.nextInt();
            } while (n < 1);

            String hoTen[] = new String[n];
            double diem[] = new double[n];
            int i;

            for (i = 0; i < n; i++) {
                sc.nextLine();
                System.out.print("Nhập vào họ tên sinh viên " + (i + 1) + ": ");
                hoTen[i] = sc.nextLine();
                do {
                    System.out.print("Nhập vào điểm: ");
                    diem[i] = sc.nextDouble();
                } while (diem[i] < 0 || diem[i] > 10);
            }

            double temp;
            int j;
            String tam;

            for (i = 0; i < n; i++) {
                for (j = i + 1; j < n; j++) {
                    if (diem[i] > diem[j]) {
                        temp = diem[j];
                        diem[j] = diem[i];
                        diem[i] = temp;
                        tam = hoTen[j];
                        hoTen[j] = hoTen[i];
                        hoTen[i] = tam;
                    }
                }
            }
            System.out.println("Danh sách sinh viên đã sắp xếp theo điểm:");
            for (i = 0; i < n; i++) {

                System.out.print("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", ");

                if (diem[i] >= 0 && diem[i] < 5) {
                    System.out.println("Học Lực: Yếu");
                } else if (diem[i] >= 5 && diem[i] < 6.5) {
                    System.out.println("Học Lực: Trung Bình");
                } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                    System.out.println("Học Lực: Khá");
                } else if (diem[i] >= 7.5 && diem[i] < 9) {
                    System.out.println("Học Lực: Giỏi");
                } else {
                    System.out.println("Học Lực: Xuất sắc");
                }
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập đúng yêu cầu!!!");
        }
    }
}
