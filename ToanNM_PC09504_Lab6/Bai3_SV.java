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
public class Bai3_SV {

    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;

    private String mauEm1 = "[a-zA-Z0-9]{5,30}@gmail.com";
    private String mauEm2 = "[a-zA-Z0-9]{5,30}@fpt.edu.vn";
    private String mauSdt = "0[35-9]{1}[0-9]{8,9}";
    private String mauCmnd = "[0-9]{9}";
    private String mauCccd = "0[0-9]{2}[0-3]{1}[0-9]{8}";

    public Bai3_SV() {
    }

    public Bai3_SV(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<Bai3_SV> list = new ArrayList<>();
    Bai3_SV sv;

    public void input() {
        int i = 0;
        while (i < 5) {
            System.out.println("Nhập thông tin Sinh Viên "+(i+1)+": ");
            System.out.print("Nhập họ tên: ");
            hoTen = sc.nextLine();
            while (true) {
                System.out.print("Nhập mail: ");
                email = sc.nextLine();
                if (email.matches(mauEm1) || email.matches(mauEm2)) {
                    break;
                } else {
                    System.out.println("Bạn nhập không đúng định dạng, vui lòng nhập lại");
                    continue;
                }
            }
            while (true) {
                System.out.print("Nhập số điện thoại: ");
                sdt = sc.nextLine();
                if (sdt.matches(mauSdt)) {
                    break;
                } else {
                    System.out.println("Bạn nhập không đúng định dạng, vui lòng nhập lại");
                    continue;
                }
            }
            while (true) {
                System.out.print("Nhập CMND hoặc CCCD: ");
                cmnd = sc.nextLine();
                if (cmnd.matches(mauCmnd) || cmnd.matches(mauCccd)) {
                    break;
                } else {
                    System.out.println("Bạn nhập không đúng định dạng, vui lòng nhập lại");
                    continue;
                }
            }
            sv = new Bai3_SV(hoTen, email, sdt, cmnd);
            list.add(sv);
        }
    }

    public static void main(String[] args) {
        Bai3_SV sv = new Bai3_SV();
        sv.input();
    }
}
