package com.tt1.test;

public class MailerStub implements Imailer {
    private String email;
    private String mensaje;

    public MailerStub(String email, String mensaje) {
        this.email = email;
        this.mensaje = mensaje;
    }

    public boolean enviarCorreo() {
        System.out.println("========================================");
        System.out.println("  Enviando correo:");
        System.out.println("  Para: " + this.email);
        System.out.println("  Mensaje: " + this.mensaje);
        System.out.println("========================================");

        return true;
    }
}
