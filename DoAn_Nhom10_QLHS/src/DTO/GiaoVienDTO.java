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
public class GiaoVienDTO {
    public String idtablegiaovien;
    public String tengiaovien;
    public String ngaysinh;
    public String gioitinh;
    public byte[] img;
    
    public GiaoVienDTO(String idtablegiaovien, String tengiaovien, String ngaysinh, String gioitinh, byte [] img){
        this.idtablegiaovien=idtablegiaovien;
        this.tengiaovien=tengiaovien;
        this.ngaysinh=ngaysinh;
        this.gioitinh=gioitinh;
        this.img=img;
    
    }

    public String getIdtablegiaovien() {
        return idtablegiaovien;
    }

    public String getTengiaovien() {
        return tengiaovien;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public byte[] getImg() {
        return img;
    }

    public void setIdtablegiaovien(String idtablegiaovien) {
        this.idtablegiaovien = idtablegiaovien;
    }

    public void setTengiaovien(String tengiaovien) {
        this.tengiaovien = tengiaovien;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    
   
}
