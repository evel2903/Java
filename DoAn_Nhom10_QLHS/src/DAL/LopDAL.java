/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LopDTO;
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
public class LopDAL {

    public ArrayList<LopDTO> getAllClassroom(){
        ArrayList<LopDTO> listStudent = new ArrayList<>();
        String sql = "SELECT * FROM `tablelop`";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listStudent.add(new LopDTO(
                            rs.getString("idtablelop"),
                            rs.getString("tenlop"),
                            rs.getInt("siso"),
                            rs.getString("idtablegiaovien"),
                            rs.getString("idtablekhoahoc")
                ));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStudent;
    }
    // thêm mới lóp học
    public boolean createClassroom(LopDTO lopDTO) {
        Connection con = new ConnectionUtil().getConnection();
        String sql = "INSERT INTO `doan`.`tablelop` (`idtablelop`, `tenlop`, `siso`, `idtablegiaovien`, `idtablekhoahoc` ) " + "VALUES (?, ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, lopDTO.getIdtablelop());
            preparedStatement.setString(2, lopDTO.getTenlop());
            preparedStatement.setInt(3, lopDTO.getSiso());
            preparedStatement.setString(4, lopDTO.getIdtablegiaovien());
            preparedStatement.setString(5, lopDTO.getIdtablekhoahoc());

            return  preparedStatement.executeUpdate()>0;

        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
    }
    
    //xóa lớp học
    public boolean deleteClassroom(String id) {
        String sql = "DELETE FROM `doan`.`tablelop` WHERE (`idtablelop` = ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            
            return  preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
    }
    
    //cập nhật lớp học
    public boolean updateClassroom(LopDTO lopDTO) {
        String sql = "UPDATE `doan`.`tablelop` SET `tenlop` = ?, `siso` = ?, `idtablegiaovien` = ?, `idtablekhoahoc` = ? WHERE (`idtablelop` = ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, lopDTO.getTenlop());
            preparedStatement.setInt(2, lopDTO.getSiso());
            preparedStatement.setString(3, lopDTO.getIdtablegiaovien());
            preparedStatement.setString(4, lopDTO.getIdtablekhoahoc());
            preparedStatement.setString(5, lopDTO.idtablelop);
            
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
        
    }
    

}
