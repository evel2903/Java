/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.khoaHocDAL;
import DTO.khoaHocDTO;

/**
 *
 * @author HP
 */
public class khoaHocBLL {
    khoaHocDAL khoahocDAL;
    //thêm mới khóa học
    public boolean AddKhoahoc(khoaHocDTO khoahocDTO) throws ClassNotFoundException{
        khoahocDAL = new khoaHocDAL();
        if (khoahocDAL.CreateValueKH(khoahocDTO)== true) {
            return true;
        }
        return false;
    }
    
    //xóa khóa học
    public boolean DeleteKhoahoc(khoaHocDTO khoahocDTO){
        khoahocDAL =new khoaHocDAL();
        if(true==khoahocDAL.ValueDelete(khoahocDTO)==true){
            return true;
        }
        return false;
    }
}
