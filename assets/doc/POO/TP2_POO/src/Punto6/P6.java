package Punto6;

import java.util.Scanner;

public class P6 {public static void main(String[] args) {
    try (Scanner leer = new Scanner(System.in)) {
        System.out.println("Ingrese un numero: ");
        Entero e = new Entero(leer.nextInt());
        System.out.println("El numero ingresado es: "+ e.getNumero());
        System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());
        System.out.println("El numero " + e.getNumero() + " es " + e.parimpar());
        System.out.println("El factorial es " + e.factorial());
        System.out.println("El numero " + e.primo());
    }
}
}
