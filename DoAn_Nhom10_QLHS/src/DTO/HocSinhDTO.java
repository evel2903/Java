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
public class HocSinhDTO {
    public String idtablehocsinh;
    public String tenhocsinh;
    public String gioitinh;
    public String ngaysinh;
    public String quequan;
    public String diachi;
    public String idtablelop;

    public HocSinhDTO(String idtablehocsinh, String tenhocsinh, String gioitinh, String ngaysinh, String quequan, String diachi, String idtablelop) {
        this.idtablehocsinh = idtablehocsinh;
        this.tenhocsinh = tenhocsinh;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.diachi = diachi;
        this.idtablelop = idtablelop;
    }
    public HocSinhDTO() {
    }

    public String getIdtablehocsinh() {
        return idtablehocsinh;
    }

    public void setIdtablehocsinh(String idtablehocsinh) {
        this.idtablehocsinh = idtablehocsinh;
    }

    public String getTenhocsinh() {
        return tenhocsinh;
    }

    public void setTenhocsinh(String tenhocsinh) {
        this.tenhocsinh = tenhocsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getIdtablelop() {
        return idtablelop;
    }

    public void setIdtablelop(String idtablelop) {
        this.idtablelop = idtablelop;
    }

    
}
