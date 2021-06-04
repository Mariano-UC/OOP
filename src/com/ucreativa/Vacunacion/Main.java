package com.ucreativa.Vacunacion;

import com.ucreativa.Vacunacion.entities.Amigo;
import com.ucreativa.Vacunacion.entities.BitacoraVacunas;
import com.ucreativa.Vacunacion.entities.Familiar;
import com.ucreativa.Vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<BitacoraVacunas> db = new ArrayList<>();
        while (true) {

            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca;
            Persona persona;

            System.out.println("Nombre");
            nombre = in.nextLine();
            System.out.println("Cedula");
            cedula = in.nextLine();
            System.out.println("Edad");
            edad = in.nextLine();
            System.out.println("Riesgo(S/N):");
            riesgo = in.nextLine();
            System.out.println("Amigo(A)/Familiar(F):");
            isAmigo = in.nextLine();
            if (isAmigo.equals("A")) {
                System.out.println("Relacion:");
                relacion = in.nextLine();
                System.out.println("Facebook:");
                facebook = in.nextLine();
                Integer.parseInt(edad);
                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);
            } else {
                System.out.println("Parentesco:");
                parentesco = in.nextLine();
                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentesco);
            }
            System.out.println("Vacuna -- Marca:");
            marca = in.nextLine();

            db.add(new BitacoraVacunas(persona, marca, new Date()));

            System.out.println("Quiere imprimir lista (si)");
            String print = in.nextLine();
            if (print.equals("S")) {

                for (BitacoraVacunas item : db) {
                    System.out.println(item.getPersona().getName() + " vacunado el " + item.getFecha());

                }
            }
        }
    }
}