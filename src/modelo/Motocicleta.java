/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usurio
 */
public class Motocicleta extends Vehiculo implements Mantenimiento {
    private int cilindrada;

    public Motocicleta(String matricula, String marca, String modelo, int añoFabricacion, int cilindrada) {
        super(matricula, marca, modelo, añoFabricacion);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCostoMantenimiento() {
        int antiguedad = 2024 - añoFabricacion;
        return cilindrada * 0.5 + antiguedad * 20;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Revisión de la motocicleta realizada.");
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Aceite de la motocicleta cambiado.");
    }
}

