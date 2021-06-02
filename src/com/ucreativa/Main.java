package com.ucreativa;

import com.ucreativa.familia.Johancel;
import com.ucreativa.familia.Eva;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {
    /*
        Johancel test = new Johancel("hello", 27, "Jugar");

        Eva mama = new Eva("Hola", 45, "Coser");
        mama.setAge();
        int age = mama.getAge();

        System.out.println("La edad de mi madre seria: " + mama.getAge() +" años, y su hobby es " +mama.getHobby());
        System.out.println("Yo tengo:  " + test.getAge() +" años, y mi hobby es " + test.getHobby());

    */

        Familiar mama = new Familiar("Eva", "123",
                70, true, "Madre");

        Familiar hermano = new Familiar("Jefferson","123", 19, false,
                "Hermano");

        Amigo compaTrabajo = new Amigo("Steven","145",26, true,
                "Amigo");

        List<Persona> familia = new ArrayList<>();
        familia.add(mama);
        familia.add(hermano);
        familia.add(compaTrabajo);

        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(mama, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacunas(hermano, "Astrasenica", new Date()));
        bitacora.add(new BitacoraVacunas(compaTrabajo, "Johnson", new Date()));


    }


}//end
