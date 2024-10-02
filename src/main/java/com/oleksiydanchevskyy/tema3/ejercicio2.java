package com.oleksiydanchevskyy.tema3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        int number1 = userinput.nextInt();
        System.out.println("Introduce segundo numero");
        int number2 = userinput.nextInt();

        if (number1 > number2){
            System.out.println("Primer numero es mayor");
        } else if (number1 < number2) {
            System.out.println("Primer numero es menor");
        } else if (number1 == number2) {
            System.out.println("Primer numero es igual que segundo numero");
        }

    }
}