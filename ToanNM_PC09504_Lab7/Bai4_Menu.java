/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai4_Menu {

    Scanner sc = new Scanner(System.in);
    ArrayList<Bai2_SinhVienPoly> list = new ArrayList<>();
    Bai2_SinhVienPoly sv;

    private String hoTen;
    private String nganh;
    private double diemJava;
    private double diemCss;
    private double diemHtml;
    private double diemMKT;
    private double diemSale;

    private String mauHoTen = "[a-eg-ik-vxyA-EG-IK-VXY ]{1,50}";

    public void nhap() {
        while (true) {
            while (true) {
                System.out.print("Nhập họ tên Sinh Viên: ");
                hoTen = sc.nextLine();
                if (hoTen.matches(mauHoTen)) {
                    break;
                } else {
                    continue;
                }
            }
            while (true) {
                System.out.print("Nhập tên ngành (IT/Biz): ");
                nganh = sc.nextLine();
                if (nganh.equalsIgnoreCase("IT")) {
                    while (true) {
                        try {
                            System.out.print("Điểm Java: ");
                            diemJava = sc.nextDouble();
                            System.out.print("Điểm Css: ");
                            diemCss = sc.nextDouble();
                            System.out.print("Điểm Html: ");
                            diemHtml = sc.nextDouble();
                            if (diemJava < 0 || diemJava > 10 || diemCss < 0 || diemCss > 10 || diemHtml < 0 || diemHtml > 10) {
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Vui lòng nhập số !!!");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    }
                    sv = new Bai3_SinhVienIT(diemJava, diemCss, diemHtml, hoTen, nganh);
                    list.add(sv);
                    break;
                } else if (nganh.equalsIgnoreCase("Biz")) {
                    while (true) {
                        try {
                            System.out.print("Điểm MarKetting: ");
                            diemMKT = sc.nextDouble();
                            System.out.print("Điểm Sales: ");
                            diemSale = sc.nextDouble();
                            if (diemMKT < 0 || diemMKT > 10 || diemSale < 0 || diemSale > 10) {
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Vui lòng nhập số !!!");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    }
                    sv = new Bai3_SinhVienBiz(diemMKT, diemSale, hoTen, nganh);
                    list.add(sv);
                    break;
                } else {
                    System.out.println("Bạn nhập không đúng chuyên ngành, vui lòng nhập lại.");
                }
                continue;
            }
            System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
            sc.nextLine();
            if (sc.nextLine().equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void xuat() {
        for (Bai2_SinhVienPoly x : list) {
            System.out.println("Họ Tên: " + x.hoTen + ", Chuyên Ngành: " + x.nganh + ", Điểm TB: " + x.diemTB() + ", Học Lực: " + x.hocLuc());
        }
    }

    public void xuatSvGioi() {
        for (Bai2_SinhVienPoly x : list) {
            if (sv.hocLuc().equalsIgnoreCase("Giỏi")) {
                System.out.println("Họ Tên: " + x.hoTen + ", Chuyên Ngành: " + x.nganh + ", Điểm TB: " + x.diemTB() + ", Học Lực: " + x.hocLuc());
            }
        }
    }

    Comparator<Bai2_SinhVienPoly> comp = new Comparator<Bai2_SinhVienPoly>() {
        @Override
        public int compare(Bai2_SinhVienPoly diemTB1, Bai2_SinhVienPoly diemTB2) {
            return Double.compare(diemTB1.diemTB(), diemTB2.diemTB());
        }
    };

    public void sapXep() {
        Collections.sort(list, comp);
        System.out.println("Danh Sách Sinh Viên sắp xếp tăng dần theo Điểm TB:");
        xuat();
    }

    public void menu() {
        System.out.println("++--------------------------------------------------++");
        System.out.println("|\t\tMENU SINH VIÊN                       |");
        System.out.println("|\t1. Nhập Danh Sách Sinh Viên                  |");
        System.out.println("|\t2. Xuất Danh Sách Sinh Viên                  |");
        System.out.println("|\t3. Xuất Danh Sách Sinh Viên có Học Lực Giỏi  |");
        System.out.println("|\t4. Sắp xếp Danh Sách Sinh Viên theo điểm     |");
        System.out.println("|\t5. Kết thúc                                  |");
        System.out.println("++--------------------------------------------------++");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai4_Menu mn = new Bai4_Menu();
        while (true) {
            try {
                mn.menu();

                System.out.print("Chọn chức năng: ");
                int n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1:
                        System.out.println("1. Nhập Danh Sách Sinh Viên");
                        mn.nhap();
                        break;
                    case 2:
                        System.out.println("2. Xuất Danh Sách Sinh Viên");
                        mn.xuat();
                        break;
                    case 3:
                        System.out.println("3. Xuất Danh Sách Sinh Viên có Học Lực Giỏi");
                        mn.xuatSvGioi();
                        break;
                    case 4:
                        System.out.println("4. Sắp xếp Danh Sách Sinh Viên theo điểm");
                        mn.sapXep();
                        break;
                    case 5:
                        System.out.println("------Hẹn Gặp Lại------");
                        System.exit(0);
                    default:
                        System.out.println("Bạn chọn không đúng chức năng.");
                }
            } catch (Exception e) {
                System.out.println("vui lòng nhập số, không nhập ký tự !!!");
                sc.nextLine();
            }
        }

    }
}
