package Punto4;

import java.util.Arrays;

public class P4 {public static void main(String[] args) {
    int[] numeros = {4, 2, 3, 6, 1};
    imprimir(numeros);
}

public static void imprimir(int[] numeros) {
    int cantidad = numeros.length;
    System.out.println("Cantidad de números en el array: " + cantidad);

    int mayor = numeros[0];
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > mayor) {
            mayor = numeros[i];
        }
    }
    System.out.println("El mayor es: " + mayor);

    int suma = 0;
    for (int num : numeros) { 
        suma += num;
    }
    double promedio = (double) suma / cantidad;
    System.out.println("El promedio de los números es: " + promedio);

    Arrays.sort(numeros);
    System.out.println("Ordenamiento de menor a mayor: " + Arrays.toString(numeros));

    int[] numerosInversos = new int[numeros.length];  
    for (int i = 0; i < numeros.length; i++) {
        numerosInversos[i] = numeros[numeros.length - 1 - i];
    }
    System.out.println("Ordenamiento de mayor a menor: " + Arrays.toString(numerosInversos));
}

}
