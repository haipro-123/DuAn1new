/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.viewmodel;

/**
 *
 * @author Admin
 */
public class HopThitViewModel {
    private String loaiThit;
    private double trongLuong;
    private double gia;
    private int soLuong;
    private String ngaySanXuat;

    public HopThitViewModel() {
    }

    public HopThitViewModel(String loaiThit, double trongLuong, double gia, int soLuong, String ngaySanXuat) {
        this.loaiThit = loaiThit;
        this.trongLuong = trongLuong;
        this.gia = gia;
        this.soLuong = soLuong;
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getLoaiThit() {
        return loaiThit;
    }

    public void setLoaiThit(String loaiThit) {
        this.loaiThit = loaiThit;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    
    
}
