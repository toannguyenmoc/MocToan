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
public class ToanNM_PC09504_Lab1_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập vào 2 cạnh HCN:");
        System.out.print("Nhập vào cạnh thứ nhất: ");
        int canh1 = sc.nextInt();
        System.out.print("Nhập vào cạnh thứ hai: ");
        int canh2 = sc.nextInt();
        
        int chuVi = (canh1+canh2)*2;
        int dienTich = canh1 * canh2;
        int min = Math.min(canh1,canh2);
        
        System.out.println("Chu Vi HCN: "+chuVi);
        System.out.println("Diện tích HCN: "+dienTich);
        System.out.println("Cạnh nhỏ nhất: "+min);
    }
}
