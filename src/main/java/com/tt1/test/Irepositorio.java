package com.tt1.test;

import java.util.List;

/**
 * Define las operaciones que cualquier implementación de repositorio debe
 * proporcionar: almacenar y recuperar tareas, marcarlas como completadas,
 * y gestionar la lista de direcciones de correo electrónico suscritas.
 *
 */
public interface Irepositorio {
    /**
     * Almacena una nueva tarea en el repositorio.
     *
     * @param tarea tarea a guardar; no debe ser {@code null}
     */
    void guardarTarea(ToDo tarea);
    /**
     * Busca y devuelve una tarea por su nombre.
     *
     * @param nombre nombre identificativo de la tarea a buscar
     * @return la tarea encontrada, o {@code null} si no existe ninguna con ese nombre
     */
    ToDo encontrarTarea(String nombre);
    /**
     * Marca la tarea indicada como completada en el repositorio.
     *
     * @param tarea tarea que se desea marcar como completada
     * @return {@code true} si la operación tuvo éxito, {@code false} en caso contrario
     */
    boolean marcarComoCompletada(ToDo tarea);
    /**
     * Añade una dirección de correo electrónico a la lista de suscriptores.
     *
     * @param email dirección de correo a registrar
     * @return {@code true} si se guardó correctamente, {@code false} en caso contrario
     */
    boolean guardarEmail(String email);
    /**
     * Devuelve la lista de todas las direcciones de correo registradas.
     *
     * @return lista de correos.
     */
    List<String> obtenerEmails();
}
