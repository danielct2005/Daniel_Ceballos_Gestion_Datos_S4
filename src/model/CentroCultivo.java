package model;

public class CentroCultivo {
    // Atributos privados (Encapsulamiento)
    private String nombre;
    private String comuna;
    private int toneladas;

    // Constructor vacío
    public CentroCultivo() {
    }

    // Constructor con parámetros para inicializar el objeto
    public CentroCultivo(String nombre, String comuna, int toneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    // Método toString para facilitar la impresión de datos
    @Override
    public String toString() {
        return "Centro: " + nombre + " | Comuna: " + comuna + " | Producción: " + toneladas + " ton";
    }
}