/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToanNM_PC09504_Lab7;

/**
 *
 * @author ToanNM_PC09504
 */
public class Bai1_HV extends Bai1_HCN{
    public double canh;

    public Bai1_HV() {
    }

    public Bai1_HV(double canh) {
        this.canh = canh;
    }
    
    @Override
    public double chuVi(){
        return (canh*4);
    }
    
    @Override
    public double dienTich(){
        return (canh*canh);
    }
    
    @Override
    public void xuat(){
        System.out.println("Canh hinh vuong: "+canh);
        System.out.println("Chu Vi HV: "+chuVi());
        System.out.println("Dien Tich HV: "+dienTich());
    }
}
