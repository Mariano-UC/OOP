package com.ucreativa.Vacunacion.entities;

import com.ucreativa.Vacunacion.services.ContadorRiesgo;

public abstract class Persona {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;

    public Persona(String nombre, String cedula, int edad, boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
        if(riesgo){
            ContadorRiesgo.getInstance().SumarRiesgo();
        }
    }

    public abstract String toString();
    // <editor-fold desc="Metodos">
    public int getEdad() {
        return edad;
    }
    public void addYear() {
        this.edad = this.edad++;
    }
    public boolean isRiesgo() {
        return riesgo;
    }
    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
}
