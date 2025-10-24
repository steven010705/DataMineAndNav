/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Personal
 */
public class RutaTransportePublico implements RutaStrategy {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta en transporte público desde " + origen + " hasta " + destino + ".");
        System.out.println("Mostrando buses, metro y tiempos de espera...");
    }
}