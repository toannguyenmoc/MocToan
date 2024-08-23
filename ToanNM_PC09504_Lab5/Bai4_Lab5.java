/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab5;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai4_Lab5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai1_ArrayList tong = new Bai1_ArrayList();
        Bai2_Lab5 sv = new Bai2_Lab5();
        Bai3_SP sp = new Bai3_SP();

        while (true) {
            try {
                System.out.println("++--------------------------------------------------++");
                System.out.println("|\t\tMENU CÁC BÀI 1-2-3                   |");
                System.out.println("|\t1. Bài 1: Tính tổng ArrayList                |");
                System.out.println("|\t2. Bài 2: Sinh Viên                          |");
                System.out.println("|\t3. Bài 3: Sản Phẩm                           |");
                System.out.println("|\t4. Kết thúc                                  |");
                System.out.println("++--------------------------------------------------++");

                System.out.print("Chọn chức năng: ");
                int n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1:
                        while(true){
                            System.out.println("Bài 1: Tính Tổng ArrayList");
                            tong.bai1();
                            System.out.print("Bạn muốn sử dụng tiếp không(Y/N): ");
                            if (sc.nextLine().equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Bài 2: Sinh Viên");
                        sv.menu();
                        break;
                    case 3:
                        System.out.println("Bài 3: Sản Phẩm");
                        sp.menu();
                        break;
                    case 4:
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
