package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int ano = sc.nextInt();
        if (ano%4==0 && ano%100!=0){
            System.out.println("año bisiesto");
        }else if (ano%100==0 && ano%4!=0 || ano%400!=0){
            System.out.println("el año no es bisiesto");
        }else if (ano%400==0){
            System.out.println("año es bisiesto");
        }
    }
}
