/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.monHocDAL;
import DTO.monHocDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class monHocBLL {

    monHocDAL monhocDAL;

    //thêm mới môn học
    public boolean AddMonhoc(monHocDTO monhocDTO) throws SQLException, ClassNotFoundException {
        monhocDAL = new monHocDAL();
        if("".equals(monhocDTO.getIdtablemonhoc())==true){
            JOptionPane.showConfirmDialog(null, "Mã môn học không được bỏ trống!!");
            return false;
        }
        if("".equals(monhocDTO.getTenmonhoc())==true){
            JOptionPane.showConfirmDialog(null, "Tên môn học không được bỏ trống!!");
            return false;
        }
        if (monhocDAL.CreateValues(monhocDTO)== true) {
            return true;
        }
        return false;
    }
    
    //update lại môn học
    public boolean UpdateMonhoc(monHocDTO monhocDTO){
        monhocDAL = new monHocDAL();
        //monhocDAL.updateMonhoc(monhocDTO);
        if("".equals(monhocDTO.getIdtablemonhoc())==true){
            JOptionPane.showConfirmDialog(null, "Mã môn học không được bỏ trống!!");
            return false;
        }
        if(monhocDAL.updateMonhoc(monhocDTO)==true)
            return true;
        return false;
    }
    
    //delete môn học
    public boolean DeleteMonhoc(monHocDTO monhocDTO){
        monhocDAL=new monHocDAL();
        if("".equals(monhocDTO.getIdtablemonhoc())==true){
            JOptionPane.showConfirmDialog(null, "Mã môn học không được bỏ trống!!");
            return false;
        }
        monhocDAL.ValuesDelete(monhocDTO);
        return true;
    }
    
    //search mon hoc
    public ResultSet  Search(monHocDTO monhocDTO, String value){
        ResultSet resultSet;
        monhocDAL=new monHocDAL();
        resultSet=monhocDAL.ValuesSearch(monhocDTO, value);
        return resultSet;
    }
}
