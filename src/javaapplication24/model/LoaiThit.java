/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.model;

/**
 *
 * @author Admin
 */
public class LoaiThit {
    private String idLoaiThit;
    private String idThit;
    private String ten;
    private int giaTheoKg;
    private int HSD;
    private String moTa;
    public LoaiThit() {
    }

    public LoaiThit(String idLoaiThit, String idThit, String ten, int giaTheoKg, int HSD, String moTa) {
        this.idLoaiThit = idLoaiThit;
        this.idThit = idThit;
        this.ten = ten;
        this.giaTheoKg = giaTheoKg;
        this.HSD = HSD;
        this.moTa = moTa;
    }

    public LoaiThit(String idThit, String ten, int giaTheoKg, int HSD, String moTa) {
        this.idThit = idThit;
        this.ten = ten;
        this.giaTheoKg = giaTheoKg;
        this.HSD = HSD;
        this.moTa = moTa;
    }
    public String getIdLoaiThit() {
        return idLoaiThit;
    }

    public void setIdLoaiThit(String idLoaiThit) {
        this.idLoaiThit = idLoaiThit;
    }

    public String getIdThit() {
        return idThit;
    }

    public void setIdThit(String idThit) {
        this.idThit = idThit;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
