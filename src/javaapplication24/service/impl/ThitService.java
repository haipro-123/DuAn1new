/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.service.impl;

import java.util.List;
import javaapplication24.model.Thit;
import javaapplication24.repository.ThitRepository;

/**
 *
 * @author Admin
 */
public class ThitService {
    ThitRepository tr = new ThitRepository();
    public List<Thit> getList() {
        return tr.getList();
    }

    public boolean add(Thit t) {
        return tr.add(t);
    }

    public boolean update(Thit t) {
        return tr.update(t);
    }
    
}
