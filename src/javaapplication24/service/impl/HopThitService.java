/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.service.impl;

import java.util.List;
import javaapplication24.model.HopThit;
import javaapplication24.repository.HopThitRepository;
import javaapplication24.repository.LoaiThitRepository;

/**
 *
 * @author Admin
 */
public class HopThitService {
    HopThitRepository htr = new HopThitRepository();
    public List<HopThit> getList() {
        return htr.getList();
    }

    public boolean add(HopThit ht) {
        return htr.add(ht);
    }

    public boolean update(HopThit ht) {
        return htr.update(ht);
    }
    
}
