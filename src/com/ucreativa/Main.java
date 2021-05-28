package com.ucreativa;

import com.ucreativa.familia.johancel;
import com.ucreativa.familia.eva;

import java.net.StandardSocketOptions;


public class Main {

    public static void main(String[] args) {

        johancel test = new johancel("hello", 27, "Jugar");

        eva mama = new eva("Hola", 45, "Coser");
        mama.setAge();
        int age = mama.getAge();

        System.out.println("La edad de mi madre seria: " + mama.getAge() +" años, y su hobby es " +mama.getHobby());
        System.out.println("Mi edad es  " + test.getAge() +" años, y mi hobby es " + test.getHobby());

    }


}//end
