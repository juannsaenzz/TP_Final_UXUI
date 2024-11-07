package tp5;

enum Familia {
 OROS, COPAS, ESPADAS, BASTOS
}

public class Naipe {
 private int numero;
 private Familia familia;

 public Naipe(int numero, Familia familia) {
     this.numero = numero;
     this.familia = familia;
 }

 public int getNumero() {
     return numero;
 }
 
 public void setNumero(int numero) {
     this.numero = numero;
 }

 public Familia getFamilia() {
     return familia;
 }

 public void setFamilia(Familia familia) {
     this.familia = familia;
 }
 
 @Override
 public String toString() {
     return "Naipe{" +
             "numero=" + numero +
             ", familia=" + familia +
             '}';
 }
}