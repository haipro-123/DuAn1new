/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.repository;

import java.util.List;
import javaapplication24.model.HopThit;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class HopThitRepository {

    public List<HopThit> getList() {
       String query = """
                       SELECT [idHopThit]
                             ,[idLoaiThit]
                             ,[TrongLuong]
                             ,[Gia]
                             ,[SoLuong]
                             ,[NgaySanXuat]
                         FROM [dbo].[HopThit]
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<HopThit> list = new ArrayList<>();
            while(rs.next()){
                HopThit t = new HopThit(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HopThit ht) {
        int check =0;
        String query = """
                       INSERT INTO [dbo].[HopThit]
                                  ([idLoaiThit]
                                  ,[TrongLuong]
                                  ,[SoLuong]
                                  ,[NgaySanXuat]
                                  ,[Gia])
                            VALUES (?,?,?,?,?)
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, ht.getIdLoaiThit());
            ps.setObject(2, ht.getTrongLuong());
            ps.setObject(3, ht.getSoLuong());
            ps.setObject(4, ht.getNgaySanXuat());
            ps.setObject(5, ht.getGia());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }

    public boolean update(HopThit ht) {
        int check =0;
        String query = """
                       UPDATE [dbo].[HopThit]
                          SET [idLoaiThit] = ?
                             ,[TrongLuong] = ?
                             ,[SoLuong] = ?
                             ,[NgaySanXuat] = ?
                             ,[Gia] = ?
                        WHERE [idHopThit] = ?
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, ht.getIdLoaiThit());
            ps.setObject(2, ht.getTrongLuong());
            ps.setObject(3, ht.getSoLuong());
            ps.setObject(4, ht.getNgaySanXuat());
            ps.setObject(5, ht.getGia());
            ps.setObject(6, ht.getIdHopThit());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
    
}
