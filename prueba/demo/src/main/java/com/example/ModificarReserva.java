package com.example;

import javax.swing.*;
import java.awt.*;

public class ModificarReserva extends JDialog {
    private JTextField txtNumeroReserva;
    private JTextField txtNuevoNombre;
    private JTextField txtNuevaFechaEntrada;
    private JTextField txtNuevaFechaSalida;
    private JButton btnModificar;
    private JButton btnCancelar;

    public ModificarReserva() {
        setTitle("Modificar Reserva");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(6, 2));

        add(new JLabel("Número de Reserva:"));
        txtNumeroReserva = new JTextField();
        add(txtNumeroReserva);

        add(new JLabel("Nuevo Nombre:"));
        txtNuevoNombre = new JTextField();
        add(txtNuevoNombre);

        add(new JLabel("Nueva Fecha de Entrada:"));
        txtNuevaFechaEntrada = new JTextField();
        add(txtNuevaFechaEntrada);

        add(new JLabel("Nueva Fecha de Salida:"));
        txtNuevaFechaSalida = new JTextField();
        add(txtNuevaFechaSalida);

        btnModificar = new JButton("Modificar");
        btnModificar.addActionListener(e -> {
            // Código para modificar la reserva
            JOptionPane.showMessageDialog(null, "Reserva modificada exitosamente!");
        });
        add(btnModificar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);
    }
}