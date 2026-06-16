package ejercicio4.gestor.tareas.ui;

import ejercicio4.gestor.tareas.logic.GestorTareas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorTareasUI extends JFrame {
    private JTextField txtNuevaTarea;
    private JList<String> listaTareas;
    private DefaultListModel<String> modeloTareas;
    private GestorTareas gestor;
    
    public GestorTareasUI() {
        gestor = new GestorTareas();
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Gestor de Tareas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(500, 400);
        setLocationRelativeTo(null);
        
        // Panel superior (agregar tareas)
        JPanel panelSuperior = new JPanel(new FlowLayout());
        txtNuevaTarea = new JTextField(20);
        JButton btnAgregar = new JButton("Agregar");
        panelSuperior.add(new JLabel("Nueva tarea:"));
        panelSuperior.add(txtNuevaTarea);
        panelSuperior.add(btnAgregar);
        
        // Lista de tareas
        modeloTareas = new DefaultListModel<>();
        listaTareas = new JList<>(modeloTareas);
        JScrollPane scrollLista = new JScrollPane(listaTareas);
        
        // Panel inferior (eliminar)
        JPanel panelInferior = new JPanel(new FlowLayout());
        JButton btnEliminar = new JButton("Eliminar seleccionada");
        JButton btnActualizar = new JButton("Actualizar lista");
        panelInferior.add(btnEliminar);
        panelInferior.add(btnActualizar);
        
        // Añadir componentes al frame
        add(panelSuperior, BorderLayout.NORTH);
        add(scrollLista, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
        
        // Eventos
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTarea();
            }
        });
        
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTarea();
            }
        });
        
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarLista();
            }
        });
    }
    
    private void agregarTarea() {
        String tarea = txtNuevaTarea.getText();
        try {
            gestor.agregarTarea(tarea);
            txtNuevaTarea.setText("");
            actualizarLista();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void eliminarTarea() {
        int indice = listaTareas.getSelectedIndex();
        if (indice == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una tarea para eliminar");
            return;
        }
        
        try {
            gestor.eliminarTarea(indice);
            actualizarLista();
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void actualizarLista() {
        modeloTareas.clear();
        for (String tarea : gestor.getTareas()) {
            modeloTareas.addElement(tarea);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestorTareasUI().setVisible(true);
        });
    }
}
