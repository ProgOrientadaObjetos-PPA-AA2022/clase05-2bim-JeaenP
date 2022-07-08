/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Transporte> lista = new ArrayList<>();

        int op;
        do {
            System.out.println("Ingrese que tipo de transporte desea ingresar");
            System.out.println("1) Transporte Bus");
            System.out.println("2) Transporte Taxi");
            System.out.println("3) Transporte Aereo");
            System.out.println("4) Transporte Maritimo");
            System.out.println("0) Salir");
            op = sc.nextInt();
            if (op == 0) {
                break;
            }
            switch (op) {
                case 1:
                    TransporteBus bus = new TransporteBus();
                    bus.establecerTarifa();
                    lista.add(bus);
                    break;
                case 2:
                    TransporteTaxi taxi = new TransporteTaxi();
                    taxi.establecerTarifa();
                    lista.add(taxi);
                    break;

                case 3:
                    TransporteAereo avion = new TransporteAereo();
                    avion.establecerTarifa();
                    lista.add(avion);
                    break;

                case 4:
                    TransporteMaritimo barco = new TransporteMaritimo();
                    barco.establecerTarifa();
                    lista.add(barco);
                    break;

            }
            
        } while (op != 0) ;
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        System.out.println(tipos);
    }
    

}
