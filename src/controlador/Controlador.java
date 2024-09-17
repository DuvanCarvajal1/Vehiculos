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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.vista;

public class Controlador {
    private vista view;
    private ArrayList<String> vehiculos;

    public Controlador(vista view) {
        this.view = view;
        this.vehiculos = new ArrayList<>();
        initController();
    }

    private void initController() {
        view.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarVehiculo();
            }
        });

        view.getBtnMostrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVehiculos();
            }
        });
    }

    private void registrarVehiculo() {
        String matricula = view.getTxtMatricula().getText();
        String marca = view.getTxtMarca().getText();
        String modelo = view.getTxtModelo().getText();
        String año = view.getTxtAñoFabricacion().getText();
        String turbo = view.getTxtTurbo().getText();
        String cilindrada = view.getTxtCilindrada().getText();
        String tipoVehiculo = view.getComboTipoVehiculo().getSelectedItem().toString();

        if (matricula.isEmpty() || marca.isEmpty() || modelo.isEmpty() || año.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }

        String vehiculo = String.format("Matricula: %s, Marca: %s, Modelo: %s, Año: %s, Turbo: %s, Cilindrada: %s, Tipo: %s",
                                        matricula, marca, modelo, año, turbo, cilindrada, tipoVehiculo);
        vehiculos.add(vehiculo);
        JOptionPane.showMessageDialog(null, "Vehículo registrado correctamente.");
        limpiarCampos();
    }

    private void mostrarVehiculos() {
        StringBuilder sb = new StringBuilder();
        for (String vehiculo : vehiculos) {
            sb.append(vehiculo).append("\n");
        }
        view.getAreaMostrar().setText(sb.toString());
    }

    private void limpiarCampos() {
        view.getTxtMatricula().setText("");
        view.getTxtMarca().setText("");
        view.getTxtModelo().setText("");
        view.getTxtAñoFabricacion().setText("");
        view.getTxtTurbo().setText("");
        view.getTxtCilindrada().setText("");
        view.getComboTipoVehiculo().setSelectedIndex(0);
    }
}
