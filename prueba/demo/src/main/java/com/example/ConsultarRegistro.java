package com.example;
import javax.swing.*;
import java.awt.*;

public class ConsultarRegistro extends JDialog {
    private JTextField txtNumeroReserva;
    private JButton btnConsultar;
    private JTextArea textAreaResultado;
    private JButton btnCancelar;

    public ConsultarRegistro() {
        setTitle("Consultar Registro");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new GridLayout(2, 2));
        panelSuperior.add(new JLabel("Número de Reserva:"));
        txtNumeroReserva = new JTextField();
        panelSuperior.add(txtNumeroReserva);

        btnConsultar = new JButton("Consultar");
        btnConsultar.addActionListener(e -> {
            // Código para consultar la reserva
            textAreaResultado.setText("Información de la reserva...");
        });
        panelSuperior.add(btnConsultar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());
        panelSuperior.add(btnCancelar);

        add(panelSuperior, BorderLayout.NORTH);

        textAreaResultado = new JTextArea();
        textAreaResultado.setEditable(false);
        add(new JScrollPane(textAreaResultado), BorderLayout.CENTER);
    }
}
