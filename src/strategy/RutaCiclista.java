/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Personal
 */
public class RutaCiclista implements RutaStrategy {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta para ciclistas desde " + origen + " hasta " + destino + ".");
        System.out.println("Mostrando ciclovias y zonas seguras para bicicletas...");
    }
}
