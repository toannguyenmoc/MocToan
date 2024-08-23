/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai2_Lab5 {

    private String hoTen;

    public Bai2_Lab5() {
    }

    public Bai2_Lab5(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    public void input() {
        while (true) {
            System.out.print("Nhập họ tên SV: ");
            hoTen = sc.nextLine();
            list.add(hoTen);

            System.out.print("Bạn muốn nhập tiếp không(Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void output() {
        for (String x : list) {
            System.out.println(x);
        }
    }

    public void outputRandom() {

        Collections.shuffle(list);

        for (String x : list) {
            System.out.println(x);
        }
    }

    public void sapXepGiamDan() {

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("Danh sách tên giảm dần: "+list);
//        for (String x : list) {
//            System.out.println(x);
//        }
    }
        
    public void remove() {
        while (true) {
            System.out.print("Nhập tên cần tìm để xoá: ");
            String tim = sc.nextLine();
            boolean kt = false;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equalsIgnoreCase(tim)) {
                    System.out.println("Tìm thấy");
                    System.out.print("Bạn muốn xoá không(Y/N): ");
                    String t = sc.nextLine();
                    if (t.equalsIgnoreCase("y")) {
                        list.remove(i);
                    }
                    kt = true;
                }
            }

            if (kt == false) {
                System.out.println("Không tìm thấy");
            } else {
                System.out.println("Danh sách mới:");
                output();
            }
            System.out.print("Bạn muốn xoá tiếp không(Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void menu() {

        while (true) {
            try {

                System.out.println("++----------------------------------------------++");
                System.out.println("|\t\tMENU BÀI 2: SINH VIÊN            |");
                System.out.println("|\t1. Nhập danh sách họ và tên              |");
                System.out.println("|\t2. Xuất danh sách vừa nhập               |");
                System.out.println("|\t3. Xuất danh sách ngẫu nhiên             |");
                System.out.println("|\t4. Sắp xếp giảm dần và xuất danh sách    |");
                System.out.println("|\t5. Tìm và xóa họ tên nhập từ bàn phím    |");
                System.out.println("|\t6. Kết thúc                              |");
                System.out.println("++----------------------------------------------++");

                System.out.print("Chọn chức năng: ");
                int n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1:
                        System.out.println("Nhập danh sách họ và tên:");
                        input();
                        break;
                    case 2:
                        System.out.println("Xuất danh sách vừa nhập:");
                        output();
                        break;
                    case 3:
                        System.out.println("Xuất danh sách ngẫu nhiên:");
                        outputRandom();
                        break;
                    case 4:
                        System.out.println("Sắp xếp giảm dần và xuất danh sách");
                        sapXepGiamDan();
                        break;
                    case 5:
                        System.out.println("Tìm và xóa họ tên nhập từ bàn phím");
                        remove();
                        break;
                    case 6:
                        System.out.println("------Hẹn Gặp Lại------");
                        return;
                    default:
                        System.out.println("Bạn chọn không đúng chức năng.");
                }
            } catch (Exception e) {
                System.out.println("vui lòng nhập số, không nhập ký tự !!!");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Bai2_Lab5 n = new Bai2_Lab5();
        n.menu();
    }
}
