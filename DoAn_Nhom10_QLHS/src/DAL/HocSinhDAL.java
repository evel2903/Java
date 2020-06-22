/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HocSinhDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hunte
 */
public class HocSinhDAL {
    
    public ArrayList<HocSinhDTO> getAllStudent(){
        ArrayList<HocSinhDTO> listStudent = new ArrayList<>();
        String sql = "SELECT * FROM `tablehocsinh`";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listStudent.add(new HocSinhDTO(
                            rs.getString("idtablehocsinh"),
                            rs.getString("tenhocsinh"),
                            rs.getString("gioitinh"),
                            rs.getString("ngaysinh"),
                            rs.getString("quequan"),
                            rs.getString("diachi"),
                            rs.getString("idtablelop")
                ));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStudent;
    }
    
    public boolean createStudent(HocSinhDTO hocSinhDTO){   
        String sql = "INSERT INTO `doan`.`tablehocsinh` (`idtablehocsinh`, `tenhocsinh`, `gioitinh`, "
                + "`ngaysinh`, `quequan`, `diachi`, `idtablelop`) VALUES (?, ?, ?, ?, ?, ?, ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, hocSinhDTO.getIdtablehocsinh());
            ps.setString(2, hocSinhDTO.getTenhocsinh());
            ps.setString(3, hocSinhDTO.getGioitinh());
            ps.setString(4, hocSinhDTO.getNgaysinh());
            ps.setString(5, hocSinhDTO.getQuequan());
            ps.setString(6, hocSinhDTO.getDiachi());
            ps.setString(7, hocSinhDTO.getIdtablelop());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }  
    public boolean updateStudent(HocSinhDTO hocSinhDTO){   
        String sql="UPDATE `doan`.`tablehocsinh` SET `tenhocsinh` = ?, `gioitinh` = ?, `ngaysinh` = ?"
                + ", `quequan` = ?, `diachi` = ?"
                + "WHERE (`idtablehocsinh` = ?);";
        Connection con = new ConnectionUtil().getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, hocSinhDTO.getTenhocsinh());
            ps.setString(2, hocSinhDTO.getGioitinh());
            ps.setString(3, hocSinhDTO.getNgaysinh());
            ps.setString(4, hocSinhDTO.getQuequan());
            ps.setString(5, hocSinhDTO.getDiachi());
            ps.setString(6, hocSinhDTO.getIdtablehocsinh());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(HocSinhDAL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }  
    public boolean deleteStudent(String id){
        int check=0;
        String sql="DELETE FROM `doan`.`tablehocsinh` WHERE (`idtablehocsinh` = ?);";
        
        try {
            Connection con = new ConnectionUtil().getConnection();   
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            
            return ps.executeUpdate() > 0;
        }catch (SQLException ex) {
                Logger.getLogger(HocSinhDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
