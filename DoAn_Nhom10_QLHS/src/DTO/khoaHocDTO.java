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
public class khoaHocDTO {
    String idtablehoahoc;
    public khoaHocDTO(String idtablekhoahoc){
        this.idtablehoahoc=idtablekhoahoc;
    }
    public String getIdKhoahoc(){
        return idtablehoahoc;
    }
    
    public void setIdKhoahoc(String idtablekhoahoc){
        this.idtablehoahoc=idtablekhoahoc;
    }
    
}
