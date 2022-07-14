/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class Tarjeta {
    private String nombreBanco;
    private double cupoMaximo;

    public Tarjeta(String nombreBanco, double cupoMaximo) {
        this.nombreBanco = nombreBanco;
        this.cupoMaximo = cupoMaximo;
    }

    
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setCupoMaximo(double cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getCupoMaximo() {
        return cupoMaximo;
    }
    
    public String toString() {
        String cadena = String.format("Tarjeta\n"
                + "Nombre del banco: %s\n"
                + "Cupo maximo %.2f\n",
                nombreBanco,
                cupoMaximo);
        return cadena;
    }
    
    
}
