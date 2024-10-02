package com.oleksiydanchevskyy.tema3;

import java.util.Scanner;


public class ejercicio6 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Dinero en euros");
        int number = userinput.nextInt();

        if (number % 2 == 0){
            System.out.println("Se necesita como minimo " + number/2 +" monedas de 2 euros");
        } else if (number % 2 == 1) {
            System.out.println("Se necesita como minimo " + ((number-1)/2) + " monedas de 2 euros y 1 moneda de 1 euro");
        }
    }
}
