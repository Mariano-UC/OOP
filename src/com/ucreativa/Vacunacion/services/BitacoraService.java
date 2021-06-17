package com.ucreativa.Vacunacion.services;

import com.ucreativa.Vacunacion.entities.Amigo;
import com.ucreativa.Vacunacion.entities.Familiar;
import com.ucreativa.Vacunacion.entities.Persona;
import com.ucreativa.Vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
    }
    public void save(String nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook,String parentesco, String marca){

        int edad = Integer.parseInt(txtEdad);
        Persona persona;
        if (isAmigo){
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre,cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());
    }
    public List<String> get(){
        return this.repository.get();
    }
}
