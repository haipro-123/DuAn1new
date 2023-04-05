/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.model;

/**
 *
 * @author Admin
 */
public class Thit {

    private String idThit;
    private String ten;
    private String moTa;

    public Thit() {
    }

    public Thit(String idThit, String ten, String moTa) {
        this.idThit = idThit;
        this.ten = ten;
        this.moTa = moTa;
    }

    public Thit( String ten, String moTa) {
        this.ten = ten;
        this.moTa = moTa;
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}
