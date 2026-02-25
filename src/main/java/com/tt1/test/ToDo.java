package com.tt1.test;
import java.time.LocalDate;

public class ToDo {
    private String nombre;
    private String descripcion;
    private LocalDate dueDate;
    private boolean completado;

    public ToDo() {
        this.nombre = null;
        this.descripcion = null;
        this.dueDate = null;
        this.completado = false;
    }
    public ToDo(String nombre, String descripcion, LocalDate dueDate, boolean completado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dueDate = dueDate;
        this.completado = completado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDate getDueDate() {
        return this.dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
