/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class Principal2 {
    public static void main(String[] args) {
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        //System.out.println(gp);
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        //System.out.println(gp2);
        
        APIStarplus api3 = new APIStarplus();
        api3.establecerApiKey("123455");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        //System.out.println(gp3);
        
        APIDirecTVGo api4 = new APIDirecTVGo();
        api4.establecerApiKey("123455");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        //System.out.println(gp4);
        
        String nombreArchivo = "GeneradorPeliculas.data";
        EscrituraArchivo archivo = 
                new EscrituraArchivo(nombreArchivo);
        archivo.establecerRegistro(gp);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistro(gp2);
        archivo.establecerSalida();
        archivo.establecerRegistro(gp3);
        archivo.establecerSalida();
        archivo.establecerRegistro(gp4);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
    }
    
        
}
