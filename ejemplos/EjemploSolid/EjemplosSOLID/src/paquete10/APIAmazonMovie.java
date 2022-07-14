/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.io.Serializable;


public class APIAmazonMovie implements APIMovie, Serializable{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"909090";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
    public String toString() {
        String cadena = String.format("Amazon Movie");
        return cadena;
    }
    
}
