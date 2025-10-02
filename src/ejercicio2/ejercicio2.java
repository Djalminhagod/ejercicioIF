package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("bienvenido");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese primer lado del triangulo");
        double ladoA = sc.nextDouble();
        System.out.println("ingrese segundo lado del triangulo");
        double ladoB = sc.nextDouble();
        System.out.println("ingrese tercer lado del triangulo");
        double ladoC = sc.nextDouble();
        if (ladoA==ladoB && ladoB==ladoC){
            System.out.println("el triangulo es Equilátero");
        }else if (ladoA!=ladoB && ladoA!=ladoC && ladoB!=ladoC){
            System.out.println("el triangulo es Escaleno");
        }else if (ladoA==ladoB && ladoA!=ladoC){
            System.out.println("el triangulo es Isósceles");
        }else if (ladoA!=ladoB && ladoA==ladoC){
            System.out.println("el triangulo es Isósceles");
        }else if (ladoA!=ladoB && ladoA!=ladoC && ladoB==ladoC){
            System.out.println("el triangulo es Isósceles");
        }
    }
}
