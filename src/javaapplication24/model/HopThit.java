/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.model;

/**
 *
 * @author Admin
 */
public class HopThit {
    private String idHopThit;
    private String idLoaiThit;
    private double trongLuong;
    private double gia;
    private int soLuong;
    private String ngaySanXuat;

    public HopThit() {
    }

    public HopThit(String idHopThit, String idLoaiThit, double trongLuong, double gia, int soLuong, String ngaySanXuat) {
        this.idHopThit = idHopThit;
        this.idLoaiThit = idLoaiThit;
        this.trongLuong = trongLuong;
        this.gia = gia;
        this.soLuong = soLuong;
        this.ngaySanXuat = ngaySanXuat;
    }
    public HopThit(String idLoaiThit, double trongLuong, double gia, int soLuong, String ngaySanXuat) {
        this.idLoaiThit = idLoaiThit;
        this.trongLuong = trongLuong;
        this.gia = gia;
        this.soLuong = soLuong;
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getIdHopThit() {
        return idHopThit;
    }

    public void setIdHopThit(String idHopThit) {
        this.idHopThit = idHopThit;
    }

    public String getIdLoaiThit() {
        return idLoaiThit;
    }

    public void setIdLoaiThit(String idLoaiThit) {
        this.idLoaiThit = idLoaiThit;
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
