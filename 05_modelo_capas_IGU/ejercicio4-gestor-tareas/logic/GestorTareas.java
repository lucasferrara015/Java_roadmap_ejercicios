package ejercicio4.gestor.tareas.logic;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<String> tareas;
    
    public GestorTareas() {
        tareas = new ArrayList<>();
    }
    
    public void agregarTarea(String tarea) {
        if (tarea == null || tarea.trim().isEmpty()) {
            throw new IllegalArgumentException("La tarea no puede estar vacía");
        }
        tareas.add(tarea);
    }
    
    public void eliminarTarea(int indice) {
        if (indice < 0 || indice >= tareas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        tareas.remove(indice);
    }
    
    public List<String> getTareas() {
        return new ArrayList<>(tareas); // Retorna una copia defensiva
    }
    
    public int getCantidad() {
        return tareas.size();
    }
}
