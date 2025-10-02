package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("Ingrese tercer numero");
        int numero3 = sc.nextInt();
        if(numero1>numero2 && numero1>numero3){
            System.out.println("El numero 1 es mayor "+numero1);
        }else if(numero2>numero1 && numero2>numero3){
            System.out.println("El numero 2 es mayor "+numero2);
        }else if(numero3>numero1 && numero3>numero2){
            System.out.println("El numero 3 es mayor "+numero3);
        }else if(numero1==numero2 && numero1==numero3){
            System.out.println("Los numeros son iguales "+numero1);
        }else if(numero2==numero1 ){
            System.out.println("El numero 2 y 1 son iguales "+numero2);
        }else if(numero3==numero1){
            System.out.println("El numero 3 y 1 son iguales "+numero3);
        }else if(numero3==numero2){
            System.out.println("El numero 2 y 3 son iguales "+numero2);
        }

    }
}
