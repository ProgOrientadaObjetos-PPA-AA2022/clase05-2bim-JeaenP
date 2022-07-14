/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author SALA I
 */
public class EscrituraArchivo {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> listaGeneradorPeliculas;
    
    public EscrituraArchivo(String x) {
        nombreArchivo = x;
        establecerListaGeneradorPeliculas();
        
        try {
            
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            if (listaGeneradorPeliculas.size() > 0) {
                for (int i = 0; i < listaGeneradorPeliculas.size(); i++) {
                    establecerRegistro(listaGeneradorPeliculas.get(i));
                    establecerSalida();
                }
            }
            
        } catch (IOException IOexception) {
            System.out.println(
                    "-------------------------\n"
                    + "ERROR AL ABRIR EL ARCHIVO\n"
                    + "-------------------------");
        }
    }
    
    public void establecerNombreArchivo(String x) {
        nombreArchivo = x;
    }
    
    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println(
                    "-------------------------------\n"
                    + "ERROR AL ESCRIBIR EN EL ARCHIVO\n"
                    + "-------------------------------");
        }
    }
    
    public void establecerRegistro(GeneradorPeliculas x) {
        registro = x;
    }
    
    public void establecerListaGeneradorPeliculas() {
        LecturaArchivo x = new LecturaArchivo(nombreArchivo);
        x.establecerGeneradorPeliculas();
        listaGeneradorPeliculas = x.obtenerGeneradorPeliculas();
    }
    
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public ObjectOutputStream obtenerSalida() {
        return salida;
    }
    
    public ArrayList<GeneradorPeliculas> obtenerListaGeneradorPeliculas() {
        return listaGeneradorPeliculas;
    }
    
    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.out.println(
                "--------------------------\n"
                + "ERROR AL CERRAR EL ARCHIVO\n"
                + "--------------------------");
        } 
    } 
}
