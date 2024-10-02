package com.oleksiydanchevskyy.tema3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int number = userinput.nextInt();

        if (number % 2 == 0) {
            System.out.println("Par");

        } else {
            System.out.println("Impar");
        }

    }
}
