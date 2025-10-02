package ejercicio8;

import java.util.Scanner;

public class ejericio8 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Esta empleado (Si o NO)");
        String empleo = sc.nextLine();
        if(empleo.equals("Si")){
            System.out.println("nivel de acceso");
            int nivel = sc.nextInt();
            if(nivel>=1 && nivel<=5){
                if(nivel<=4){
                    System.out.println("Acceso limitado");
                }else{
                    System.out.println("Acceso total");
                }
            }else {
                System.out.println("error numero incorrecto");
            }

        }else{
            System.out.println("acceso denegado");
        }
    }
}
