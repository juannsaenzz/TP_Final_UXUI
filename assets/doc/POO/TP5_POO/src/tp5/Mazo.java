package tp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Naipe> naipes;

    public Mazo() {
        naipes = new ArrayList<>();
        for (Familia familia : Familia.values()) {
            for (int i = 1; i <= 12; i++) {
                naipes.add(new Naipe(i, familia));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(naipes);
    }
    
    public Naipe getNaipe() {
        if (naipes.isEmpty()) {
            System.out.println("El mazo está vacío.");
            return null;
        }
        return naipes.remove(0);
    }
    
    public void agregarNaipe(Naipe naipe) {
        naipes.add(naipe);
    }

    public int cantidadDeNaipes() {
        return naipes.size();
    }
}