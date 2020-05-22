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
public class RenLuyenDTO {
    public String idtablerenluyen;
    public String idtablehocsinh;
    public String idtablehocki;
    public String ghichu;

    public String getIdtablerenluyen() {
        return idtablerenluyen;
    }

    public void setIdtablerenluyen(String idtablerenluyen) {
        this.idtablerenluyen = idtablerenluyen;
    }

    public String getIdtablehocsinh() {
        return idtablehocsinh;
    }

    public void setIdtablehocsinh(String idtablehocsinh) {
        this.idtablehocsinh = idtablehocsinh;
    }

    public String getIdtablehocki() {
        return idtablehocki;
    }

    public void setIdtablehocki(String idtablehocki) {
        this.idtablehocki = idtablehocki;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public RenLuyenDTO(String idtablerenluyen, String idtablehocsinh, String idtablehocki, String ghichu) {
        this.idtablerenluyen = idtablerenluyen;
        this.idtablehocsinh = idtablehocsinh;
        this.idtablehocki = idtablehocki;
        this.ghichu = ghichu;
    }
}
