/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DiemDAL;
import DTO.DiemDTO;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DiemBLL {
    DiemDAL diemDAL;
    public boolean Add(DiemDTO diemDTO){
        diemDAL=new DiemDAL();
        if(diemDAL.ValueAddDiem(diemDTO)==true){
            return true;
        }
        return false;
    }
    
    public boolean Update(DiemDTO diemDTO){
        diemDAL=new DiemDAL();
        if (diemDAL.ValuesUpdate(diemDTO)==true) {
            return true;
        }
        return false;
    }
    
    public boolean Delete(DiemDTO diemDTO){
        diemDAL=new DiemDAL();
        if (diemDAL.ValuesDelete(diemDTO)==true) {
            return true;
            
        }
        return false;
    }
}
