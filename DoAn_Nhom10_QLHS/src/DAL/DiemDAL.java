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
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DiemDAL {

    private ConnectionUtil conUtil;
    private Connection con;
    PreparedStatement preparedStatement;

    public boolean ValueAddDiem(DiemDTO diemDTO) {
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablediemthi` (`idtablebangdiem`, `idtablehocsinh`, `idtablemonhoc`, `idtablehocki`, `diemtrungbinh`) VALUES (?, ?, ?, ?, ?);";
        String sql2 = "INSERT INTO `doan`.`tablediemthi` (`idtablebangdiem`, `idtablehocsinh`, `idtablemonhoc`, `idtablehocki`, `diemtrungbinh`) VALUES (?, ?, ?, ?, ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, diemDTO.getIdtablebangdiem());
            preparedStatement.setString(2, diemDTO.getIdtablehocsinh());
            preparedStatement.setString(3, diemDTO.getIdtablemonhoc());
            preparedStatement.setString(4, diemDTO.getIdtablehocki());
            preparedStatement.setInt(5, diemDTO.getDiemtrungbinh());

            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "loi ket noi");
        }
        return check > 0;
    }

    public boolean ValuesUpdate(DiemDTO diemDTO) {
        int check = 0;
        String sql = "UPDATE `doan`.`tablediemthi` SET `idtablehocsinh` = ?, `idtablemonhoc` = ?, `idtablehocki` = ?, `diemtrungbinh` = ? WHERE (`idtablebangdiem` = ?);";

        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, diemDTO.getIdtablehocsinh());
            preparedStatement.setString(2, diemDTO.getIdtablemonhoc());
            preparedStatement.setString(3, diemDTO.getIdtablehocki());
            preparedStatement.setInt(4, diemDTO.getDiemtrungbinh());
            preparedStatement.setString(5, diemDTO.getIdtablebangdiem());

            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Lỗi kết nối cơ sở dữ liệu");
        } finally {
            try {
                con.close();
                preparedStatement.close();
            } catch (Exception e) {

            }
        }
        return check > 0;
    }

    public boolean ValuesDelete(DiemDTO diemDTO) {
        int check = 0;
        String sql = "DELETE FROM `doan`.`tablediemthi` WHERE (`idtablebangdiem` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, diemDTO.getIdtablebangdiem());
            check = preparedStatement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Lỗi kết lỗi cơ sở dữ liệu bảng điểm");
        } finally {
            try {
                con.close();
                preparedStatement.close();
            } catch (Exception e) {
            }
        }
        return check > 0;
    }
}
