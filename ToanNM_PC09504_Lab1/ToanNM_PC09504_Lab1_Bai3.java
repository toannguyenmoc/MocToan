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
public class ToanNM_PC09504_Lab1_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập vào cạnh của 1 khối lập phương: ");
        double canh = sc.nextInt();
        
        double theTich = Math.pow(canh,3);
        
        System.out.println("Thể tích khối lập phương: "+theTich);
    }
}
