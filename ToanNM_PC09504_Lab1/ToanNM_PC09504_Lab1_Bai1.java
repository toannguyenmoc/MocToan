/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab1;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class ToanNM_PC09504_Lab1_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập vào Họ và Tên: ");
        String hoTen = sc.nextLine();
        
        System.out.print("Nhập vào điểm trung bình: ");
        double diemTB = sc.nextDouble();
        
        System.out.println(hoTen+": "+diemTB);
    }
}
