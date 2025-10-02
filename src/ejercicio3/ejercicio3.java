package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        String contrasena = "JavaEsGenial";
        String usuario = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String nombre = sc.nextLine();
        System.out.println("ingrese su contraseña");
        String contra = sc.nextLine();
        if (nombre.equals(usuario) && contra.equals(contrasena)) {
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
        }
    }
}
