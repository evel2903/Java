/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author admin
 */

import DTO.ThongKeDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThongKeDAL {

    public ArrayList<ThongKeDTO> getListHSG(){
        ArrayList<ThongKeDTO> listStudent = new ArrayList<>();
        String sql = "SELECT tablehocsinh.idtablehocsinh, tablehocsinh.tenhocsinh , tablehocsinh.idtablelop, AVG(tablediemthi.diemtrungbinh) as avgall\n" +
                    "FROM tablehocsinh, tablediemthi\n" +
                    "WHERE tablehocsinh.idtablehocsinh = tablediemthi.idtablehocsinh\n" +
                    "GROUP BY tablehocsinh.idtablehocsinh\n" +
                    "HAVING AVG(tablediemthi.diemtrungbinh) >= 8.5";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listStudent.add(new ThongKeDTO(
                        rs.getString("idtablehocsinh"),
                        rs.getString("tenhocsinh"),
                        rs.getString("idtablelop"),
                        rs.getFloat("avgall")
                ));         
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStudent;
    }
    public ArrayList<ThongKeDTO> getListHSK(){
        ArrayList<ThongKeDTO> listStudent = new ArrayList<>();
        String sql = "SELECT tablehocsinh.idtablehocsinh, tablehocsinh.tenhocsinh , tablehocsinh.idtablelop, AVG(tablediemthi.diemtrungbinh) as avgall\n" +
                        "FROM tablehocsinh, tablediemthi\n" +
                        "WHERE tablehocsinh.idtablehocsinh = tablediemthi.idtablehocsinh\n" +
                        "GROUP BY tablehocsinh.idtablehocsinh\n" +
                        "HAVING AVG(tablediemthi.diemtrungbinh) >= 6.5 AND AVG(tablediemthi.diemtrungbinh) < 8.5";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listStudent.add(new ThongKeDTO(
                        rs.getString("idtablehocsinh"),
                        rs.getString("tenhocsinh"),
                        rs.getString("idtablelop"),
                        rs.getFloat("avgall")
                ));         
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStudent;
    }
    public ArrayList<ThongKeDTO> getListHSTB(){
        ArrayList<ThongKeDTO> listStudent = new ArrayList<>();
        String sql = "SELECT tablehocsinh.idtablehocsinh, tablehocsinh.tenhocsinh , tablehocsinh.idtablelop, AVG(tablediemthi.diemtrungbinh) as avgall\n" +
                        "FROM tablehocsinh, tablediemthi\n" +
                        "WHERE tablehocsinh.idtablehocsinh = tablediemthi.idtablehocsinh\n" +
                        "GROUP BY tablehocsinh.idtablehocsinh\n" +
                        "HAVING AVG(tablediemthi.diemtrungbinh) >= 5 AND AVG(tablediemthi.diemtrungbinh) < 6.5";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listStudent.add(new ThongKeDTO(
                        rs.getString("idtablehocsinh"),
                        rs.getString("tenhocsinh"),
                        rs.getString("idtablelop"),
                        rs.getFloat("avgall")
                ));         
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStudent;
    }
    public ArrayList<ThongKeDTO> getListHSY(){
        ArrayList<ThongKeDTO> listStudent = new ArrayList<>();
        String sql = "SELECT tablehocsinh.idtablehocsinh, tablehocsinh.tenhocsinh , tablehocsinh.idtablelop, AVG(tablediemthi.diemtrungbinh) as avgall\n" +
                        "FROM tablehocsinh, tablediemthi\n" +
                        "WHERE tablehocsinh.idtablehocsinh = tablediemthi.idtablehocsinh\n" +
                        "GROUP BY tablehocsinh.idtablehocsinh\n" +
                        "HAVING AVG(tablediemthi.diemtrungbinh) < 5 ";
        Connection con = new ConnectionUtil().getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listStudent.add(new ThongKeDTO(
                        rs.getString("idtablehocsinh"),
                        rs.getString("tenhocsinh"),
                        rs.getString("idtablelop"),
                        rs.getFloat("avgall")
                ));         
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStudent;
    }
}
