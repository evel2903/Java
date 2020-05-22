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
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class GiaoVienDAL {

    private ConnectionUtil conUtil;

    private Connection con;

    private PreparedStatement preparedStatement;

    public boolean ValuesAddGiaovien(GiaoVienDTO giaovienDTO) {
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablegiaovien` (`idtablegiaovien`, `tengiaovien`, `ngaysinh`, `gioitinh`, `img`) VALUES (?, ?, ?, ?, ?);";

        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();
            //FileInputStream archivo = null;
            //archivo=new FileInputStream(acu);
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, giaovienDTO.getIdtablegiaovien());
            preparedStatement.setString(2, giaovienDTO.getTengiaovien());
            preparedStatement.setString(3, giaovienDTO.getNgaysinh());
            preparedStatement.setString(4, giaovienDTO.getGioitinh());
            preparedStatement.setBytes(5, giaovienDTO.getImg());

            check = preparedStatement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "lỗi kết nối giáo viên");
        }
        return check > 0;
    }
    
    public boolean ValuesDeleteGiaovien(GiaoVienDTO giaovienDTO){
       int check = 0;
        String sqldel = "DELETE FROM `doan`.`tablegiaovien` WHERE (`idtablegiaovien` = ?);";
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();

            preparedStatement = con.prepareStatement(sqldel);
            preparedStatement.setString(1, giaovienDTO.getIdtablegiaovien());
            preparedStatement.executeUpdate();
            check = (preparedStatement.executeUpdate() );

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "lỗi kết nối giáo viên");
        } finally {
            try {
                con.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return check!=0;
    }

    public boolean ValuesUpdateGiaovien(GiaoVienDTO giaovienDTO){
        int check=0;
        String sql="UPDATE `doan`.`tablegiaovien` SET `tengiaovien` = ?, `ngaysinh` = ?, `gioitinh` = ?, `img` = ? WHERE (`idtablegiaovien` = ?);";
        
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();
            
            preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, giaovienDTO.getTengiaovien());
            preparedStatement.setString(2, giaovienDTO.getNgaysinh());
            preparedStatement.setString(3, giaovienDTO.getGioitinh());
            preparedStatement.setBytes(4, giaovienDTO.getImg());
            preparedStatement.setString(5, giaovienDTO.getIdtablegiaovien());
            
            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "không thể thay đổi mã");
        }
        return check > 0;
    }
    
    //update neu k thay doi hinh anh
    public boolean ValuesUpdateGiaovien2(GiaoVienDTO giaovienDTO){
        int check=0;
        String sql="UPDATE `doan`.`tablegiaovien` SET `tengiaovien` = ?, `ngaysinh` = ?, `gioitinh` = ? WHERE (`idtablegiaovien` = ?);";
        
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();
            
            preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, giaovienDTO.getTengiaovien());
            preparedStatement.setString(2, giaovienDTO.getNgaysinh());
            preparedStatement.setString(3, giaovienDTO.getGioitinh());
            //preparedStatement.setBytes(4, giaovienDTO.getImg());
            preparedStatement.setString(4, giaovienDTO.getIdtablegiaovien());
            
            check = preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "không thể thay đổi mã");
        }
        return check > 0;
    }
    
    public boolean DGV(GiaoVienDTO giaoVienDTO){
        int check=0;
        String sql="DELETE FROM `doan`.`tablegiaovien` WHERE (`idtablegiaovien` = ?);";
        
        try {
            conUtil=new ConnectionUtil();
            con=conUtil.getConnection();
            
            preparedStatement=con.prepareStatement(sql);
            
            preparedStatement.setString(1, giaoVienDTO.getIdtablegiaovien());
            
            check=preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "looix");
        }
        return check!=0;
    }
    
    
    public ArrayList<GiaoVienDTO> BindTable() {
        ArrayList<GiaoVienDTO> list = new ArrayList<>();
        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();
            Statement st;
            ResultSet rs;
            try {
                st=con.createStatement();
                rs=st.executeQuery("SELECT `idtablegiaovien`, `tengiaovien`, `ngaysinh`, `gioitinh`, `img` FROM `doan`.`tablegiaovien`;");
                
                GiaoVienDTO giaoVienDTO;
                while(rs.next()){
                    giaoVienDTO=new GiaoVienDTO(
                                    rs.getString("idtablegiaovien"),
                                    rs.getString("tengiaovien"),
                                    rs.getString("ngaysinh"),
                                    rs.getString("gioitinh"),
                                    rs.getBytes("img")
                                );
                    list.add(giaoVienDTO);
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return list;
    }
}
