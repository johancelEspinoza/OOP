package com.ucreativa.familia;


public class Main {

    public static void main(String[] args) {

        Johancel test = new Johancel("hello", 27, "Jugar");

        Eva mama = new Eva("Hola", 45, "Coser");
        mama.setAge();
        int age = mama.getAge();

        System.out.println("La edad de mi madre seria: " + mama.getAge() +" años, y su hobby es " +mama.getHobby());
        System.out.println("Yo tengo:  " + test.getAge() +" años, y mi hobby es " + test.getHobby());

    }


}//end
