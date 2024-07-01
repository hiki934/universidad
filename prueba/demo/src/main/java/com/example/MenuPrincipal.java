package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private JButton btnRegistrarReserva;
    private JButton btnModificarReserva;
    private JButton btnEliminarReserva;
    private JButton btnConsultarRegistro;
    private JButton btnVerRegistroGeneral;
    private JButton btnNuevoProducto;
    private JButton btnNuevoConsumo;
    private JButton btnVerRegistrosConsumos;
    private JButton btnVerRegistrosHospedajes;

    public MenuPrincipal() {
        setTitle("Hotel - Menú Principal");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3, 10, 10)); // 3x3 grid with spacing

        btnRegistrarReserva = createButton("Registrar Reserva", e -> {
            RegistrarReserva registrarReserva = new RegistrarReserva();
            registrarReserva.setVisible(true);
        });

        btnModificarReserva = createButton("Modificar Reserva", e -> {
            ModificarReserva modificarReserva = new ModificarReserva();
            modificarReserva.setVisible(true);
        });

        btnEliminarReserva = createButton("Eliminar Reserva", e -> {
            EliminarReserva eliminarReserva = new EliminarReserva();
            eliminarReserva.setVisible(true);
        });

        btnConsultarRegistro = createButton("Consultar Registro", e -> {
            ConsultarRegistro consultarRegistro = new ConsultarRegistro();
            consultarRegistro.setVisible(true);
        });

        btnVerRegistroGeneral = createButton("Ver Registro General", e -> {
            VerRegistroGeneral verRegistroGeneral = new VerRegistroGeneral();
            verRegistroGeneral.setVisible(true);
        });

        btnNuevoProducto = createButton("Nuevo Producto", e -> {
            NuevoProducto nuevoProducto = new NuevoProducto();
            nuevoProducto.setVisible(true);
        });

        btnNuevoConsumo = createButton("Nuevo Consumo", e -> {
            NuevoConsumo nuevoConsumo = new NuevoConsumo();
            nuevoConsumo.setVisible(true);
        });

        btnVerRegistrosConsumos = createButton("Ver Registros de Consumos", e -> {
            VerRegistrosConsumos verRegistrosConsumos = new VerRegistrosConsumos();
            verRegistrosConsumos.setVisible(true);
        });

        btnVerRegistrosHospedajes = createButton("Ver Registros de Hospedajes", e -> {
            VerRegistrosHospedajes verRegistrosHospedajes = new VerRegistrosHospedajes();
            verRegistrosHospedajes.setVisible(true);
        });

        add(btnRegistrarReserva);
        add(btnModificarReserva);
        add(btnEliminarReserva);
        add(btnConsultarRegistro);
        add(btnVerRegistroGeneral);
        add(btnNuevoProducto);
        add(btnNuevoConsumo);
        add(btnVerRegistrosConsumos);
        add(btnVerRegistrosHospedajes);
    }

    private JButton createButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.addActionListener(actionListener);
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        });
    }
}