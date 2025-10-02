package ejercicio7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nota(0 a 100: ");
        int nota = sc.nextInt();
        if (nota>=0 && nota<=100){
            if(nota<=59){
                System.out.println("F Supenso");
            }else if(nota<=69){
                System.out.println("D Suficiente");
            }else if(nota<=79){
                System.out.println("C Aprovado");
            }else if(nota<=89){
                System.out.println("B Notable");
            }else{
                System.out.println("A Sobresaliente");
            }
        }else {
            System.out.println("error numero incorrecto");
        }
    }
}
