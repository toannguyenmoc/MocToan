/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab4;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai2_SanPham {
    public static void main(String[] args) {
        Bai1_SanPham sp1 = new Bai1_SanPham();
        Bai1_SanPham sp2 = new Bai1_SanPham();
        
        System.out.println("Nhập Sản Phẩm 1:");
        sp1.input();
        System.out.println("Nhập Sản Phẩm 2:");
        sp2.input();
        sp1.output(); 
        sp2.output();
    }
}
