/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.MonHocDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MonHocDAL {
    public ArrayList<MonHocDTO> getAllSubject() {
        ArrayList<MonHocDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM `tablemonhoc`";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                list.add(new MonHocDTO(
                        rs.getString("idtablemonhoc"), 
                        rs.getString("tenmonhoc"), 
                        rs.getInt("sotiet"))
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonHocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }


    public boolean createSubject(MonHocDTO monhocDTO){
        String sql = "INSERT INTO `doan`.`tablemonhoc` (`idtablemonhoc`, `tenmonhoc`, `sotiet`) " + "VALUES (?, ?, ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, monhocDTO.getIdtablemonhoc());
            preparedStatement.setString(2, monhocDTO.getTenmonhoc());
            preparedStatement.setInt(3, monhocDTO.getSotiet());

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(MonHocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }

    //update môn học
    public boolean updateSubject(MonHocDTO monhocDTO) {
        String sql = "UPDATE `doan`.`tablemonhoc` SET `tenmonhoc` = ?, `sotiet` = ? WHERE (`idtablemonhoc` = ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, monhocDTO.getTenmonhoc());
            preparedStatement.setInt(2, monhocDTO.getSotiet());
            preparedStatement.setString(3, monhocDTO.getIdtablemonhoc());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(MonHocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }

    //delete monhoc
    public boolean deleteSubject(String id) {
        String sql = "DELETE FROM `doan`.`tablemonhoc` WHERE (`idtablemonhoc` = ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1,id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(MonHocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

}
