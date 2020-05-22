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
    public String idtablehocsinh;
    public String idtablemonhoc;
    public String idtablehocki;
    public float diemtrungbinh;

    public DiemDTO(String idtablehocsinh, String idtablemonhoc, String idtablehocki, float diemtrungbinh) {
        this.idtablehocsinh = idtablehocsinh;
        this.idtablemonhoc = idtablemonhoc;
        this.idtablehocki = idtablehocki;
        this.diemtrungbinh=diemtrungbinh;
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
    
    public void setDiemtrungbinh(float diemtrungbinh){
        this.diemtrungbinh=diemtrungbinh;
    }
    
    public float getDiemtrungbinh(){
        return diemtrungbinh;
    }
    
}
