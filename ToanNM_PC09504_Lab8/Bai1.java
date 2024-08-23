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
public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    private static double a;
    private static double b;
    private static double c;
    
    public static void nhap(){
        System.out.print("Nhập a: ");
        a = sc.nextDouble();
        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.print("Nhập c: ");
        c = sc.nextDouble();
    }

    public static final double sum(double... so) {
        double tong = 0;
        for (double x : so) {
            tong += x;
        }
        return tong;
    }
    
    public static void xuat(){
        System.out.println("Tổng 2 số (a,c) là: "+sum(a,c));
        System.out.println("Tổng 3 số (a,b,c) là: "+sum(a,b,c));
    }
    
    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
