/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai3_SP {

    Scanner sc = new Scanner(System.in);

    private String tenSP;
    private double gia;

    public Bai3_SP() {
    }

    public Bai3_SP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Bai3_SP(String tenSP, double gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    ArrayList<Bai3_SP> list = new ArrayList<>();
    Bai3_SP sp;

    public void input() {
        while (true) {
            System.out.print("Nhập tên SP: ");
            tenSP = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Nhập giá: ");
                    gia = sc.nextDouble();
                    if (gia < 0) {
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số");
                    sc.nextLine();
                    continue;
                }
                break;
            }
            sp = new Bai3_SP(tenSP, gia);
            list.add(sp);

            String hoi;
            System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
            sc.nextLine();
            hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void output() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Tên SP: " + list.get(i).tenSP);
            System.out.println("Giá: " + list.get(i).gia);
        }
    }

    public void sortOutput() {
        Comparator<Bai3_SP> comp = new Comparator<Bai3_SP>() {
            public int compare(Bai3_SP sp1, Bai3_SP sp2) {
                if (sp1.gia > sp2.gia) {
                    return 1;
                } else if (sp1.gia < sp2.gia) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(list, comp.reversed());

        System.out.println("Danh Sách SP sắp xếp theo giá giảm dần:");
        output();
    }

    public void timVaXoa() {
        while (true) {
            System.out.print("Nhập tên SP cần xoá: ");
            String xoa = sc.nextLine();
            boolean check = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).tenSP.equalsIgnoreCase(xoa)) {
                    System.out.println("Tìm thấy");
                    System.out.print("Bạn muốn xoá không(Y/N): ");
                    String t = sc.nextLine();
                    if (t.equalsIgnoreCase("y")) {
                        list.remove(i);
                    }
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Không tìm thấy");
            } else {
                System.out.println("Danh sách mới: ");
                output();
            }
            System.out.print("Bạn muốn xoá tiếp không(Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void xuatGiaTB() {
        double tong = 0;
        for (int i = 0; i < list.size(); i++) {
            tong += list.get(i).gia;
        }
        System.out.println("Giá trung bình: " + (tong / list.size()));
    }

    public void menu() {

        while (true) {
            try {

                System.out.println("++--------------------------------------------------++");
                System.out.println("|\t\tMENU BÀI 3: SẢN PHẨM                 |");
                System.out.println("|\t1. Nhập danh sách sản phẩm                   |");
                System.out.println("|\t2. Sắp xếp giảm dần theo giá và xuất ra      |");
                System.out.println("|\t3. Tìm và xoá sản phẩm theo tên nhập         |");
                System.out.println("|\t4. Xuất giá trung bình của các sản phẩm      |");
                System.out.println("|\t5. Kết thúc                                  |");
                System.out.println("++--------------------------------------------------++");

                System.out.print("Chọn chức năng: ");
                int n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1:
                        System.out.println("Nhập danh sách sản phẩm:");
                        input();
                        break;
                    case 2:
                        System.out.println("Sắp xếp và xuất danh sách vừa nhập:");
                        sortOutput();
                        break;
                    case 3:
                        System.out.println("Tìm và xoá sản phẩm theo tên nhập:");
                        timVaXoa();
                        break;
                    case 4:
                        System.out.println("Xuất giá trung bình của các sản phẩm");
                        xuatGiaTB();
                        break;
                    case 5:
                        System.out.println("------Hẹn Gặp Lại------");
                        return;
                    default:
                        System.out.println("Bạn chọn không đúng chức năng.");
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số, không nhập ký tự");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Bai3_SP sp = new Bai3_SP();
        sp.menu();
    }
}
