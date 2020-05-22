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
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class HocSinhDAL {
    private ConnectionUtil conUtil;

    private Connection con;

    private PreparedStatement preparedStatement;

    public ArrayList<HocSinhDTO> BindTable(){
        ArrayList<HocSinhDTO> list=new ArrayList<>();
        try {
            conUtil=new ConnectionUtil();
            con=conUtil.getConnection();
            Statement st;
            ResultSet rs;
            
            try {
                st=con.createStatement();
                rs=st.executeQuery("SELECT `idtablehocsinh`, `tenhocsinh`, `gioitinh`, `ngaysinh`, `quequan`, `diachi`, `idtablelop`, `img` FROM `doan`.`tablehocsinh`;");
                
                HocSinhDTO hocSinhDTO;
                while(rs.next()){
                    hocSinhDTO=new HocSinhDTO(
                            rs.getString("idtablehocsinh"),
                            rs.getString("tenhocsinh"),
                            rs.getString("gioitinh"),
                            rs.getString("ngaysinh"),
                            rs.getString("quequan"),
                            rs.getString("diachi"),
                            rs.getString("idtablelop"),
                            rs.getBytes("img")
                    );
                list.add(hocSinhDTO);
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return  list;
    }
    
    public boolean ValuesAddHS(HocSinhDTO hocSinhDTO){
        int check = 0;
        String sql = "INSERT INTO `doan`.`tablehocsinh` (`idtablehocsinh`, `tenhocsinh`, `gioitinh`, `ngaysinh`, `quequan`, `diachi`, `idtablelop`, `img`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            conUtil = new ConnectionUtil();
            con = conUtil.getConnection();
            //FileInputStream archivo = null;
            //archivo=new FileInputStream(acu);
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, hocSinhDTO.getIdtablehocsinh());
            preparedStatement.setString(2, hocSinhDTO.getTenhocsinh());
            preparedStatement.setString(3, hocSinhDTO.getGioitinh());
            preparedStatement.setString(4, hocSinhDTO.getNgaysinh());
            preparedStatement.setString(5, hocSinhDTO.getQuequan());
            preparedStatement.setString(6, hocSinhDTO.getDiachi());
            preparedStatement.setString(7, hocSinhDTO.getIdtablelop());
            preparedStatement.setBytes(8, hocSinhDTO.getImg());

            check = preparedStatement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "lỗi kết nối học sinh");
        }
        return check > 0;
    }
    
    public boolean DelHS(HocSinhDTO hocSinhDTO){
        int check=0;
        String sql="DELETE FROM `doan`.`tablehocsinh` WHERE (`idtablehocsinh` = ?);";
        
        try {
            conUtil=new ConnectionUtil();
            con=conUtil.getConnection();
            
            preparedStatement=con.prepareStatement(sql);
            
            preparedStatement.setString(1, hocSinhDTO.getIdtablehocsinh());
            
            check=preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "looix");
        }finally {
            try {
                con.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return check>0;
    }
    
    
    //Update
    public boolean ValueUpdate(HocSinhDTO hocSinhDTO){
        int check=0;
        String sql="UPDATE `doan`.`tablehocsinh` SET `tenhocsinh` = ?, `gioitinh` = ?, `ngaysinh` = ?, `quequan` = ?, `diachi` = ?, `idtablelop` = ?, `img` = ? WHERE (`idtablehocsinh` = ?);";
        
        try {
            conUtil=new ConnectionUtil();
            con=conUtil.getConnection();
            
            preparedStatement=con.prepareStatement(sql);
            
            
            preparedStatement.setString(1, hocSinhDTO.getTenhocsinh());
            preparedStatement.setString(2, hocSinhDTO.getGioitinh());
            preparedStatement.setString(3, hocSinhDTO.getNgaysinh());
            preparedStatement.setString(4, hocSinhDTO.getQuequan());
            preparedStatement.setString(5, hocSinhDTO.getDiachi());
            preparedStatement.setString(6, hocSinhDTO.getIdtablelop());
            preparedStatement.setBytes(7, hocSinhDTO.getImg());
            preparedStatement.setString(8, hocSinhDTO.getIdtablehocsinh());
            
            check=preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "khong the thay doi ma");
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
    
    //update neu k thay doi hinh
    public boolean ValueUpdate2(HocSinhDTO hocSinhDTO){
        int check=0;
        String sql="UPDATE `doan`.`tablehocsinh` SET `tenhocsinh` = ?, `gioitinh` = ?, `ngaysinh` = ?, `quequan` = ?, `diachi` = ?, `idtablelop` = ? WHERE (`idtablehocsinh` = ?);";
        
        try {
            conUtil=new ConnectionUtil();
            con=conUtil.getConnection();
            
            preparedStatement=con.prepareStatement(sql);
            
            
            preparedStatement.setString(1, hocSinhDTO.getTenhocsinh());
            preparedStatement.setString(2, hocSinhDTO.getGioitinh());
            preparedStatement.setString(3, hocSinhDTO.getNgaysinh());
            preparedStatement.setString(4, hocSinhDTO.getQuequan());
            preparedStatement.setString(5, hocSinhDTO.getDiachi());
            preparedStatement.setString(6, hocSinhDTO.getIdtablelop());
            
            preparedStatement.setString(7, hocSinhDTO.getIdtablehocsinh());
            
            check=preparedStatement.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "khong the thay doi ma");
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
