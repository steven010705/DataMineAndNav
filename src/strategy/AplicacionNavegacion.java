/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class AplicacionNavegacion {

    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Navegacion ===");
        System.out.print("Ingrese origen: ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese destino: ");
        String destino = scanner.nextLine();

        System.out.println("\nSeleccione el tipo de ruta:");
        System.out.println("1. Carro o moto ");
        System.out.println("2. A Pie");
        System.out.println("3. Para Bicicleta");
        System.out.println("4. Transporte Publico");

        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                navegador.setEstrategia(new RutaCarro());
                break;
            case 2:
                navegador.setEstrategia(new RutaAPie());
                break;
            case 3:
                navegador.setEstrategia(new RutaCiclista());
                break;
            case 4:
                navegador.setEstrategia(new RutaTransportePublico());
                break;

            default:
                System.out.println("Opcion no valida.");
                return;
        }

        System.out.println("\n--- Calculando Ruta ---");
        navegador.mostrarRuta(origen, destino);
    }
}
