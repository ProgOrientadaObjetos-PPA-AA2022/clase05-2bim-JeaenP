/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.Serializable;

/**
 *
 * @author SALA I
 */
public class APIStarplus implements APIMovie, Serializable {
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"345346";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
    public String toString() {
        String cadena = String.format("Star Plus");
        return cadena;
    }
}
