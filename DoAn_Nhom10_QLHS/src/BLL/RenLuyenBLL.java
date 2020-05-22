/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.RenLuyenDAL;
import DTO.RenLuyenDTO;

/**
 *
 * @author HP
 */
public class RenLuyenBLL {
    RenLuyenDAL renLuyenDAL;
    public boolean AddRenluyen(RenLuyenDTO renLuyenDTO){
        renLuyenDAL=new RenLuyenDAL();
        if (renLuyenDAL.ValueAdd(renLuyenDTO)==true) {
            return true;
        }
        return false;
    }
    
    public boolean DelRenluyen(RenLuyenDTO renLuyenDTO){
        renLuyenDAL=new RenLuyenDAL();
        if (renLuyenDAL.ValueDelete(renLuyenDTO)==true) {
            return true;
        }
        return false;
    }
    
    public boolean UPdateRenluyen(RenLuyenDTO renLuyenDTO){
        renLuyenDAL=new RenLuyenDAL();
        if (renLuyenDAL.ValueUpdate(renLuyenDTO)==true) {
            return true;
        }
        return false;
    }
}
