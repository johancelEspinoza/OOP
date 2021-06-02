package com.ucreativa.vacunacion.entities;

public class Amigo extends Persona{

    private String relacion;
    private String facebook;


    public Amigo(String nombre, String cedula, int edad, boolean riesgo, String relacion) {
        super(nombre, cedula, edad, riesgo);
        this.relacion = relacion;
    }

    public String getFacebook() {
        return facebook;
    }
    public String getRelacion() {
        return facebook;
    }

}//end
