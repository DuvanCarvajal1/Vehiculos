/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usurio
 */
public class Camion extends Vehiculo implements Mantenimiento {
    private double peso;

    public Camion(String matricula, String marca, String modelo, int añoFabricacion, double peso) {
        super(matricula, marca, modelo, añoFabricacion);
        this.peso = peso;
    }

    @Override
    public double calcularCostoMantenimiento() {
        double costoBase = 500;
        if (peso > 5000) {
            costoBase += 200;
        }
        if (añoFabricacion < 2010) {
            costoBase += 100;
        }
        return costoBase;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Revisión del camión realizada.");
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Aceite del camión cambiado.");
    }
}

