package com.oleksiydanchevskyy.tema4;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Que se desea imprimir?");
        String symbol = userinput.nextLine();

        System.out.println("Introduce cuantas veces");
        int count = userinput.nextInt();

        metodo(symbol, count);
    }

    public static int metodo(String symbol, int count) {

        for (int i = 0; i < count; i++){
            System.out.println(symbol);
        }

        /*
        for (int i = 0; i < count; i++){
            System.out.print(symbol + " ");
        }
        */

        return 0;
    }
}
