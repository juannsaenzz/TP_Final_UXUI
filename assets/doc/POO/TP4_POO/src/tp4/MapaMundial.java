package tp4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class MapaMundial {
    private List<Continente> continentes;

    public MapaMundial() {
        continentes = new ArrayList<>();
        Continente america = new Continente("América");
        continentes.add(america);
        Continente europa = new Continente("Europa");
        continentes.add(europa);
        Continente asia = new Continente("Asia");
        continentes.add(asia);
        Continente africa = new Continente("África");
        continentes.add(africa);
        Continente oceania = new Continente("Oceanía");
        continentes.add(oceania);
        Continente antartida = new Continente("Antártida");
        continentes.add(antartida);
        
        Pais argentina = new Pais("Argentina", america);
        america.agregarPais(argentina);
        Pais uruguay = new Pais("Uruguay", america);
        america.agregarPais(uruguay);
        Pais brasil= new Pais("Brasil", america);
        america.agregarPais(brasil);
        Pais chile = new Pais("Chile", america);
        america.agregarPais(chile);
        Pais paraguay = new Pais("Paraguay", america);
        america.agregarPais(paraguay);
        Pais bolivia = new Pais("Bolivia", america);
        america.agregarPais(bolivia);
        Pais españa = new Pais("España", europa);
        europa.agregarPais(españa);
        Pais francia = new Pais("Francia", europa);
        europa.agregarPais(francia);
        Pais italia = new Pais("Italia", europa);
        europa.agregarPais(italia);
        Pais portugal = new Pais("Portugal", europa);
        europa.agregarPais(portugal);
        
        Provincia entre_rios = new Provincia("Entre Ríos", argentina);
        argentina.agregarProvincia(entre_rios);
        Provincia buenos_aires = new Provincia("Buenos Aires", argentina);
        argentina.agregarProvincia(buenos_aires);
        Provincia santa_fe = new Provincia("Santa Fe", argentina);
        argentina.agregarProvincia(santa_fe);
        Provincia corrientes = new Provincia("Corrientes", argentina);
        argentina.agregarProvincia(corrientes);
        Provincia cordoba = new Provincia("Córdoba", argentina);
        argentina.agregarProvincia(cordoba);
        Provincia salto = new Provincia("Salto", uruguay);
        uruguay.agregarProvincia(salto);
        Provincia paysandu = new Provincia("Paysandú", uruguay);
        uruguay.agregarProvincia(paysandu);
        Provincia canelones = new Provincia("Canelones", uruguay);
        uruguay.agregarProvincia(canelones);
        Provincia rocha = new Provincia("Rocha", uruguay);
        uruguay.agregarProvincia(rocha);
        Provincia maldonado = new Provincia("Maldonado", uruguay);
        uruguay.agregarProvincia(maldonado);
        
    }
    
    public Set<Pais> getPaises(String nombreContinente) {
        for (Continente continente : continentes) {
            if (continente.getNombre().equalsIgnoreCase(nombreContinente)) {
                return new HashSet<>(continente.getPaises());
            }
        }
        return null;
    }

    public Set<Provincia> getProvincias(String nombrePais) {
        for (Continente continente : continentes) {
            for (Pais pais : continente.getPaises()) {
                if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                    return new HashSet<>(pais.getProvincias());
                }
            }
        }
        return null;
    }
} 