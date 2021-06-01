package com.ucreativa;

import com.ucreativa.Vacunacion.Familiar;
import com.ucreativa.Vacunacion.Amigo;
import com.ucreativa.Vacunacion.BitacoraVacunas;
import com.ucreativa.Vacunacion.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar mama = new Familiar("Virginia","123", 60, true,"Mama" );
        Familiar hermana = new Familiar("Idalma", "123",40, false, "Hermana");
        Amigo roomate = new Amigo("Cali","123", 30, false, "roomate", "no se");

        List<Persona> familia = new ArrayList<>();
                familia.add(mama);
                familia.add(hermana);

        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(mama,"Pfizer", new Date()));
        bitacora.add(new BitacoraVacunas(hermana,"AstraZeneca", new Date()));
        bitacora.add(new BitacoraVacunas(roomate, "Jhonson", new Date()));

    }
}
