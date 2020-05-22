/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HocSinhDAL;
import DTO.HocSinhDTO;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class HocSinhBLL {
    HocSinhDAL hocSinhDAL;
    public boolean AddHS(HocSinhDTO hocSinhDTO){
        hocSinhDAL=new HocSinhDAL();
        if (hocSinhDAL.ValuesAddHS(hocSinhDTO)==true) {
            return true;
        }
        return false;
    }
    
    public boolean DeleteHS(HocSinhDTO hocSinhDTO){
        hocSinhDAL=new HocSinhDAL();
        if (hocSinhDAL.DelHS(hocSinhDTO)==true) {
            return true;
        }
        return false;
    }
    
   public boolean  UpdateHS(HocSinhDTO hocSinhDTO){
       hocSinhDAL=new HocSinhDAL();
       if (hocSinhDAL.ValueUpdate(hocSinhDTO)==true) {
           return true;
       }
       return false;
   }
   //update neu khong thay doi hinh
   public boolean  UpdateHS2(HocSinhDTO hocSinhDTO){
       hocSinhDAL=new HocSinhDAL();
       if (hocSinhDAL.ValueUpdate2(hocSinhDTO)==true) {
           return true;
       }
       return false;
   }
    
}
