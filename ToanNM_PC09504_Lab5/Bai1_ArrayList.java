/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai1_ArrayList {
    
    public void bai1() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<Double>();
        int i = 0;
        while (true) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            double so = sc.nextDouble();
            list.add(so);
            sc.nextLine();
            i++;
            System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
        System.out.println("---------------------------");
        System.out.println("Danh sách các số vừa nhập:");

        double sum = 0;
        for (double x : list) {
            System.out.print(x + "  ");
            sum += x;
        }
        System.out.println("\nTổng các số trong list: " + sum);
    }

    public static void main(String[] args) {
        Bai1_ArrayList tong = new Bai1_ArrayList();
        tong.bai1();
    }
}
