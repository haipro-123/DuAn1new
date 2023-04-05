/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.service.impl;

import java.util.List;
import javaapplication24.repository.LoaiThitViewRepository;
import javaapplication24.viewmodel.LoaiThitViewModel;

/**
 *
 * @author Admin
 */
public class LoaiThitViewService {
    LoaiThitViewRepository ltvr = new LoaiThitViewRepository();
    public List<LoaiThitViewModel> getList() {
        return ltvr.getList();
    }
    
}
