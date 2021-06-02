package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {

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
