/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.GiaoVienDAL;
import DTO.GiaoVienDTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class GiaoVienBLL {
    public ArrayList<GiaoVienDTO> getAllTeacher(){
        return new GiaoVienDAL().getAllTeacher();
    }
    
    public boolean createTeacher(GiaoVienDTO giaoVienDTO){   
        return new GiaoVienDAL().createTeacher(giaoVienDTO);
    }  
    public boolean updateTeacher(GiaoVienDTO giaoVienDTO){   
        return new GiaoVienDAL().updateTeacher(giaoVienDTO);
    }  
    public boolean deleteTeacher(String id){
        return new GiaoVienDAL().deleteTeacher(id);
    }
}
