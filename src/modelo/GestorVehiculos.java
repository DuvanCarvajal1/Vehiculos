/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author Usurio
 */


public class GestorVehiculos {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculoPorMatricula(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}

