package com.ucreativa.vacunacion.ui;

public class ErrorEnEdadExcep extends Exception{

    public ErrorEnEdadExcep(String edad) {
        super("Edad Incorrecta: " + edad);
    }



}//end
