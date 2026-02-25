package com.tt1.test;

import java.util.List;

public interface Irepositorio {
    void guardarTarea(ToDo tarea);
    ToDo encontrarTarea(String nombre);
    boolean marcarComoCompletada(ToDo tarea);
    boolean guardarEmail(String email);
    List<String> obtenerEmails();
}
