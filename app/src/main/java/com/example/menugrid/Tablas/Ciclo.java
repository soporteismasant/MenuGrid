package com.example.menugrid.Tablas;

import java.io.Serializable;

public class Ciclo implements Serializable {
    private Integer idCiclo;
    private String nombreCiclo;

    public Ciclo() {
    }

    public Ciclo(Integer idCiclo, String nombreCiclo) {
        this.idCiclo = idCiclo;
        this.nombreCiclo = nombreCiclo;
    }

    public Integer getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(Integer idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }
}
