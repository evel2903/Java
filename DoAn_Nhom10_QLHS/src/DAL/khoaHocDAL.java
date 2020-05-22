/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.khoaHocDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class khoaHocDAL {

    private ConnectionUtil conUtil;
    private Connection con;
    PreparedStatement preparedStatement;

    public boolean CreateValueKH(khoaHocDTO khoahocDTO) throws ClassNotFoundException {
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablekhoahoc` (`idtablekhoahoc`) " + "VALUES (?);";

        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, khoahocDTO.getIdKhoahoc());

            check = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("lôi kết nối thêm mới khóa học");
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

    //delete khóa học
    public boolean ValueDelete(khoaHocDTO khoahocDTO) {
        int check = 0;

        String sql = "DELETE FROM `doan`.`tablekhoahoc` WHERE (`idtablekhoahoc` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, khoahocDTO.getIdKhoahoc());
            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "lỗi kết nối khóa học");
        }

        if (check != 0) {
            return true;
        } else {
            return false;
        }
    }
}
