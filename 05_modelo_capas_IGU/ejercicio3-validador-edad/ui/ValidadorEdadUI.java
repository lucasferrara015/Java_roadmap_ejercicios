package ejercicio3.validador.edad.ui;

import ejercicio3.validador.edad.logic.ValidadorEdad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidadorEdadUI extends JFrame {
    private JTextField txtEdad;
    private JLabel lblResultado;
    private ValidadorEdad validador;
    
    public ValidadorEdadUI() {
        validador = new ValidadorEdad();
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Validador de Edad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 150);
        
        txtEdad = new JTextField(10);
        JButton btnValidar = new JButton("Validar");
        lblResultado = new JLabel("Resultado: ");
        
        add(new JLabel("Ingrese edad:"));
        add(txtEdad);
        add(btnValidar);
        add(lblResultado);
        
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarEdad();
            }
        });
    }
    
    private void validarEdad() {
        try {
            int edad = Integer.parseInt(txtEdad.getText());
            validador.validar(edad);
            String categoria = validador.obtenerCategoria(edad);
            lblResultado.setText("Edad válida. Categoría: " + categoria);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            lblResultado.setText("Resultado: ");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ValidadorEdadUI().setVisible(true);
        });
    }
}
