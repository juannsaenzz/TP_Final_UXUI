package tp4;

import java.util.Scanner;
import java.util.Set;

public class MapaMundi {
    private static MapaMundial mapaMundial;

    public static void main(String[] args) {
        mapaMundial = new MapaMundial();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    listarPaisesPorContinente(scanner);
                    break;
                case 2:
                    listarProvinciasPorPais(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("");
        System.out.println("1. Listar países por continente");
        System.out.println("2. Listar provincias por país");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void listarPaisesPorContinente(Scanner scanner) {
        System.out.print("Ingrese el nombre del continente: ");
        String nombreContinente = scanner.nextLine().trim().toLowerCase();
        Set<Pais> paises = mapaMundial.getPaises(nombreContinente);
        if (paises != null) {
            System.out.println("Países en " + nombreContinente + ":");
            for (Pais pais : paises) {
                System.out.println("- " + pais.getNombre());
            }
        } else {
            System.out.println("El continente ingresado no existe.");
        }
    }

    private static void listarProvinciasPorPais(Scanner scanner) {
        System.out.print("Ingrese el nombre del país: ");
        String nombrePais = scanner.nextLine().trim();
        Set<Provincia> provincias = mapaMundial.getProvincias(nombrePais);
        if (provincias != null) {
            System.out.println("Provincias en " + nombrePais + ":");
            for (Provincia provincia : provincias) {
                System.out.println("- " + provincia.getNombre());
            }
        } else {
            System.out.println("El país ingresado no existe.");
        }
    }
}