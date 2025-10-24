/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Personal
 */
public class RutaCarro implements RutaStrategy {

    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta por carreteras desde " + origen + " hasta " + destino + ".");
        System.out.println("Mostrando ruta mas rapida en autopistas y vias principales...");
    }

}
