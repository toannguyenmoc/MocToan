/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab2;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class ToanNM_PC09504_Lab2_Bai5 {

    public static void karaoke() {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Giờ bắt đầu: ");
            int batDau = sc.nextInt();
            System.out.print("Giờ kết thúc: ");
            int ketThuc = sc.nextInt();

            if (batDau >= 12 && batDau <= 23 && ketThuc <= 23 && batDau <= ketThuc) {

                int soGio = ketThuc - batDau;
                int tienGiam;

                if (soGio <= 3) {
                    tienGiam = 0;
                } else {
                    tienGiam = (soGio - 3) * 150000 * 30 / 100;
                }

                System.out.println("Số giờ hát: " + soGio);
                System.out.println("Thành tiền: " + (soGio * 150000));
                System.out.println("Tiền giảm: " + tienGiam);
                System.out.println("Tiền thanh toán: " + (soGio * 150000 - tienGiam));
            } else {
                System.out.println("Không trong khoảng thời gian hoạt động: Vui lòng nhập lại!");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số, không nhập ký tự");
        }
    }

    public static void tienDien() {
        Scanner sc = new Scanner(System.in);
        try {

            int suDung, tienTra;

            System.out.print("Số (kwh) điện sử dụng: ");
            suDung = sc.nextInt();

            if (suDung < 0) {
                System.out.println("Nhập sai số (kwh), vui lòng nhập số dương! ");
            } else {

                if (suDung >= 0 && suDung <= 50) {
                    tienTra = suDung * 1678;
                } else if (suDung > 50 && suDung <= 100) {
                    tienTra = 50 * 1678 + (suDung - 50) * 1734;
                } else if (suDung > 100 && suDung <= 200) {
                    tienTra = 50 * (1678 + 1734) + (suDung - 100) * 2014;
                } else if (suDung > 200 && suDung <= 300) {
                    tienTra = 50 * (1678 + 1734) + 100 * 2014 + (suDung - 200) * 2536;
                } else if (suDung > 300 && suDung <= 400) {
                    tienTra = 50 * (1678 + 1734) + 100 * (2014 + 2536) + (suDung - 300) * 2834;
                } else {
                    tienTra = 50 * (1678 + 1734) + 100 * (2014 + 2536 + 2834) + (suDung - 400) * 2927;
                }

                System.out.println("Số tiền phải trả: " + tienTra + " VND");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số, không nhập ký tự!");
        }
    }

    public static void doiTien() {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Các mệnh giá tiền có thể đổi: ");
            System.out.println("500000,200000,100000,50000,20000,10000,5000,2000,1000");
            System.out.print("Nhập vào mệnh giá tiền cần đổi: ");
            int menhGia = sc.nextInt();

            if (menhGia == 500000) {
                System.out.println("Số tiền đổi được là: 2 tờ 200000 và 1 tờ 100000");
            } else if (menhGia == 200000) {
                System.out.println("Số tiền đổi được là: 2 tờ 100000");
            } else if (menhGia == 100000) {
                System.out.println("Số tiền đổi được là: 2 tờ 50000");
            } else if (menhGia == 50000) {
                System.out.println("Số tiền đổi được là: 2 tờ 20000 và 1 tờ 10000");
            } else if (menhGia == 20000) {
                System.out.println("Số tiền đổi được là: 2 tờ 10000");
            } else if (menhGia == 10000) {
                System.out.println("Số tiền đổi được là: 2 tờ 5000");
            } else if (menhGia == 5000) {
                System.out.println("Số tiền đổi được là: 2 tờ 2000 và 1 tờ 1000");
            } else if (menhGia == 2000) {
                System.out.println("Số tiền đổi được là: 2 tờ 1000");
            } else if (menhGia == 1000) {
                System.out.println("Số tiền đổi được là: 2 tờ 500");
            } else {
                System.out.println("Bạn nhập không đúng mệnh giá tiền.");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số, không nhập ký tự!");
        }
    }

    public static void khoiThi() {
        Scanner sc = new Scanner(System.in);
        try {

            int n;
            double toan, ly, hoa, sinh, tongDiem;

            System.out.print("Mời bạn chọn khối thi 1 hoặc 2: ");
            n = sc.nextInt();

            if (n == 1) {
                System.out.print("Nhập điểm Toán: ");
                toan = sc.nextDouble();
                System.out.print("Nhập điểm Lý: ");
                ly = sc.nextDouble();
                System.out.print("Nhập điểm Hoá: ");
                hoa = sc.nextDouble();

                if (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10) {
                    System.out.println("Bạn nhập không đúng điểm.");
                    return;
                }
                tongDiem = toan + ly + hoa;

                if (tongDiem >= 21 && toan >= 7 && ly >= 7 && hoa >= 7) {
                    System.out.println("Chúc mừng bạn đậu ngành CNTT.");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời bạn xét nguyện vọng 2.");
                }
            } else if (n == 2) {
                System.out.print("Nhập điểm Toán: ");
                toan = sc.nextDouble();
                System.out.print("Nhập điểm Hoá: ");
                hoa = sc.nextDouble();
                System.out.print("Nhập điểm Sinh: ");
                sinh = sc.nextDouble();

                if (toan < 0 || toan > 10 || sinh < 0 || sinh > 10 || hoa < 0 || hoa > 10) {
                    System.out.println("Bạn nhập không đúng điểm.");
                    return;
                }
                tongDiem = toan + hoa + sinh;

                if (tongDiem >= 24 && toan >= 8 && hoa >= 8 && sinh >= 8) {
                    System.out.println("Chúc mừng bạn đậu ngành Bác sĩ.");
                } else {
                    System.out.println("Bạn không đủ điểm. Mời bạn xét nguyện vọng 2.");
                }
            } else {
                System.out.println("Bạn nhập không đúng khối thi!");
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số, không nhập ký tự!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\t\tMENU CHƯƠNG TRÌNH");
            System.out.println("++------------------------------------------++");
            System.out.println("|\t1. Tính tiền Karaoke.                |");
            System.out.println("|\t2. Tính tiền điện.                   |");
            System.out.println("|\t3. Đổi tiền.                         |");
            System.out.println("|\t4. Chọn khối thi.                    |");
            System.out.println("|\t5. Thoát.                            |");
            System.out.println("++------------------------------------------++");
            System.out.print("Chọn chức năng: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("----Tính tiền Karaoke----");
                    karaoke();
                    break;
                case 2:
                    System.out.println("------Tính tiền điện------");
                    tienDien();
                    break;
                case 3:
                    System.out.println("--------Đổi tiền--------");
                    doiTien();
                    break;
                case 4:
                    System.out.println("------Chọn Khối Thi------");
                    khoiThi();
                    break;
                case 5:
                    System.out.println("*** Hẹn gặp lại ***");
                    System.exit(0);
                default:
                    System.out.println("Bạn chọn không đúng chức năng");
            }
        }
    }
}
