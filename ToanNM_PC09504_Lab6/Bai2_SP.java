/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai2_SP {

    public String tenSP;
    public double donGia;
    public String hang;

    public Bai2_SP() {
    }

    public Bai2_SP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Bai2_SP(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public Bai2_SP(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<Bai2_SP> list = new ArrayList<>();
    Bai2_SP sp;

    public void input() {
        int i = 0;
        while (i < 5) {
            System.out.println("Nhập Sản Phẩm thứ " + (i + 1) + ": ");
            System.out.print("Nhập tên Sản Phẩm: ");
            tenSP = sc.nextLine();
            while (true) {
                try {
                    System.out.print("Nhập đơn giá: ");
                    donGia = sc.nextDouble();
                    if (donGia < 0) {
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số !!!");
                    sc.nextLine();
                    continue;
                }
                break;
            }

            sc.nextLine();
            System.out.print("Nhập hãng: ");
            hang = sc.nextLine();

            sp = new Bai2_SP(tenSP, donGia, hang);
            list.add(sp);
            i++;
        }
    }

    public void output() {
        System.out.println("Các Sản Phẩm có hãng Nokia là:");
        for(int i=0;i<list.size();i++){
            if(list.get(i).hang.equalsIgnoreCase("Nokia")){
                System.out.println("Tên Sản Phẩm: "+list.get(i).tenSP);
                System.out.println("Đơn giá: "+list.get(i).donGia);
                System.out.println("Hãng: "+list.get(i).hang);
            }
        }
    }

    public static void main(String[] args) {
        Bai2_SP sp = new Bai2_SP();
        sp.input();
        sp.output();
    }
}
