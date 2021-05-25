package com.ucreativa;

import com.ucreativa.familia.johancel;
import com.ucreativa.familia.eva;


public class Main {

    public static void main(String[] args) {

        johancel test = new johancel();

        eva mama = new eva();

        mama.setAge();

        int age = mama.getAge();
        System.out.println(("Age is = " + age));
        System.out.println("Hobby is = " + mama.getHobby());

    }


}//end
