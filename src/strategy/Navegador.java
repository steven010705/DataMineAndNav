/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Personal
 */
public class Navegador {
private RutaStrategy estrategia;

    public void setEstrategia(RutaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void mostrarRuta(String origen, String destino) {
        if (estrategia == null) {
            System.out.println("No se ha seleccionado una estrategia de ruta.");
        } else {
            estrategia.calcularRuta(origen, destino);
        }
    }
}