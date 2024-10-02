package com.oleksiydanchevskyy.tema3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Introduce calificacion");
        int nota = userinput.nextInt();

        if (nota < 5 & nota > 0){
            System.out.println("INSUFICIENTE");
        } else if (nota >= 5 & nota < 6) {
            System.out.println("SUFICIENTE");
        } else if (nota >= 6 & nota < 7 ) {
            System.out.println("BIEN");
        } else if (nota >=7 & nota < 9) {
            System.out.println("NOTABLE");
        } else if (nota >= 9 & nota <= 10){
            System.out.println("SOBRESALIENTE");
        } else {
            System.out.println("Error");
        }

    }
}
