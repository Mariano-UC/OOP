package com.ucreativa;

import com.ucreativa.familia.Mariano;
import com.ucreativa.familia.Virginia;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Mariano yo = new Mariano("Hello",39,"drink coffe");

    Virginia mom = new Virginia("Buenos Dias",60,"reading");
    mom.setAge();

    int Age = mom.getAge();
    System.out.println("My Age is " + Age);
    System.out.println("Hola Clase");
    System.out.println("me gusta " + mom.getHobby());
    }
}
