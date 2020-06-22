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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DiemDAL {
    public ArrayList<DiemDTO> getListDiem(){
        ArrayList<DiemDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM doan.tablediemthi";
        Statement st;
        ResultSet rs;

        try {
            ConnectionUtil conUtil = new ConnectionUtil();
            Connection con = conUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            DiemDTO diemDTO;
            while (rs.next()) {
                diemDTO = new DiemDTO(
                        rs.getString("idtablebangdiem"),
                        rs.getString("idtablehocsinh"),
                        rs.getString("idtablemonhoc"),
                        rs.getString("idtablekhoahoc"),
                        rs.getFloat("diemtrungbinh")
                );
                list.add(diemDTO);

            }
        } catch (Exception e) {
        }
        return list;
    }
    

    private ConnectionUtil conUtil;
    private Connection con;
    PreparedStatement preparedStatement;

    public boolean ValueAddDiem(DiemDTO diemDTO) {
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablediemthi` (`idtablebangdiem`, `idtablehocsinh`, `idtablemonhoc`, `idtablekhoahoc`, `diemtrungbinh`) VALUES (?, ?, ?, ?, ?);";
        
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, diemDTO.getIdtablebangdiem());
            preparedStatement.setString(2, diemDTO.getIdtablehocsinh());
            preparedStatement.setString(3, diemDTO.getIdtablemonhoc());
            preparedStatement.setString(4, diemDTO.getIdtablekhoahoc());
            preparedStatement.setFloat(5, diemDTO.getDiemtrungbinh());

            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "loi ket noi");
        }
        return check > 0;
    }

    public boolean ValuesUpdate(DiemDTO diemDTO) {
        int check = 0;
        String sql = "UPDATE `doan`.`tablediemthi` SET `idtablehocsinh` = ?, `idtablemonhoc` = ?, `idtablekhoahoc` = ?, `diemtrungbinh` = ? WHERE (`idtablebangdiem` = ?);";

        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, diemDTO.getIdtablehocsinh());
            preparedStatement.setString(2, diemDTO.getIdtablemonhoc());
            preparedStatement.setString(3, diemDTO.getIdtablekhoahoc());
            preparedStatement.setFloat(4, diemDTO.getDiemtrungbinh());
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
