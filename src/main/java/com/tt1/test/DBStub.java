package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> Lista;
    private List<String> email;

    public DBStub() {
        Lista = new ArrayList<>();
        email = new ArrayList<>();
    }
    public void crearTarea(ToDo tarea1) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public List<ToDo> obtenerTareas() {
        throw new UnsupportedOperationException("Clase aun no implementada");
    }
    public ToDo buscarTarea(String nombre) {
        throw new UnsupportedOperationException("Clase aun no implementada");
    }
    public boolean actualizarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún");
    }
    public boolean delete(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aun no implementada.");
    }
    public List<String> obtenerEmails() {
        throw new UnsupportedOperationException("Clase aun no implementada.");
    }
    public boolean eliminarEmail(String email) {
        throw new UnsupportedOperationException("Clase aun no implementada.");
    }
}
