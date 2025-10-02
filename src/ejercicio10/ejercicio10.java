package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("que clima hace hoy?(soleado,lluvioso o nublado");
        String clima = sc.nextLine();
        if (clima.equals("soleado")){
            System.out.println("temperatura actual: ");
            int temperatura = sc.nextInt();
            if (temperatura>25){
                System.out.println("recomiedo ir a la playa");
            } else if (temperatura>15 && temperatura<=25) {
                System.out.println("Dar un paseo");
            }else if (temperatura<15){
                System.out.println("ir a la montaña con chaqueta");
            }

        }else if (clima.equals("lluvioso")){
            System.out.println("Ver peli en casa");
        }else if (clima.equals("nublado")){
            System.out.println("Visitar un museo");
        }else {
            System.out.println("No tengo recomendacion para ese clima ");
        }
    }
}
