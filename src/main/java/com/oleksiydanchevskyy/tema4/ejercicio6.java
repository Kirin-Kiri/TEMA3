package com.oleksiydanchevskyy.tema4;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Que se desea imprimir?");
        String symbol = userinput.nextLine();

        System.out.println("Introduce cuantas veces");
        int count = userinput.nextInt();

        System.out.println("Introduce cuantas lineas");
        int lines = userinput.nextInt();

        metodo(symbol, count, lines);
    }

    public static int metodo(String symbol, int count, int lines) {

        for (int i = 0; i < lines; i++){
            for (int b = 0; b < count; b++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        return 0;
    }
}
