package data;

import model.CentroCultivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {

    // Método que recibe la ruta del archivo y devuelve una lista de centros
    public ArrayList<CentroCultivo> leerArchivo(String ruta) {

        // Creamos la lista vacía donde guardaremos los objetos
        ArrayList<CentroCultivo> centros = new ArrayList<>();

        try {
            // Referencia al archivo
            File archivo = new File(ruta);
            Scanner scanner = new Scanner(archivo);

            // Leemos línea por línea mientras existan datos
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine(); // Ejemplo: "Isla Huar;Calbuco;1200"

                // .split(";") divide el texto donde encuentre un ";"
                // partes[0] será el nombre, partes[1] la comuna, partes[2] las toneladas
                String[] partes = linea.split(";");

                // Validación simple para asegurar que la línea tiene 3 datos
                if (partes.length == 3) {
                    String nombre = partes[0];
                    String comuna = partes[1];
                    // Convertimos el String de toneladas a entero (int)
                    int toneladas = Integer.parseInt(partes[2]);

                    // Creamos el objeto y lo agregamos a la lista
                    CentroCultivo centro = new CentroCultivo(nombre, comuna, toneladas);
                    centros.add(centro);
                }
            }
            scanner.close(); // Cerramos el scanner para liberar memoria

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo en la ruta: " + ruta);
        } catch (NumberFormatException e) {
            System.out.println("Error: Hubo un problema al convertir un número en el archivo.");
        }

        return centros;
    }
}