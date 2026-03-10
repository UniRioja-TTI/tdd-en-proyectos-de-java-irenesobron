package com.tt1.test;

/**
 * Implementación de {@link Imailer} que simula el envío de correos por consola.
 * <p>
 * En lugar de enviar un correo real, imprime por pantalla el destinatario
 * y el mensaje. Se utiliza durante el desarrollo para verificar el comportamiento
 * del sistema sin depender de un servidor de correo real.
 * </p>
 *
 * @author Irene Sobrón
 * @see Imailer
 */
public class MailerStub implements Imailer {
    /** Dirección de correo electrónico del destinatario. */
    private String email;
    /** Contenido del mensaje a enviar. */
    private String mensaje;

    /**
     * Crea un email con los parametros:
     * @param email Cadena que representa la direccion de corre
     * @param mensaje Mensaje que se desea enviar al email
     */
    public MailerStub(String email, String mensaje) {
        this.email = email;
        this.mensaje = mensaje;
    }

    /**
     * {@inheritDoc}
     */
    public boolean enviarCorreo() {
        System.out.println("========================================");
        System.out.println("  Enviando correo:");
        System.out.println("  Para: " + this.email);
        System.out.println("  Mensaje: " + this.mensaje);
        System.out.println("========================================");

        return true;
    }
}
