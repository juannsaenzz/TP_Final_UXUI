package Punto5;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		try (Scanner leer = new Scanner(System.in)) {
        	double prom = 0;
        	double mayor = 0;
        	String empleado = "";

        	for (int i = 0; i < 5; i++) {
            	System.out.println("Escriba el nombre: ");
            	String emp = leer.next();
            	System.out.println("Escriba el sueldo: ");
            	double sueldo = leer.nextDouble();
            	prom += sueldo;

            	if (sueldo > mayor) {
                	mayor = sueldo;
                	empleado = emp;
            	}
        	}
        	System.out.println("El empleado que mas gana es " + empleado + " con un sueldo de " + mayor + ". El sueldo promedio es" + prom/5);    
    	}
	}

}
