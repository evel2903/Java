/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.GiaoVienDTO;
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
public class GiaoVienDAL {

    public ArrayList<GiaoVienDTO> getAllTeacher(){
        ArrayList<GiaoVienDTO> listStudent = new ArrayList<>();
        String sql = "SELECT * FROM `tablegiaovien`";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listStudent.add(new GiaoVienDTO(
                            rs.getString("idtablegiaovien"),
                            rs.getString("tengiaovien"),
                            rs.getString("ngaysinh"),
                            rs.getString("gioitinh")
                ));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStudent;
    }
    
    public boolean createTeacher(GiaoVienDTO giaoVienDTO){   
        String sql = "INSERT INTO `doan`.`tablegiaovien` (`idtablegiaovien`, `tengiaovien`, `ngaysinh`, `gioitinh`) VALUES (?, ?, ?, ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, giaoVienDTO.getIdtablegiaovien());
            preparedStatement.setString(2, giaoVienDTO.getTengiaovien());
            preparedStatement.setString(3, giaoVienDTO.getNgaysinh());
            preparedStatement.setString(4, giaoVienDTO.getGioitinh());
            
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }  
    public boolean updateTeacher(GiaoVienDTO giaoVienDTO){   
        String sql="UPDATE `doan`.`tablegiaovien` SET `tengiaovien` = ?, `ngaysinh` = ?, `gioitinh` = ? WHERE (`idtablegiaovien` = ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, giaoVienDTO.getTengiaovien());
            preparedStatement.setString(2, giaoVienDTO.getNgaysinh());
            preparedStatement.setString(3, giaoVienDTO.getGioitinh());
            preparedStatement.setString(4, giaoVienDTO.getIdtablegiaovien());
            
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienDAL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }  
    public boolean deleteTeacher(String id){
        String sql="DELETE FROM `doan`.`tablegiaovien` WHERE (`idtablegiaovien` = ?);";
        
        try {
            Connection con = new ConnectionUtil().getConnection();   
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            
            return ps.executeUpdate() > 0;
        }catch (SQLException ex) {
                Logger.getLogger(GiaoVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
