/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab6;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai1_Lab6 {

    Scanner sc = new Scanner(System.in);

    public void bai1() {
        String hoTen;
        System.out.print("Nhập họ và tên: ");
        hoTen = sc.nextLine();

        int khoangTrangDau = hoTen.indexOf(" ");
        int khoangTrangCuoi = hoTen.lastIndexOf(" ");

        String ho = hoTen.substring(0, khoangTrangDau);
        String ten = hoTen.substring(khoangTrangCuoi, hoTen.length());
        String hoLot = hoTen.substring(khoangTrangDau, khoangTrangCuoi);

        System.out.println("Họ: " + ho.trim().toUpperCase());
        System.out.println("Họ lót: " + hoLot.trim().toLowerCase());
        System.out.println("Tên: " + ten.trim().toUpperCase());
    }

    public static void main(String[] args) {
        Bai1_Lab6 n = new Bai1_Lab6();
        n.bai1();
    }
}
