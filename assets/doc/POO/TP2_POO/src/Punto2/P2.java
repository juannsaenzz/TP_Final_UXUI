package Punto2;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Ingrese el primer número:");
            double num1 = Double.parseDouble(in.nextLine());

            System.out.println("Ingrese el segundo número:");
            double num2 = Double.parseDouble(in.nextLine());

            System.out.println("Ingrese el tercer número:");
            double num3 = Double.parseDouble(in.nextLine());

            if (num1 > 0) {
                double producto = num2 * num3;
                System.out.println("El producto de los dos últimos números es: " + producto);
            } else {
                double suma = num2 + num3;
                System.out.println("La suma de los dos últimos números es: " + suma);
            }

            System.out.println("¿Desea volver a hacerlo? (s/n)");
            opcion = in.nextLine().charAt(0);
        } while (opcion == 's' || opcion == 'S');

        in.close();
    }

}
