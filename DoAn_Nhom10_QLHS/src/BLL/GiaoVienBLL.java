/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.GiaoVienDAL;
import DTO.GiaoVienDTO;

/**
 *
 * @author HP
 */
public class GiaoVienBLL {
    GiaoVienDAL giaoVienDAL;
    public boolean AddGiaoVien(GiaoVienDTO giaoVienDTO){
        giaoVienDAL=new GiaoVienDAL();
        if (giaoVienDAL.ValuesAddGiaovien(giaoVienDTO)==true) {
            return true;
        }
        return false;
    }
    //xóa
    public boolean DeleteGiaoVien(GiaoVienDTO giaoVienDTO){
        giaoVienDAL=new GiaoVienDAL();
        if (giaoVienDAL.ValuesDeleteGiaovien(giaoVienDTO)==true) {
            return true;
        }
        return false;
    }
    
    public boolean UpdateGiaoVien(GiaoVienDTO giaoVienDTO){
        giaoVienDAL=new GiaoVienDAL();
        if (giaoVienDAL.ValuesUpdateGiaovien(giaoVienDTO)==true) {
            return true;
        }
        return false;
    }
    
    //update giao vien neu khong thay doi hinh anh
    public boolean UpdateGiaoVien2(GiaoVienDTO giaoVienDTO){
        giaoVienDAL=new GiaoVienDAL();
        if (giaoVienDAL.ValuesUpdateGiaovien2(giaoVienDTO)==true) {
            return true;
        }
        return false;
    }
    
    public boolean DEL(GiaoVienDTO giaoVienDTO){
        giaoVienDAL=new GiaoVienDAL();
        return giaoVienDAL.DGV(giaoVienDTO)==true;
    }
}
