package com.example;

import javax.swing.*;
import java.awt.*;

public class RegistrarReserva extends JDialog {
    private JTextField txtNombre;
    private JTextField txtFechaEntrada;
    private JTextField txtFechaSalida;
    private JButton btnRegistrar;
    private JButton btnCancelar;

    public RegistrarReserva() {
        setTitle("Registrar Reserva");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2));

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Fecha de Entrada:"));
        txtFechaEntrada = new JTextField();
        add(txtFechaEntrada);

        add(new JLabel("Fecha de Salida:"));
        txtFechaSalida = new JTextField();
        add(txtFechaSalida);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(e -> {
            // Código para registrar la reserva
            JOptionPane.showMessageDialog(null, "Reserva registrada exitosamente!");
        });
        add(btnRegistrar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);
    }
}