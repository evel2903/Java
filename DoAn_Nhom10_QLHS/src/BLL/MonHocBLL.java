/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.MonHocDAL;
import DTO.MonHocDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MonHocBLL {
    public ArrayList<MonHocDTO> getAllSubject() {
        return new MonHocDAL().getAllSubject();
    }


    public boolean createSubject(MonHocDTO monhocDTO){
        return new MonHocDAL().createSubject(monhocDTO);
    }

    public boolean updateSubject(MonHocDTO monhocDTO) {
        return new MonHocDAL().updateSubject(monhocDTO);
    }

    public boolean deleteSubject(String id) {
        return new MonHocDAL().deleteSubject(id);
    }
}
