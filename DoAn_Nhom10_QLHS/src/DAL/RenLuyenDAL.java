/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.RenLuyenDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class RenLuyenDAL {

    private ConnectionUtil conUtil;
    private Connection con;
    PreparedStatement preparedStatement;

    public boolean ValueAdd(RenLuyenDTO renLuyenDTO) {
        int check = 0;
        try {
            String sql = "INSERT INTO `doan`.`tablerenluyen` (`idtablerenluyen`, `idtablehocsinh`, `idtablehocki`, `ghichu`) VALUES (?, ?, ?, ?);";

            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, renLuyenDTO.getIdtablerenluyen());
            preparedStatement.setString(2, renLuyenDTO.getIdtablehocsinh());
            preparedStatement.setString(3, renLuyenDTO.getIdtablehocki());
            preparedStatement.setString(4, renLuyenDTO.getGhichu());

            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Mã rèn luyện không được trùng \n Mã học sinh,Mã học kì phải có trước đó");
        }finally {
            try {
                con.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return check != 0;
    }

    public boolean ValueDelete(RenLuyenDTO renLuyenDTO) {
        int check=0;
        String sql = "DELETE FROM `doan`.`tablerenluyen` WHERE (`idtablerenluyen` = ?);";

        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, renLuyenDTO.getIdtablerenluyen());
            check= preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
        finally {
            try {
                con.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return check!=0;
    }
    
    public boolean ValueUpdate(RenLuyenDTO renLuyenDTO){
        int check=0;
        String sql="UPDATE `doan`.`tablerenluyen` SET `idtablehocsinh` = ?, `idtablehocki` = ?, `ghichu` = ? WHERE (`idtablerenluyen` = ?);";
        
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, renLuyenDTO.getIdtablehocsinh());
            preparedStatement.setString(2, renLuyenDTO.getIdtablehocki());
            preparedStatement.setString(3, renLuyenDTO.getGhichu());
            preparedStatement.setString(4, renLuyenDTO.getIdtablerenluyen());
            
            check=preparedStatement.executeUpdate();
        } catch (Exception e) {
        }finally {
            try {
                con.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return check!=0;
    
    }
}
