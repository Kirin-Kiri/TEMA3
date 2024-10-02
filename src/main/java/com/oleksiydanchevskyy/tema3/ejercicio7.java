package com.oleksiydanchevskyy.tema3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Introduce edad del miembro: ");
        int edad = userinput.nextInt();

        int cuota = 0;
        int base = 500;
        int descuentosmayores = 50;
        int descuentos18nosoc = 25;
        int descuentos18soc = 35;

        if (edad >= 65) {
            cuota = base - ((base * descuentosmayores) / 100) ;
            System.out.println("Cuota personas mayores: " + cuota + "€");
        }
        if (edad < 18) {
            System.out.println("Padres son socios?(s/n)");
            String socios = userinput.next().toUpperCase();
            if (socios.equals("N")) {
                cuota = base - ((base * descuentos18nosoc) / 100) ;
                System.out.println("Cuota los menores de 18 años no socios " + cuota + "€");
            } else if(socios.equals("S")){
                cuota = base - ((base * descuentos18soc) / 100) ;
                System.out.println("Cuota los menores de 18 años socios:  " + cuota + "€");
            }
        }
    }
}