package com.tt1.test;
import java.util.List;

public class Repositorio implements Irepositorio {
    private DBStub db;

    public Repositorio(DBStub db) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void guardarTarea(ToDo tarea1) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo encontrarTarea(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean marcarComoCompletada(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> obtenerEmails(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}