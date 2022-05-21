package com.portfolio.Fran.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Eduacion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idEdu;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String tituloEdu;
    
    @NotNull
    @Size(min = 4, max = 4, message = "no cumple con la longitud , ingrese un año de 4 digitos")
    private int añosEdu;
    
    @Size(min = 30, max = 500, message = "no cumple con la longitud")
    private String descripcionEdu;

    private String imagenEdu;

    public Eduacion() {
    }

    public Eduacion(long idEdu, String tituloEdu, int añosEdu, String descripcionEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.añosEdu = añosEdu;
        this.descripcionEdu = descripcionEdu;
        this.imagenEdu = imagenEdu;
    }

    public long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getAñosEdu() {
        return añosEdu;
    }

    public void setAñosEdu(int añosEdu) {
        this.añosEdu = añosEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
    
    
    
}
