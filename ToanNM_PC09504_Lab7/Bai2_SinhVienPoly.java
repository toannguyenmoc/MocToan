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
public abstract class Bai2_SinhVienPoly {
    Scanner sc = new Scanner(System.in);

    public String hoTen;
    public String nganh;

    public abstract double diemTB();

    public Bai2_SinhVienPoly() {
    }

    public Bai2_SinhVienPoly(String hoTen) {
        this.hoTen = hoTen;
    }

    public Bai2_SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String hocLuc() {
        if (diemTB() < 5) {
            return "Yếu";
        } else if (diemTB() >= 5 && diemTB() < 6.5) {
            return "Trung Bình";
        } else if (diemTB() >= 6.5 && diemTB() < 7.5) {
            return "Khá";
        } else if (diemTB() >= 7.5 && diemTB() < 9) {
            return "Giỏi";
        } else {
            return "Xuất Sắc";
        }
    }
    
    public void xuat() {
        System.out.println("Họ Tên: "+hoTen);
        System.out.println("Ngành: "+nganh);
        System.out.println("Điểm TB: "+diemTB());
        System.out.println("Học Lực: "+hocLuc());
    }
}
