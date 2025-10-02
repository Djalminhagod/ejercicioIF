package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("1.Consultar saldo");
        System.out.println("2.Ingresar dinero");
        System.out.println("3.Retirar dinero");
        System.out.println("4.Salir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opcion(1 a 4): ");
        int opcion = sc.nextInt();
        if (opcion>=1 && opcion<=4){
            if(opcion==1){
                System.out.println("Ha elegido Consultar saldo");
                System.out.println("2€");
            }else if(opcion==2){
                System.out.println("Ha elegido Ingrese su dinero");
            }else if(opcion==3){
                System.out.println("Ha elegido retirando dinero");
            }else if(opcion==4){
                System.out.println("Ha elegido Salir");
            }
        }else{
            System.out.println("error numero incorrecto");
        }
    }
}
