package com.ucreativa.Vacunacion;

import com.ucreativa.Vacunacion.repositories.FileRepository;
import com.ucreativa.Vacunacion.services.BitacoraService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BitacoraService service = new BitacoraService(new FileRepository());
        String nombre, cedula, edad, riesgo, isAmigo, relacion = "", facebook = "",parentesco = "", marca, print ;

        while (true) {
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
            } else {
                System.out.println("Parentesco:");
                parentesco = in.nextLine();
            }
            System.out.println("Vacuna -- Marca:");
            marca = in.nextLine();
            service.save(nombre, cedula, edad, riesgo,isAmigo, relacion, facebook, parentesco, marca);
            System.out.println("Quiere imprimir lista (si)");
            print = in.nextLine();
            if (print.equals("S")) {
                for (String item : service.get()) {
                    System.out.println(item);
                }
            }
        }
    }
}