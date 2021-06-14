package com.ucreativa.Vacunacion.repositories;

import com.ucreativa.Vacunacion.entities.Persona;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{
    @Override
    public void save(Persona persona, String marca, Date fecha) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss" );


        String text = persona.getName() + " " + marca + " " + format.format(fecha) + "\n";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("db.txt",true));
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get() {
        return null;
    }
}
