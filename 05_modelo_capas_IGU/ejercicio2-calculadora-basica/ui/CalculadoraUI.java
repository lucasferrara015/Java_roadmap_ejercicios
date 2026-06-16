package ejercicio2.calculadora.basica.ui;

import ejercicio2.calculadora.basica.logic.Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraUI extends JFrame {
    private JTextField txtNumero1, txtNumero2;
    private JComboBox<String> cbOperacion;
    private JLabel lblResultado;
    private Calculadora calculadora;
    
    public CalculadoraUI() {
        calculadora = new Calculadora();
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Calculadora Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(350, 200);
        
        // Componentes
        txtNumero1 = new JTextField(8);
        txtNumero2 = new JTextField(8);
        cbOperacion = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        JButton btnCalcular = new JButton("Calcular");
        lblResultado = new JLabel("Resultado: ");
        
        // Añadir componentes
        add(new JLabel("Número 1:"));
        add(txtNumero1);
        add(new JLabel("Número 2:"));
        add(txtNumero2);
        add(cbOperacion);
        add(btnCalcular);
        add(lblResultado);
        
        // Evento del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }
    
    private void calcular() {
        try {
            double num1 = Double.parseDouble(txtNumero1.getText());
            double num2 = Double.parseDouble(txtNumero2.getText());
            String operacion = (String) cbOperacion.getSelectedItem();
            double resultado = 0;
            
            switch (operacion) {
                case "+":
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case "-":
                    resultado = calculadora.restar(num1, num2);
                    break;
                case "*":
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case "/":
                    resultado = calculadora.dividir(num1, num2);
                    break;
            }
            
            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese números válidos");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraUI().setVisible(true);
        });
    }
}
