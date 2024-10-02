package com.oleksiydanchevskyy.tema3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Introduce edad");
        int age = userinput.nextInt();

        if (age >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

    }
}