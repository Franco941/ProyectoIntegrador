package com.portfolio.Fran.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Skills implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long idSkill;
        private String nombreSkill;
        private String fotoSKill;
        private int porcentaje;

    public Skills() {
    }

    public Skills(long idSkill, String nombreSkill, String fotoSKill, int porcentaje) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.fotoSKill = fotoSKill;
        this.porcentaje = porcentaje;
    }

    public long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getFotoSKill() {
        return fotoSKill;
    }

    public void setFotoSKill(String fotoSKill) {
        this.fotoSKill = fotoSKill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
        
    
}
