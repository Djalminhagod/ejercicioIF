package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese su peso KG: ");
     double peso = sc.nextDouble();
     System.out.println("Ingrese sua altura cm: ");
     double altura = sc.nextDouble();
     double IMC = peso/(altura*altura);
     if(IMC<18.5){
         System.out.println("Bajo peso");
     }else if(IMC>=18.5 && IMC<25){
         System.out.println("peso normal");
     }else if(IMC>=25 && IMC<30){
         System.out.println("sobre peso");
     }else if(IMC>=30){
         System.out.println("obesidad");
     }
     System.out.println("IMC es: "+IMC);
 }
}
