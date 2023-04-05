/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24.repository;

import java.util.List;
import javaapplication24.model.Thit;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class ThitRepository {

    public List<Thit> getList() {
        String query = """
                       SELECT [idThit]
                             ,[Ten]
                             ,[Mota]
                         FROM [dbo].[Thit]
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<Thit> list = new ArrayList<>();
            while(rs.next()){
                Thit t = new Thit(rs.getString(1),rs.getString(2),rs.getString(3));
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Thit t) {
        int check =0;
        String query = """
                       INSERT INTO [dbo].[Thit]
                                  ([Ten]
                                  ,[Mota])
                            VALUES (?,?)
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, t.getTen());
            ps.setObject(2, t.getMoTa());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }

    public boolean update(Thit t) {
        int check =0;
        String query = """
                       UPDATE [dbo].[Thit]
                          SET [Ten] = ?
                             ,[Mota] = ?
                        WHERE [idThit] = ?
                       """;
        try(Connection con = DBconnect.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, t.getTen());
            ps.setObject(2, t.getMoTa());
            ps.setObject(3, t.getIdThit());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
    
}
