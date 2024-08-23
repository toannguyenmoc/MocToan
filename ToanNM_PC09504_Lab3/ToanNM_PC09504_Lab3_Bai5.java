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
public class ToanNM_PC09504_Lab3_Bai5 {

    public static void snt() {
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

    public static void bangCuuChuong() {
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

    public static void mang() {
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

    public static void sinhVien() {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\t\tMENU CHƯƠNG TRÌNH");
            System.out.println("++------------------------------------------++");
            System.out.println("|\t1. Kiểm tra số nguyên tố.            |");
            System.out.println("|\t2. Bảng Cửu Chương.                  |");
            System.out.println("|\t3. Mảng.                             |");
            System.out.println("|\t4. Sinh Viên.                        |");
            System.out.println("|\t5. Thoát.                            |");
            System.out.println("++------------------------------------------++");
            System.out.print("Chọn chức năng: ");
            int n = sc.nextInt();
            String tiepTuc;
            switch (n) {
                case 1:
                    System.out.println("----Kiểm tra số nguyên tố----");
                    sc.nextLine();
                    while (true) {
                        snt();
                        System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
                        tiepTuc = sc.nextLine();

                        if (tiepTuc.equalsIgnoreCase("y")) {
                            continue;
                        } else 
                            break;    
                    }
                    break;
                case 2:
                    System.out.println("------Bảng Cửu Chương------");
                    sc.nextLine();
                    while (true) {
                        bangCuuChuong();
                        System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
                        tiepTuc = sc.nextLine();

                        if (tiepTuc.equalsIgnoreCase("y")) {
                            continue;
                        } else 
                            break;
                    }
                    break;
                case 3:
                    System.out.println("--------Mảng--------");
                    sc.nextLine();
                    while (true) {
                        mang();
                        System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
                        tiepTuc = sc.nextLine();

                        if (tiepTuc.equalsIgnoreCase("y")) {
                            continue;
                        } else 
                            break;
                    }
                    break;
                case 4:
                    System.out.println("------Sinh Viên------");
                    sc.nextLine();
                    while (true) {
                        sinhVien();
                        System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
                        tiepTuc = sc.nextLine();

                        if (tiepTuc.equalsIgnoreCase("y")) {
                            continue;
                        } else 
                            break;
                    }
                    break;
                case 5:
                    System.out.println("*** Hẹn gặp lại ***");
                    System.exit(0);
                default:
                    System.out.println("Bạn chọn không đúng chức năng");
            }
        }
    }
}
