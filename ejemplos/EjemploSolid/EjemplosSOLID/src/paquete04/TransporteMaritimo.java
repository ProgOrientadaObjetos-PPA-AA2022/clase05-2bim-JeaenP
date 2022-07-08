/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteMaritimo extends Transporte {
    private String cooperativaBus;

    public void establecerCooperativaBus(String n) {
        cooperativaBus = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 150 + 2/5;
    }

    public String obtenerCooperativaBus() {
        return cooperativaBus;
    }

    public String toString() {
        String cadena = String.format("Transporte Maritimo: %.2f\n", tarifa );
        return cadena;
    }
}
