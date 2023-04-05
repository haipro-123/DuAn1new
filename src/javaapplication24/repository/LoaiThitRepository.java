/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.repository;

import java.util.List;
import javaapplication24.model.LoaiThit;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class LoaiThitRepository {
   
    public List<LoaiThit> getList() {
        String query = """
                       SELECT [idLoaiThit]
                             ,[idThit]
                             ,[Ten]
                             ,[GiaTheoKg]
                             ,[HSD]
                             ,[moTa]
                         FROM [dbo].[LoaiThit]
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<LoaiThit> list = new ArrayList<>();
            while(rs.next()){
                LoaiThit t = new LoaiThit(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(LoaiThit lt) {
        int check =0;
        String query = """
                       INSERT INTO [dbo].[LoaiThit]
                                  ([idThit]
                                  ,[Ten]
                                  ,[GiaTheoKg]
                                  ,[HSD]
                                  ,[moTa])
                            VALUES (?,?,?,?,?)
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, lt.getIdThit());
            ps.setObject(2, lt.getTen());
            ps.setObject(3, lt.getGiaTheoKg());
            ps.setObject(4, lt.getHSD());
            ps.setObject(5, lt.getMoTa());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }

    public boolean update(LoaiThit lt) {
        int check =0;
        String query = """
                       UPDATE [dbo].[LoaiThit]
                          SET [idThit] = ?
                             ,[Ten] = ?
                             ,[GiaTheoKg] = ?
                             ,[HSD] = ?
                             ,[moTa] = ?
                        WHERE [idLoaiThit] = ?
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, lt.getIdThit());
            ps.setObject(2, lt.getTen());
            ps.setObject(3, lt.getGiaTheoKg());
            ps.setObject(4, lt.getHSD());
            ps.setObject(5, lt.getMoTa());
            ps.setObject(6, lt.getIdLoaiThit());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
    
}
