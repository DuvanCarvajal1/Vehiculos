/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usurio
 */
public abstract class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int añoFabricacion;

    public Vehiculo(String matricula, String marca, String modelo, int añoFabricacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    // Método abstracto que deberá ser implementado en las subclases
    public abstract double calcularCostoMantenimiento();

    public void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

