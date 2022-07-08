/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import paquete03.*;

/**
 *
 * @author SALA I
 */
public class TransporteAereo extends Transporte {
    private String cooperativaAereo;
    
    
    public void establecerCooperativaAereo(String n){
        cooperativaAereo = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 100 + 0.20;
    }
    
    public String obtenerCooperativaAereo(){
        return cooperativaAereo;
    }
    
    public String toString() {
        String cadena = String.format("Transporte aereo: %.2f\n", tarifa );
        return cadena;
    }
}
