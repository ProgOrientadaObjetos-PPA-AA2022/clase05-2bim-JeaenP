/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        Persona e1 = new Persona("Jean", 18);
        Persona e2 = new Persona("Paul", 20);
        Persona e3 = new Persona("Pablo", 45);
        
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        
        OperacionesEstudiantes oe = new OperacionesEstudiantes();
        oe.establecerEstudiante(lista);
        oe.establecerPromedioEdades();
        oe.establecerPromedioEdadesCualitativo();
        System.out.println(oe);
    }
}
