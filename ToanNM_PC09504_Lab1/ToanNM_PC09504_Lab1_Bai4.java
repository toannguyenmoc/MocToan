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
public class ToanNM_PC09504_Lab1_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Phương trình bậc 2: ax^2+bx+c=0");
        System.out.print("Nhập vào hệ số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập vào hệ số c: ");
        int c = sc.nextInt();
        
        double delta = Math.pow(b,2)-4*a*c;
        
        System.out.println("Delta = "+delta);
        System.out.println("Căn Delta = "+(double)Math.round(Math.sqrt(delta)*100)/100);
    }
}
