package Punto3;

import java.util.Scanner;

public class Palabras {
	private String palabra;
	
	public boolean esPalindromo() {
	
	for (int i = 0; i < palabra.length() / 2; i++) {
		// Convierte la palabra en mayusculas para evitar erorres
        palabra = palabra.toUpperCase();
	// i empieza en 0 e itera hasta ser igual a la mitad de la longitud de la palabra
		if (palabra.charAt(i) != palabra.charAt(palabra.length() -1 -i)) {
		// Compara si la posición del primer caracter es distinta a la del caracter opuesto (0 con 6 y asi sucesivamente hasta llegar la mitad de la palabra).
	    // cuando hay alguno distinto, la palabra no es palindromo y sale del ciclo
			return false;
		}
	}
	return true;	
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = in.nextLine();
		
	    Palabras palindromo = new Palabras();
        palindromo.palabra = palabra;
		
		if (palindromo.esPalindromo()) {
			System.out.println("La palabra " + palabra + " es un palíndromo");
		} else {
			System.out.println("La palabra " + palabra + " no es un palíndromo");
		}
		
		in.close();
	}

}

