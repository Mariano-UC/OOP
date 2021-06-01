package com.ucreativa.Vacunacion.entities;

public class Persona {

    public String getName() {
        return name;
    }

    public String getCedula() {
        return cedula;
    }

    public int getAge() {
        return age;
    }

    public boolean isRiesgo() {
        return riesgo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }

    private String name;
    private String cedula;
    private int age;
    private boolean riesgo;

    public Persona(String name, String cedula, int age, boolean riesgo) {
        this.name = name;
        this.cedula = cedula;
        this.age = age;
        this.riesgo = riesgo;
    }


}
