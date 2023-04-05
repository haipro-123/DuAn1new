/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.repository;

import java.util.List;
import javaapplication24.viewmodel.HopThitViewModel;
import java.sql.*;
import java.util.ArrayList;
import javaapplication24.viewmodel.LoaiThitViewModel;
/**
 *
 * @author Admin
 */
public class HopThitViewRepository {

    public List<HopThitViewModel> getList() {
        String query = """
                       select lt.ten,ht.trongluong,ht.gia,ht.soluong,ht.ngaysanxuat from hopThit as ht join loaithit as lt on ht.idLoaithit= lt.idLoaithit
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<HopThitViewModel> list = new ArrayList<>();
            while(rs.next()){
                HopThitViewModel htv = new HopThitViewModel(rs.getString(1),rs.getDouble(2),rs.getDouble(3), rs.getInt(4),rs.getString(5));
                list.add(htv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
