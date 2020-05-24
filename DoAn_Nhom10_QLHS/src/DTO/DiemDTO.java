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
public class DiemDTO {
    public String idtablebangdiem;
    public String idtablehocsinh;
    public String idtablemonhoc;
    public String idtablehocki;
    public int diemtrungbinh;
    

    public DiemDTO(String idtablebangdiem, String idtablehocsinh, String idtablemonhoc, String idtablehocki, int diemtrungbinh) {
        this.idtablebangdiem = idtablebangdiem;
        this.idtablehocsinh = idtablehocsinh;
        this.idtablemonhoc = idtablemonhoc;
        this.idtablehocki = idtablehocki;
        this.diemtrungbinh=diemtrungbinh;
    }

    public String getIdtablebangdiem() {
        return idtablebangdiem;
    }

    public void setIdtablebangdiem(String idtablebangdiem) {
        this.idtablebangdiem = idtablebangdiem;
    }
    
    
    public String getIdtablehocsinh() {
        return idtablehocsinh;
    }

    public void setIdtablehocsinh(String idtablehocsinh) {
        this.idtablehocsinh = idtablehocsinh;
    }

    public String getIdtablemonhoc() {
        return idtablemonhoc;
    }

    public void setIdtablemonhoc(String idtablemonhoc) {
        this.idtablemonhoc = idtablemonhoc;
    }

    public String getIdtablehocki() {
        return idtablehocki;
    }

    public void setIdtablehocki(String idtablehocki) {
        this.idtablehocki = idtablehocki;
    }
    
    public void setDiemtrungbinh(int diemtrungbinh){
        this.diemtrungbinh=diemtrungbinh;
    }
    
    public int getDiemtrungbinh(){
        return diemtrungbinh;
    }
    
}
