/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhoaHocDTO;
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
public class KhoaHocDAL {

    public ArrayList<KhoaHocDTO> getAllCourse() {
        ArrayList<KhoaHocDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM `tablekhoahoc`";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                list.add(new KhoaHocDTO(
                        rs.getString("idtablekhoahoc")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonHocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean createCourse(KhoaHocDTO khoahocDTO){
        String sql = "INSERT INTO `doan`.`tablekhoahoc` (`idtablekhoahoc`) " + "VALUES (?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, khoahocDTO.getIdKhoahoc());

            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException ex) {
            Logger.getLogger(MonHocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //delete khóa học
    public boolean deleteCourse(String id) {
        String sql = "DELETE FROM `doan`.`tablekhoahoc` WHERE (`idtablekhoahoc` = ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException ex) {
            Logger.getLogger(MonHocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
