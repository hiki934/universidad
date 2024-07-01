package com.example;
import javax.swing.*;
import java.awt.*;

public class VerRegistrosHospedajes extends JDialog {
    private JTextArea textAreaHospedajes;
    private JButton btnCerrar;

    public VerRegistrosHospedajes() {
        setTitle("Ver Registros de Hospedajes");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        textAreaHospedajes = new JTextArea();
        textAreaHospedajes.setEditable(false);
        // Aquí se llenaría el textArea con todos los registros de hospedajes
        textAreaHospedajes.setText("Aquí se mostrarán todos los registros de hospedajes...");

        add(new JScrollPane(textAreaHospedajes), BorderLayout.CENTER);

        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        add(btnCerrar, BorderLayout.SOUTH);
    }
}
