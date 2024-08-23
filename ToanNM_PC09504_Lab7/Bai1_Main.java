/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab7;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai1_HCN hcn = new Bai1_HCN();
        Bai1_HV hv = new Bai1_HV();
        
        System.out.println("Nhập Chiều Dài:");
        hcn.dai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        hcn.rong = sc.nextDouble();
        System.out.println("Nhap canh hinh vuong: ");
        hv.canh = sc.nextDouble();
        
        hcn.xuat();
        hv.xuat();
    }
}
