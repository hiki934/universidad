package com.example;
import javax.swing.*;
import java.awt.*;

public class NuevoConsumo extends JDialog {
    private JTextField txtNumeroReserva;
    private JTextField txtProducto;
    private JTextField txtCantidad;
    private JButton btnRegistrar;
    private JButton btnCancelar;

    public NuevoConsumo() {
        setTitle("Nuevo Consumo");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2));

        add(new JLabel("Número de Reserva:"));
        txtNumeroReserva = new JTextField();
        add(txtNumeroReserva);

        add(new JLabel("Producto:"));
        txtProducto = new JTextField();
        add(txtProducto);

        add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField();
        add(txtCantidad);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(e -> {
            // Código para registrar el consumo
            JOptionPane.showMessageDialog(null, "Consumo registrado exitosamente!");
        });
        add(btnRegistrar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);
    }
}

