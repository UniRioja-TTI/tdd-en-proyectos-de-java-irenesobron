package com.tt1.test;
import java.util.List;

/**
 * Implementación de {@link Irepositorio}.
 * <p>
 * Actúa como capa de acceso a datos, traduciendo las operaciones de negocio
 * definidas en {@link Irepositorio} a llamadas concretas sobre la base de datos
 * simulada {@link DBStub}.
 * </p>
 *
 * @author Irene Sobrón
 * @see Irepositorio
 * @see DBStub
 */
public class Repositorio implements Irepositorio {
    /** Base de datos*/
    private DBStub db;

    /**
     * Construye el repositorio asociandolo a la base de datos indicada.
     *
     * @param db instancia de {@link DBStub} a utilizar como almacén.
     */
    public Repositorio(DBStub db) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**
     * {@inheritDoc}
     */
    public void guardarTarea(ToDo tarea1) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**
     * {@inheritDoc}
     */
    public ToDo encontrarTarea(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**
     * {@inheritDoc}
     */
    public boolean marcarComoCompletada(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**
     * {@inheritDoc}
     */
    public boolean guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    /**
     * {@inheritDoc}
     */
    public List<String> obtenerEmails(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}