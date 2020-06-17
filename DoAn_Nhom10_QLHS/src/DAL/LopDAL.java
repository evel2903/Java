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
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class LopDAL {

    private ConnectionUtil conUtil;
    private Connection con;
    PreparedStatement preparedStatement;
    LopDTO lopDTO;

    // thêm mới lóp học
    public boolean ValuesAddLop(LopDTO lopDTO) {
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablelop` (`idtablelop`, `tenlop`, `siso`, `idtablegiaovien`, `idtablekhoahoc` ) " + "VALUES (?, ?, ?, ?, ?);";

        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, lopDTO.getIdtablelop());
            preparedStatement.setString(2, lopDTO.getTenlop());
            preparedStatement.setInt(3, lopDTO.getSiso());
            preparedStatement.setString(4, lopDTO.getIdtablegiaovien());
            preparedStatement.setString(5, lopDTO.getIdtablekhoahoc());

            check = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "lỗi kết nối lóp học");
        } finally {
            try {
                con.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (check != 0) {
            return true;
        } else {
            return false;
        }
    }
    
    //xóa lớp học
    public boolean ValuesDelete(LopDTO lopDTO) {
        int check = 0;
        String sqldel = "DELETE FROM `doan`.`tablelop` WHERE (`idtablelop` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sqldel);
            preparedStatement.setString(1, lopDTO.getIdtablelop());
            
            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "lỗi kết nối xóa môn học");
        }
        if (check != 0) {
            return true;
        } else {
            return false;
        }

    }
    
    //cập nhật lớp học
    public boolean ValueUpdateLop(LopDTO lopDTO) {
        int check = 0;
        String sqlupdate = "UPDATE `doan`.`tablelop` SET `tenlop` = ?, `siso` = ?, `idtablegiaovien` = ?, `idtablekhoahoc` = ? WHERE (`idtablelop` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sqlupdate);
            preparedStatement.setString(1, lopDTO.getTenlop());
            preparedStatement.setInt(2, lopDTO.getSiso());
            preparedStatement.setString(3, lopDTO.getIdtablegiaovien());
            preparedStatement.setString(4, lopDTO.getIdtablekhoahoc());
            preparedStatement.setString(5, lopDTO.idtablelop);
            
            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "lỗi kết nối sửa môn học");
        } finally {
            try {
                con.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (check != 0) {
            return true;
        } else {
            return false;
        }
        
    }
    
    //xóa lớp học
    public boolean ValuesDeleteLop(LopDTO lopDTO) {
        int check = 0;
        String sqldel = "DELETE FROM `doan`.`tablemonhoc` WHERE (`idtablemonhoc` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sqldel);
            preparedStatement.setString(1, lopDTO.getIdtablelop());
            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "lỗi xóa môn học");
        }
        if (check != 0) {
            return true;
        } else {
            return false;
        }

    }


}
