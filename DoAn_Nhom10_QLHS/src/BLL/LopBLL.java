/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LopDAL;
import DTO.LopDTO;

/**
 *
 * @author HP
 */
public class LopBLL {
    LopDAL lopDAL;
    
    //thêm mới lóp
    public boolean AddLop(LopDTO lopDTO){
        lopDAL=new LopDAL();
        if(lopDAL.ValuesAddLop(lopDTO)==true){
            return true;
        }
        return false;
    }
    
    //xóa môn học
    public boolean DeleteLop(LopDTO lopDTO){
        lopDAL=new LopDAL();
        if(lopDAL.ValuesDelete(lopDTO)==true){
            return true;
        }
        return false;
    }
    
    //cập nhật môn học
    public boolean Update(LopDTO lopDTO){
        lopDAL=new LopDAL();
        if (lopDAL.ValueUpdateLop(lopDTO)==true) {
            return true;
        }
        return false;
    }
}
