/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.viewmodel;

/**
 *
 * @author Admin
 */
public class LoaiThitViewModel {
    private String ten;
    private String thit;
    private int giaTheoKg;
    private int HSD;
    private String moTa;
    public LoaiThitViewModel() {
    }

    public LoaiThitViewModel(String ten, String thit, int giaTheoKg, int HSD, String moTa) {
        this.ten = ten;
        this.thit = thit;
        this.giaTheoKg = giaTheoKg;
        this.HSD = HSD;
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThit() {
        return thit;
    }

    public void setThit(String thit) {
        this.thit = thit;
    }

    public int getGiaTheoKg() {
        return giaTheoKg;
    }

    public void setGiaTheoKg(int giaTheoKg) {
        this.giaTheoKg = giaTheoKg;
    }

    public int getHSD() {
        return HSD;
    }

    public void setHSD(int HSD) {
        this.HSD = HSD;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    
    
}
