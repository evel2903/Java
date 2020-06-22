/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HP
 */
public class MonHocDTO {
    public String idtablemonhoc;
    public String tenmonhoc;
    public int sotiet;
    
    public MonHocDTO(String idtablemonhoc, String tenmonhoc, int sotiet){
        this.idtablemonhoc=idtablemonhoc;
        this.tenmonhoc=tenmonhoc;
        this.sotiet=sotiet;
    }
    
    public String getIdtablemonhoc(){
        return idtablemonhoc;
    }
    
    public void setIdmonhoc(String idtablemonhoc){
        this.idtablemonhoc=idtablemonhoc;
    }
    
    public String getTenmonhoc(){
        return tenmonhoc;
    }
    
    public void setTenmonhoc(String tenmonhoc){
        this.tenmonhoc=tenmonhoc;
    }
    
    public int getSotiet(){
        return sotiet;
    }
    
    public void setSotiet(int sotiet){
        this.sotiet=sotiet;
    }
}
