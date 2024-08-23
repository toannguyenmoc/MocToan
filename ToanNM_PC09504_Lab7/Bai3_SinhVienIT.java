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
public class Bai3_SinhVienIT extends Bai2_SinhVienPoly {

    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public Bai3_SinhVienIT() {
    }

    public Bai3_SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen) {
        super(hoTen);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public Bai3_SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    @Override
    public double diemTB() {
        return (diemJava * 2 + diemCss + diemHtml) / 4;
    }
    
}
