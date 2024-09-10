/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Usurio
 */
import java.util.Scanner;
import modelo.Vehiculo;

public class VistaVehiculos {
    private Scanner scanner = new Scanner(System.in);

    public String obtenerEntrada(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public int obtenerEntradaEntero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public double obtenerEntradaDouble(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            vehiculo.mostrarInformacion();
            System.out.println("Costo de mantenimiento: " + vehiculo.calcularCostoMantenimiento());
        } else {
            mostrarMensaje("Vehículo no encontrado.");
        }
    }
}

