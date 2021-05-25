package com.ucreativa;

import com.ucreativa.familia.Virginia;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Mariano bello = new Mariano();

    Virginia mom = new Virginia("Buenos Dias");
    mom.setAge();

    int Age = mom.getAge();
    System.out.println("My Age is " + Age);
    System.out.println("Hola Clase");
    System.out.println(mom.getHobby());
    }
}
