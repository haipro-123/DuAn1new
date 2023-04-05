/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.service.impl;

import java.util.List;
import javaapplication24.repository.HopThitViewRepository;
import javaapplication24.viewmodel.HopThitViewModel;

/**
 *
 * @author Admin
 */
public class HopThitViewService {
    HopThitViewRepository htvr = new HopThitViewRepository();
    public List<HopThitViewModel> getList() {
        return htvr.getList();
    }
    
}
