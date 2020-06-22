/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhoaHocDAL;
import DTO.KhoaHocDTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class KhoaHocBLL {
    public ArrayList<KhoaHocDTO> getAllCourse(){
        return new KhoaHocDAL().getAllCourse();
    }
    
    public boolean createCourse(KhoaHocDTO khoahocDTO){
        return new KhoaHocDAL().createCourse(khoahocDTO);
    }
    
    public boolean deleteCourse(String id){
        return new KhoaHocDAL().deleteCourse(id);
    }
}
