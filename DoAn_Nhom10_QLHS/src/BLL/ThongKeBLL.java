/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ThongKeDAL;
import DTO.ThongKeDTO;
import java.util.ArrayList;

/**
 *
 * @author hunte
 */
public class ThongKeBLL {
    
    public ArrayList<ThongKeDTO> getListHSG(){
        return new ThongKeDAL().getListHSG();
    }
    public ArrayList<ThongKeDTO> getListHSK(){
        return new ThongKeDAL().getListHSK();    
    }
    public ArrayList<ThongKeDTO> getListHSTB(){
        return new ThongKeDAL().getListHSTB();
    }
    public ArrayList<ThongKeDTO> getListHSY(){
        return new ThongKeDAL().getListHSY();
    }
}
