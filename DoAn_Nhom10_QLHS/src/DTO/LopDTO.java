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
public class LopDTO {
    public String idtablelop;
    public String tenlop;
    public int siso;
    public String idtablegiaovien;
    public String idtablekhoahoc;

    public LopDTO(String idtablelop,String tenlop,int siso, String idtablegiaovien,String idtablekhoahoc) {
        this.idtablelop=idtablelop;
        this.tenlop=tenlop;
        this.siso=siso;
        this.idtablegiaovien=idtablegiaovien;
        this.idtablekhoahoc=idtablekhoahoc;
    }
    
    public String getIdtablelop(){
        return idtablelop;
    }
    public String getTenlop(){
        return tenlop;
    }
    public int getSiso(){
        return siso;
    }
    public String getIdtablegiaovien(){
        return idtablegiaovien;
    }
    public String getIdtablekhoahoc(){
        return idtablekhoahoc;
    }
    
    public void setIdtablelop(String idtablelop){
        this.idtablelop=idtablelop;
    }
    public void setTenlop(String tenlop){
        this.tenlop=tenlop;
    }
    public void setSiso(int siso){
        this.siso=siso;
    }
    public void setIdtablegiaovien(String idtablegiaovien){
        this.idtablegiaovien=idtablegiaovien;
    }
    public void setIdtablekhoahoc(String idtablekhoahoc){
        this.idtablekhoahoc=idtablekhoahoc;
    }
}
