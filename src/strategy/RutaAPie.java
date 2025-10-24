/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Personal
 */
public class RutaAPie implements RutaStrategy {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta a pie desde " + origen + " hasta " + destino + ".");
        System.out.println("Mostrando caminos peatonales y senderos...");
    }
}