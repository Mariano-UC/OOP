package com.ucreativa.Vacunacion;

public class Amigo extends Persona{

    public String getRelacion() {
        return relacion;
    }

    public String getFacebook() {
        return facebook;
    }

    private String relacion;
    private String facebook;

    public Amigo(String name, String cedula, int age, boolean riesgo, String relacion, String amigo) {
        super(name, cedula, age, riesgo);
        this.relacion = relacion;
        this.facebook = amigo;
    }
}
