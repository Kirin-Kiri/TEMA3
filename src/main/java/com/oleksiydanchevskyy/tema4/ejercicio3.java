package com.oleksiydanchevskyy.tema4;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Introduce numeros");
        int number1 = userinput.nextInt();
        int number2 = userinput.nextInt();
        System.out.println("El numero mayor es: " + metodo(number1, number2));
    }

    public static int metodo(int x, int y){
        while (true) {
            if (x < y) {
                return x;
            } else if (x > y) {
                return y;
            }
        }
    }

}
