package com.example;
import javax.swing.*;
import java.awt.*;

public class EliminarReserva extends JDialog {
    private JTextField txtNumeroReserva;
    private JButton btnEliminar;
    private JButton btnCancelar;

    public EliminarReserva() {
        setTitle("Eliminar Reserva");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Número de Reserva:"));
        txtNumeroReserva = new JTextField();
        add(txtNumeroReserva);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(e -> {
            // Código para eliminar la reserva
            JOptionPane.showMessageDialog(null, "Reserva eliminada exitosamente!");
        });
        add(btnEliminar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dispose());
        add(btnCancelar);
    }
}
