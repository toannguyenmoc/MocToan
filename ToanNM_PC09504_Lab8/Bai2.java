/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai2 {

    static Scanner sc = new Scanner(System.in);
    private static double so;

    public Bai2() {
    }

    public Bai2(double so) {
        this.so = so;
    }

    static ArrayList<Double> list = new ArrayList<>();
    static Double sv;

    public static void nhap() {
        int i = 0;
        while (true) {
            try {
                System.out.print("Nhập số thứ " + (i + 1) + ": ");
                so = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
                sc.nextLine();
                continue;
            }
            i++;
            sv = new Double(so);
            list.add(sv);
            System.out.print("Bạn có muốn nhập thêm Y/N: ");
            sc.nextLine();
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("Y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public static final double Xmin(double... soMin) {
        double min = list.get(0);
        int i;
        for (i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static final double Xmax(double... soMax) {
        double max = list.get(0);
        int i;
        for (i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        nhap();
        System.out.println("Số lớn nhất: " + Xmax());
        System.out.println("Số nhỏ nhất: " + Xmin());
    }
}
