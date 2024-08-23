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
public class ToanNM_PC09504_Lab2_Bai1 {

    public static void main(String[] args) {
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
}
