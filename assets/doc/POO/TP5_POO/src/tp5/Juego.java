package tp5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {
 private Mazo mazo;
 private Jugador[] jugadores;
 private int manosRestantes;
 private int puntajeMeta;

 public Juego(int numJugadores, int manos, int puntajeMeta) {
     mazo = new Mazo();
     jugadores = new Jugador[numJugadores];
     for (int i = 0; i < numJugadores; i++) {
         jugadores[i] = new Jugador("Jugador " + (i + 1));
     }
     manosRestantes = manos;
     this.puntajeMeta = puntajeMeta;
 }

 public void jugar() {
	    Scanner scan = new Scanner(System.in);

	    while (manosRestantes > 0) {
	        System.out.println("Manos restantes: " + manosRestantes);
	        mazo.barajar();

	        while (mazo.cantidadDeNaipes() > 20 && !hayGanador()) {
	            for (Jugador jugador : jugadores) {
	                int numero;
	                int familiaIndex;
	                Familia familia;

	                do {
	                    try {
	                        System.out.println(jugador.getNombre() + ", elige un número (1-12):");
	                        String numeroStr = scan.nextLine();
	                        numero = Integer.parseInt(numeroStr);
	                        if (numero < 1 || numero > 12) {
	                            throw new InputMismatchException("Número fuera de rango");
	                        }

	                        System.out.println("Elige una familia (1-OROS, 2-COPAS, 3-ESPADAS, 4-BASTOS):");
	                        familiaIndex = Integer.parseInt(scan.nextLine()) - 1;
	                        if (familiaIndex < 0 || familiaIndex >= Familia.values().length) {
	                            throw new InputMismatchException("Índice de familia incorrecto");
	                        }
	                        familia = Familia.values()[familiaIndex];

	                        break;
	                    } catch (NumberFormatException | InputMismatchException e) {
	                        System.out.println("Error: " + e.getMessage() + ". Intente de nuevo.");
	                    }
	                } while (true);
                 
                 Naipe naipe = mazo.getNaipe();
                 System.out.println("Naipe sacado del mazo: " + naipe);

                 if (naipe.getNumero() == numero && naipe.getFamilia() == familia) {
                     jugador.sumarPuntos();
                     System.out.println(jugador.getNombre() + " ha acertado y suma 1 punto!");
                 }
             }
         }

         System.out.println("Puntajes:");
         for (Jugador jugador : jugadores) {
             System.out.println(jugador.getNombre() + ": " + jugador.getPuntos() + " puntos");
         }

         if (hayGanador()) {
             break;
         }

         for (Jugador jugador : jugadores) {
             jugador.reiniciarPuntos();
         }
         manosRestantes--;
     }

     Jugador ganador = determinarGanador();
     if (ganador != null) {
         System.out.println("¡El ganador es " + ganador.getNombre() + " con " + ganador.getPuntos() + " puntos!");
     } else {
         System.out.println("¡Empate! No se ha alcanzado el puntaje meta.");
     }
     
     scan.close();
 }

 private boolean hayGanador() {
     for (Jugador jugador : jugadores) {
         if (jugador.getPuntos() >= puntajeMeta) {
             return true;
         }
     }
     return false;
 }

 private Jugador determinarGanador() {
     Jugador ganador = null;
     for (Jugador jugador : jugadores) {
         if (ganador == null || jugador.getPuntos() > ganador.getPuntos()) {
             ganador = jugador;
         }
     }
     return ganador;
 }

 public static void main(String[] args) {
     Juego juego = new Juego(2, 3, 5);
     juego.jugar();
 }
}