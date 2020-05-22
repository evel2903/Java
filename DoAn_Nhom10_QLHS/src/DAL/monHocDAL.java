/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.monHocDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class monHocDAL {

    private ConnectionUtil conUtil;
    private Connection con;
    PreparedStatement preparedStatement;

    // lấy dánh sách môn học để hiển thị
    public ArrayList<monHocDTO> getListMonhoc() {

        ArrayList<monHocDTO> list = new ArrayList<monHocDTO>();
        String sql = "SELECT * FROM doan.tablemonhoc";
        Statement st;
        ResultSet rs;

        try {
            ConnectionUtil conUtil = new ConnectionUtil();
            Connection con = conUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            monHocDTO monhocDTO;

            while (rs.next()) {
                monhocDTO = new monHocDTO(rs.getString("idtablemonhoc"), rs.getString("tenmonhoc"), rs.getInt("sotiet"));
                list.add(monhocDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi hien thi mon hoc");
        }
        return list;
    }

    //them mới môn học
    //String sql = "INSERT INTO `doan`.`tablemonhoc` (`idtablemonhoc`, `tenmonhoc`, `sotiet`) "+"VALUES (?, ?, ?);";
    private ResultSet resultset;

    public boolean CreateValues(monHocDTO monhocDTO) throws SQLException, ClassNotFoundException {
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablemonhoc` (`idtablemonhoc`, `tenmonhoc`, `sotiet`) " + "VALUES (?, ?, ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, monhocDTO.getIdtablemonhoc());
            preparedStatement.setString(2, monhocDTO.getTenmonhoc());
            preparedStatement.setInt(3, monhocDTO.getSotiet());

            check = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
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

    //update môn học
    public boolean updateMonhoc(monHocDTO monhocDTO) {
        int check = 0;
        String sqlupdate = "UPDATE `doan`.`tablemonhoc` SET `tenmonhoc` = ?, `sotiet` = ? WHERE (`idtablemonhoc` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sqlupdate);
            preparedStatement.setString(1, monhocDTO.getTenmonhoc());
            preparedStatement.setInt(2, monhocDTO.getSotiet());
            preparedStatement.setString(3, monhocDTO.getIdtablemonhoc());
            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "lỗi sửa môn học");
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

    //delete monhoc
    public boolean ValuesDelete(monHocDTO monhocDTO) {
        int check = 0;
        String sqldel = "DELETE FROM `doan`.`tablemonhoc` WHERE (`idtablemonhoc` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sqldel);
            preparedStatement.setString(1, monhocDTO.getIdtablemonhoc());
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

    public ResultSet ValuesSearch(monHocDTO monhocDTO, String keyword) {
        ResultSet result = null;
        String sql = "SELECT * FROM doan.tablemonhoc "
                + "WHERE `idtablemonhoc` LIKE '%"+keyword+"%'";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            result = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "lỗi tìm kiếm môn học");
        }
        return resultset;
    }
}
