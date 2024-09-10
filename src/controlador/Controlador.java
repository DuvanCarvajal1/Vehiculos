/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.Camion;
import modelo.Coche;
import modelo.GestorVehiculos;
import modelo.Mantenimiento;
import modelo.Motocicleta;
import modelo.Vehiculo;
import vista.VistaVehiculos;

/**
 *
 * @author Usurio
 */
public class Controlador {

    private GestorVehiculos gestor;
    private VistaVehiculos vista;

    public Controlador(GestorVehiculos gestor, VistaVehiculos vista) {
        this.gestor = gestor;
        this.vista = vista;
    }

    public void iniciar() {
        while (true) {
            String opcion = vista.obtenerEntrada("1. Registrar Vehículo\n2. Consultar Costo de Mantenimiento\n3. Realizar Mantenimiento\n4. Salir");

            switch (opcion) {
                case "1":
                    registrarVehiculo();
                    break;
                case "2":
                    consultarCostoMantenimiento();
                    break;
                case "3":
                    realizarMantenimiento();
                    break;
                case "4":
                    vista.mostrarMensaje("Saliendo...");
                    return;
                default:
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        }
    }

    private void registrarVehiculo() {
        String tipo = vista.obtenerEntrada("¿Qué tipo de vehículo deseas registrar? (Coche/Camion/Motocicleta): ");
        String matricula = vista.obtenerEntrada("Matrícula: ");
        String marca = vista.obtenerEntrada("Marca: ");
        String modelo = vista.obtenerEntrada("Modelo: ");
        int anio = vista.obtenerEntradaEntero("Año de fabricación: ");

        Vehiculo vehiculo = null;

        if (tipo.equalsIgnoreCase("Coche")) {
            vehiculo = new Coche(matricula, marca, modelo, anio);
        } else if (tipo.equalsIgnoreCase("Camion")) {
            double peso = vista.obtenerEntradaDouble("Peso del camión: ");
            vehiculo = new Camion(matricula, marca, modelo, anio, peso);
        } else if (tipo.equalsIgnoreCase("Motocicleta")) {
            int cilindrada = vista.obtenerEntradaEntero("Cilindrada de la motocicleta: ");
            vehiculo = new Motocicleta(matricula, marca, modelo, anio, cilindrada);
        } else {
            vista.mostrarMensaje("Tipo de vehículo no reconocido.");
        }

        if (vehiculo != null) {
            gestor.registrarVehiculo(vehiculo);
            vista.mostrarMensaje("Vehículo registrado correctamente.");
        }
    }

    private void consultarCostoMantenimiento() {
        String matricula = vista.obtenerEntrada("Introduce la matrícula del vehículo: ");
        Vehiculo vehiculo = gestor.buscarVehiculoPorMatricula(matricula);
        vista.mostrarInformacionVehiculo(vehiculo);
    }

    private void realizarMantenimiento() {
        String matricula = vista.obtenerEntrada("Introduce la matrícula del vehículo: ");
        Vehiculo vehiculo = gestor.buscarVehiculoPorMatricula(matricula);

        if (vehiculo != null && vehiculo instanceof Mantenimiento) {
            ((Mantenimiento) vehiculo).realizarRevision();
            ((Mantenimiento) vehiculo).cambiarAceite();
        } else {
            vista.mostrarMensaje("Vehículo no encontrado o no tiene mantenimiento disponible.");
        }
    }
}

