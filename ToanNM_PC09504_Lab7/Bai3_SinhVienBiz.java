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
public class Bai3_SinhVienBiz extends Bai2_SinhVienPoly {

    public double diemMaKT;
    public double diemSale;

    public Bai3_SinhVienBiz() {
    }

    public Bai3_SinhVienBiz(double diemMaKT, double diemSale, String hoTen) {
        super(hoTen);
        this.diemMaKT = diemMaKT;
        this.diemSale = diemSale;
    }

    public double getDiemMaKT() {
        return diemMaKT;
    }

    public void setDiemMaKT(double diemMaKT) {
        this.diemMaKT = diemMaKT;
    }

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }

    public Bai3_SinhVienBiz(double diemMaKT, double diemSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMaKT = diemMaKT;
        this.diemSale = diemSale;
    }

    @Override
    public double diemTB() {
        return (diemMaKT * 2 + diemSale) / 3;
    }
}
