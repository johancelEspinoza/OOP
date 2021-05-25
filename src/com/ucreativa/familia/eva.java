package com.ucreativa.familia;

public class eva {

    private int age;
    private String hobby;

    public eva(){
        this.age = 45;
        this.hobby = "Coser";
        System.out.println("Saludo");
    }

    public String getHobby(){
        return hobby;
    }

    public void setAge(){
    this.age = this.age + 1;
    }

     public int getAge(){
        return this.age;
     }
}//end

