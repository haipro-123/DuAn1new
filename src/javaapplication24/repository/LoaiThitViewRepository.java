/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.repository;

import java.util.List;
import javaapplication24.viewmodel.LoaiThitViewModel;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class LoaiThitViewRepository {

    public List<LoaiThitViewModel> getList() {
        String query = """
                       select lt.ten,t.ten,lt.giatheoKg,lt.HSD,lt.moTa from LoaiThit as lt join thit as t on t.idThit = lt.idThit
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<LoaiThitViewModel> list = new ArrayList<>();
            while(rs.next()){
                LoaiThitViewModel ltvm = new LoaiThitViewModel(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5));
                list.add(ltvm);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
