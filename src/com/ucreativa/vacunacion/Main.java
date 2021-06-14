package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.services.BitacoraService;

import com.ucreativa.vacunacion.repositories.FileRepository;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BitacoraService service = new BitacoraService(new FileRepository());
        String nombre, cedula, edad, riesgo, isAmigo, relacion = "",
                facebook = "", parentesco = "", marca, print;
    while (true) {

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

        } else {
            System.out.println("Parentesco: ");
            parentesco = in.nextLine();

        }
        System.out.println("Vacuna -- Marca: ");
        marca = in.nextLine();
        service.save(nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca);
        System.out.println("Quire imprimir Lista (S)");
        print = in.nextLine();
        if (print.equals("S")) {
            for (String item : service.get()) {
                System.out.println(item);
            }
        }


    }
    }


}//end
