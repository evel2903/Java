/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HocSinhDAL;
import DTO.HocSinhDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HocSinhBLL {
   public ArrayList<HocSinhDTO> getAllStudent(){
       return new HocSinhDAL().getAllStudent();
    }
    
    public boolean createStudent(HocSinhDTO hocSinhDTO){   
        return new HocSinhDAL().createStudent(hocSinhDTO);
    }  
    public boolean updateStudent(HocSinhDTO hocSinhDTO){   
        return new HocSinhDAL().updateStudent(hocSinhDTO);
    }  
    public boolean deleteStudent(String id){
        return new HocSinhDAL().deleteStudent(id);
    }
    
}
