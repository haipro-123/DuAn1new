/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.service.impl;

import java.util.List;
import javaapplication24.model.LoaiThit;
import javaapplication24.repository.LoaiThitRepository;

/**
 *
 * @author Admin
 */
public class LoaiThitService {
    LoaiThitRepository ltr = new LoaiThitRepository();
    public List<LoaiThit> getList() {
        return ltr.getList();
    }

    public boolean add(LoaiThit lt) {
        return ltr.add(lt);
    }

    public boolean update(LoaiThit lt) {
        return ltr.update(lt);
    }
}
