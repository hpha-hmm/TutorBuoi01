/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorbuoi1.modal;

/**
 *
 * @author redstar
 */
public class SinhVienModal {
    private String maSV;
    private String hoTen;
    private double diem;
    private String nganh;

    public SinhVienModal(String maSV, String hoTen, double diem, String nganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
        this.nganh = nganh;
    }

    public SinhVienModal() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
}
