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
public class Bai3 {

    static Scanner sc = new Scanner(System.in);
    private static String hoTen;
    private static String mauHoTen = "[a-zA-Z ]{1,50}";

    public static void nhap() {
        while (true) {
            System.out.print("Nhập vào họ tên:   ");
            hoTen = sc.nextLine();
            if (hoTen.matches(mauHoTen) == true) {
                break;
            } else {
                System.out.println("Vui lòng nhập đúng định dạng, Họ Tên không có số");
                continue;
            }
        }
    }

    public static void doi() {
        String word[] = hoTen.split(" ");
        char kyTuDau;

        for (int i = 0; i < word.length; i++) {
            kyTuDau = word[i].charAt(0);
            String hoaChuDau = String.valueOf(kyTuDau).toUpperCase();
            //char hoaChuDau = String.valueOf(kyTuDau).toUpperCase().charAt(0);
            word[i] = hoaChuDau + word[i].substring(1);
        }
        String chuoiMoi = String.join(" ", word);
        System.out.println("Họ tên sau khi chỉnh sửa:   " + chuoiMoi);
    }

    public static void main(String[] args) {
        nhap();
        doi();
    }
}
