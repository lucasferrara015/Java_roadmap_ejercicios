package ejercicio5.conversor.unidades.ui;

import ejercicio5.conversor.unidades.controller.ConversorController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorUI extends JFrame {
    private JTextField txtValor;
    private JComboBox<String> cbTipoConversion;
    private JLabel lblResultado;
    private ConversorController controller;
    
    public ConversorUI() {
        controller = new ConversorController();
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Conversor de Unidades");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setSize(450, 250);
        setLocationRelativeTo(null);
        
        // Componentes
        txtValor = new JTextField();
        cbTipoConversion = new JComboBox<>(new String[]{
            "metros→pies", "pies→metros", "°C→°F", "°F→°C"
        });
        JButton btnConvertir = new JButton("Convertir");
        lblResultado = new JLabel("---");
        
        // Añadir con GridLayout
        add(new JLabel("Valor a convertir:"));
        add(txtValor);
        add(new JLabel("Tipo de conversión:"));
        add(cbTipoConversion);
        add(new JLabel("Resultado:"));
        add(lblResultado);
        add(new JLabel(""));
        add(btnConvertir);
        
        // Evento
        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertir();
            }
        });
    }
    
    private void convertir() {
        try {
            double valor = Double.parseDouble(txtValor.getText());
            String tipo = (String) cbTipoConversion.getSelectedItem();
            double resultado = controller.convertir(tipo, valor);
            lblResultado.setText(String.format("%.4f", resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido");
            lblResultado.setText("---");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            lblResultado.setText("---");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ConversorUI().setVisible(true);
        });
    }
}
