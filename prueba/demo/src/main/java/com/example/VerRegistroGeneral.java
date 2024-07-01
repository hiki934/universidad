package com.example;

import javax.swing.*;
import java.awt.*;

public class VerRegistroGeneral extends JDialog {
    private JTextArea textAreaRegistros;
    private JButton btnCerrar;

    public VerRegistroGeneral() {
        setTitle("Ver Registro General");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        textAreaRegistros = new JTextArea();
        textAreaRegistros.setEditable(false);
        // Aquí se llenaría el textArea con todos los registros
        textAreaRegistros.setText("Aquí se mostrarán todos los registros...");

        add(new JScrollPane(textAreaRegistros), BorderLayout.CENTER);

        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        add(btnCerrar, BorderLayout.SOUTH);
    }
}