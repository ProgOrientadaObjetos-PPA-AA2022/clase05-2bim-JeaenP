/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public void establecerPromedioEdadesCualitativo() {
        if (promedioEdades > 0 && promedioEdades <= 21) {
            promedioEdadesCualitativo = "Promedio Jovenes";
        } else if(promedioEdades > 21) {
            promedioEdadesCualitativo = "Promedio Adulto";
        }
    }
    
    public String toString() {
        String cadena = String.format("Estudiantes\n");
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%sEstudiante %d\n"
                    + "Nombre: %s\n",
                    cadena,
                    (i + 1),
                    estudiantes.get(i).obtenerNombre());
        }
        cadena = String.format("%sPromedio Edades: %.2f\n"
                + "Promedio Edades Cualitativo: %s\n",
                cadena,
                promedioEdades,
                promedioEdadesCualitativo);
        return cadena;
    }
    
}
