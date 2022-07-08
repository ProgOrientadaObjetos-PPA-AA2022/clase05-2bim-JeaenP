/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
public class TransporteAereo {
    private String cooperativaAereo;
    private double tarifa;
    
    public void establecerCooperativaAereo(String n){
        cooperativaAereo = n;
    }
    
    public void establecerTarifa(){
        tarifa = 40 / (0.40/0.5);
    }
    
    public String obtenerCooperativaAereo(){
        return cooperativaAereo;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
