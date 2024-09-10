/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usurio
 */
public class Coche extends Vehiculo implements Mantenimiento {
    public Coche(String matricula, String marca, String modelo, int añoFabricacion) {
        super(matricula, marca, modelo, añoFabricacion);
    }

    @Override
    public double calcularCostoMantenimiento() {
        return añoFabricacion < 2015 ? 200 : 150;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Revisión del coche realizada.");
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Aceite del coche cambiado.");
    }
}

