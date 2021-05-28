package com.ucreativa.Vacunacion;

public class Familiar extends Persona{

    public String getParentesco() {
        return parentesco;
    }

    private String parentesco;

    public Familiar(String name, String cedula, int age, boolean riesgo, String parentesco) {
        super(name, cedula, age, riesgo);
        this.parentesco = parentesco;
    }
}
