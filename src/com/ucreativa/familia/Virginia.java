package com.ucreativa.familia;

public class Virginia {
    private int age;
    private  String hobby;

    public Virginia(String saludo){
        this.age = 60;
        this.hobby = "leer";
        System.out.println(saludo);
    }
    public void setAge(){
        this.age = this.age + 1;
    }
    public int getAge(){
        return this.age;
    }
    public String getHobby(){
        return hobby;
    }
}

