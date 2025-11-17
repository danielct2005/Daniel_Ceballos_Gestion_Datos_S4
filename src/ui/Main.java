package ui;

import data.GestorDatos;
import model.CentroCultivo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el gestor
        GestorDatos gestor = new GestorDatos();

        // 2. Leemos el archivo (Asegúrate que la ruta coincida con tu carpeta)
        String rutaArchivo = "resources/centros.txt";
        ArrayList<CentroCultivo> listaCentros = gestor.leerArchivo(rutaArchivo);

        // --- RECORRIDO (Mostrar todos) ---
        System.out.println("--- LISTADO COMPLETO DE CENTROS ---");
        if (listaCentros.isEmpty()) {
            System.out.println("No se cargaron datos. Revisa la ruta del archivo.");
        } else {
            for (CentroCultivo c : listaCentros) {
                System.out.println(c.toString());
            }
        }

        // --- FILTRADO (Ejemplo: Producción mayor a 1000 toneladas) ---
        System.out.println("\n--- FILTRO: CENTROS CON ALTA PRODUCCIÓN (> 1000 ton) ---");
        boolean encontrado = false;

        for (CentroCultivo c : listaCentros) {
            // Condición de filtrado
            if (c.getToneladas() > 1000) {
                System.out.println("ALTA PRODUCCIÓN -> " + c.getNombre() + " (" + c.getToneladas() + " ton)");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay centros que cumplan con el criterio.");
        }
    }
}