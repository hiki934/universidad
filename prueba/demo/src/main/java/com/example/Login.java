package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JDialog {
    private JPanel panel;
    private JLabel labelUsuario;
    private JTextField textFieldUsuario;
    private JLabel labelContraseña;
    private JPasswordField passwordFieldContraseña;
    private JButton botonAceptar;
    private JButton botonCancelar;

    public Login() {
        setTitle("Hotel - Iniciar Sesión");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        labelUsuario = new JLabel("Usuario:");
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(labelUsuario);

        textFieldUsuario = new JTextField();
        panel.add(textFieldUsuario);

        labelContraseña = new JLabel("Contraseña:");
        labelContraseña.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(labelContraseña);

        passwordFieldContraseña = new JPasswordField();
        panel.add(passwordFieldContraseña);

        botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                String contraseña = new String(passwordFieldContraseña.getPassword());

                if (usuario.equals("user") && contraseña.equals("user")) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso!");
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });
        panel.add(botonAceptar);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        panel.add(botonCancelar);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}