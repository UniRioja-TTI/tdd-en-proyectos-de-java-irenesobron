package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_MailerStub {
    private MailerStub mailer;
    private String mail = "FFF@gmail.com";
    private String mensaje = "Prueba";

    @BeforeEach
    void setUp() throws Exception {
        mailer = new MailerStub(mail, mensaje);
    }

    @AfterEach
    void tearDown() throws Exception {
        mailer = null;
    }

    @Test
    public void testEnvio() {
        boolean resultado = mailer.enviarCorreo();
        assertTrue(resultado);
    }
}