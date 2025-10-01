package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int precio = 150;
        System.out.println("bienvenido");
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es tu edad");
        int edad = sc.nextInt();
        if (edad<5) {
            System.out.println("entrada gratis");
        }else if (edad>=5 && edad<=12) {
            double precio1 = precio * 0.5;
            System.out.println("50% de descuento "  + precio1);
        }else if (edad>=13 && edad<=64) {
            System.out.println("no hay descuento "   + precio);
        }else if (edad>=65) {
            double precio2 = precio * 0.75;
            System.out.println("75% de descuento "+precio2);
        }
    }
}
