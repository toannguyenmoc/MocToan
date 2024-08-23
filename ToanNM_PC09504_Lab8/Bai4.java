/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab8;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai4 {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("++--------------------------------------++");
        System.out.println("|\t\tMENU LAB8                |");
        System.out.println("|\t1. BÀI 1: Phương Thức Tĩnh       |");
        System.out.println("|\t2. BÀI 2: Min, Max               |");
        System.out.println("|\t3. BÀI 3: UpperCase Chữ Cái Đầu  |");
        System.out.println("|\t0. Kết thúc                      |");
        System.out.println("++--------------------------------------++");
    }

    public static void main(String[] args) {
        while (true) {
            try {
                menu();

                System.out.print("Chọn chức năng: ");
                int n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1:
                        while (true) {
                            System.out.println("\tBÀI 1: Phương Thức Tĩnh");
                            Bai1.main(args);
                            System.out.print("Bạn muốn sử dụng tiếp chức năng này không (Y/N): ");

                            if (sc.nextLine().equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            System.out.println("\tBÀI 2: Min, Max");
                            Bai2.main(args);
                            System.out.print("Bạn muốn sử dụng tiếp chức năng này không (Y/N): ");

                            if (sc.nextLine().equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            System.out.println("\tBÀI 3: UpperCase Chữ Cái Đầu");
                            Bai3.main(args);
                            System.out.print("Bạn muốn sử dụng tiếp chức năng này không (Y/N): ");

                            if (sc.nextLine().equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 0:
                        System.out.println("------Hẹn Gặp Lại------");
                        System.exit(0);
                    default:
                        System.out.println("Bạn chọn không đúng chức năng.");
                }
            } catch (Exception e) {
                System.out.println("vui lòng nhập số, không nhập ký tự !!!");
                sc.nextLine();
            }
        }
    }
}
