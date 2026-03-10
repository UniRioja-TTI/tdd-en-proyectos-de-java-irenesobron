package com.tt1.test;
/**
 * Las implementaciones de esta interfaz se encargan de enviar
 * un correo electrónico previamente configurado, abstrayendo
 * al {@link Servicio} del mecanismo concreto de envío.
 *
 * @author Irene Sobrón
 */

public interface Imailer {
    /**
     * Envía el correo electrónico configurado en la implementación.
     *
     * @return {@code true} si el correo se envió correctamente,
     *         {@code false} en caso de fallo
     */
    boolean enviarCorreo();
}
