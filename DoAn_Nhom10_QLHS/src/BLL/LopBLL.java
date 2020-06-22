/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LopDAL;
import DTO.LopDTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class LopBLL {
    public ArrayList<LopDTO> getAllClassroom(){
        return new LopDAL().getAllClassroom();
    }

    public boolean createClassroom(LopDTO lopDTO){
        return new LopDAL().createClassroom(lopDTO);
    }
    

    public boolean updateClassroom(LopDTO lopDTO){
        return new LopDAL().updateClassroom(lopDTO);
    }
    
    public boolean deleteClassroom(String id){
        return new LopDAL().deleteClassroom(id);
    }
}
