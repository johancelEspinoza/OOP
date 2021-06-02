package com.ucreativa.familia;

public class Eva {

    private int age;
    private String hobby;

    public Eva(String saludo,
               int age,
               String hobby) {

        this.age = age;
        this.hobby = hobby;
        System.out.println(saludo);
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = this.age + 1;
    }

    public String getHobby() {
        return this.hobby;
    }
}//end

