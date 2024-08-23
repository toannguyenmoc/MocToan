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
public class Bai1_HCN {
    
    Scanner sc = new Scanner(System.in);
    
    public double rong;
    public double dai;

    public Bai1_HCN() {
    }

    public Bai1_HCN(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
    
    public double chuVi(){
        return (dai+rong)*2;
    }
    
    public double dienTich(){
        return (dai*rong);
    }
    
    public void xuat(){
        System.out.println("Chiều Dài: "+dai);
        System.out.println("Chiều Rộng: "+rong);
        System.out.println("Chu Vi HCN: "+chuVi());
        System.out.println("Diện Tích HCN: "+dienTich());
    }
    public static void main(String[] args) {
       
    }
}
