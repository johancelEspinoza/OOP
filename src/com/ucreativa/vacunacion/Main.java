package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<BitacoraVacunas> db = new ArrayList<>();
        Persona persona;
    while (true) {
        String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca;

        System.out.print("Nombre: ");
        nombre = in.nextLine();

        System.out.print("Cedula: ");
        cedula = in.nextLine();

        System.out.print("Edad: ");
        edad = in.nextLine();

        System.out.print("Riesgo(S/N): ");
        riesgo = in.nextLine();

        System.out.print("Amigo(a) / Familiar(F): ");
        isAmigo = in.nextLine();
        if (isAmigo.equals("A")) {
            System.out.println("Relacion: ");
            relacion = in.nextLine();
            System.out.println("Facebook: ");
            facebook = in.nextLine();
            persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"),
                     facebook);
        } else {
            System.out.println("Parentesco: ");
            parentesco = in.nextLine();
            persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"),
                    parentesco);
        }
        System.out.println("Vacuna -- Marca: ");
        marca = in.nextLine();

        db.add(new BitacoraVacunas(persona, marca, new Date()));
        System.out.println("Quire imprimir Lista (S)");
        String print = in.nextLine();
        if (print.equals("S")) {
            for (BitacoraVacunas item : db) {
                System.out.println(item.getPersona().getNombre() + "vacunado el: " + item.getFecha());
            }
        }


    }
    }


}//end
