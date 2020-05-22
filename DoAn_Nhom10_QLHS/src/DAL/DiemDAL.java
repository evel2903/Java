/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DiemDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DiemDAL {
    private ConnectionUtil conUtil;
    private Connection con;
    PreparedStatement preparedStatement;
    
    public boolean ValueAddDiem(DiemDTO diemDTO){
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablediem` (`idtablehocsinh`, `idtablemonhoc`, `idtablehocki`, `diemtrungbinh`) " + "VALUES (?, ?, ?, ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, diemDTO.getIdtablehocsinh());
            preparedStatement.setString(2, diemDTO.getIdtablemonhoc());
            preparedStatement.setString(3, diemDTO.getIdtablehocki());
            preparedStatement.setFloat(4, diemDTO.getDiemtrungbinh());

            check = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
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
}
