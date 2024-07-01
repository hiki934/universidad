package com.example;

import javax.swing.*;
import java.awt.*;

public class VerRegistrosConsumos extends JDialog {
    private JTextArea textAreaConsumos;
    private JButton btnCerrar;

    public VerRegistrosConsumos() {
        setTitle("Ver Registros de Consumos");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        textAreaConsumos = new JTextArea();
        textAreaConsumos.setEditable(false);
        // Aquí se llenaría el textArea con todos los registros de consumos
        textAreaConsumos.setText("Aquí se mostrarán todos los registros de consumos...");

        add(new JScrollPane(textAreaConsumos), BorderLayout.CENTER);

        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        add(btnCerrar, BorderLayout.SOUTH);
    }
}