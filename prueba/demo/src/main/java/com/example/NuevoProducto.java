package com.example;

import javax.swing.*;
import java.awt.*;

public class
NuevoProducto extends JDialog {
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtStock;
    private JButton btnAgregar;
    private JButton btnCancelar;

    public NuevoProducto() {
        setTitle("Nuevo Producto");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2));

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        add(txtPrecio);

        add(new JLabel("Stock:"));
        txtStock = new JTextField();
        add(txtStock);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(e -> {
            // Código para agregar el producto
            JOptionPane.showMessageDialog(null, "Producto agregado exitosamente!");
        });
        add(btnAgregar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);
    }
}
