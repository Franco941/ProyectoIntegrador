package com.portfolio.Fran.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Experiencia {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idExp;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String tituloExp;
    
    @NotNull
    @Size(min = 4, max = 4, message = "no cumple con la longitud , ingrese un año de 4 digitos")
    private int añosExp;
    
    @Size(min = 30, max = 500, message = "no cumple con la longitud")
    private String descripcion;

    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(long idExp, String tituloExp, int añosExp, String descripcion, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.añosExp = añosExp;
        this.descripcion = descripcion;
        this.imagenExp = imagenExp;
    }

    public long getIdExp() {
        return idExp;
    }

    public void setIdExp(long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }
    
    
   
}
