package com.oleksiydanchevskyy.tema4;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Introduce numeros");
        int max = metodo();
        System.out.println("El numero mayor es: " + max);
    }

    public static int metodo() {
        int [] myNum = {0, 0, 0, 0};
        int max = 0;
        Scanner userinput = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            myNum[i] = userinput.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            max = Math.max(max, myNum[i]);
        }

        return max;
    }
}
