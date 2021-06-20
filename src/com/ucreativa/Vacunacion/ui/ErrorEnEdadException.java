package com.ucreativa.Vacunacion.ui;

public class ErrorEnEdadException extends Exception {
    public ErrorEnEdadException(String edad){
        super("La edad ingresada no es valida " + edad);
    }
}
