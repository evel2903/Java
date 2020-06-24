/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author hunte
 */
public class ThongKeDTO {
    private String id;
    private String fullName;
    private String idClass;
    private float avgAll;

    public ThongKeDTO(String id, String fullName, String idClass, float avgAll) {
        this.id = id;
        this.fullName = fullName;
        this.idClass = idClass;
        this.avgAll = avgAll;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public float getAvgAll() {
        return avgAll;
    }

    public void setAvgAll(float avgAll) {
        this.avgAll = avgAll;
    }
    
    
}
