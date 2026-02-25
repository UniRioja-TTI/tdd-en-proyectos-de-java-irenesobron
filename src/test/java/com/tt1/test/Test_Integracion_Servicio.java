package com.tt1.test;

import Mocks_para_test.MockRepositorio;
import Mocks_para_test.Mockmailer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Integracion_Servicio {
    private Servicio servicio;
    private MailerStub mailer;
    private Repositorio repositorio;
    private DBStub db;

    @BeforeEach
    public void setUp() {
        repositorio = new Repositorio(db);
        mailer = new MailerStub("Pedro@gmail", "dfsdfdsf");
        servicio = new Servicio(repositorio, mailer);
    }

    @AfterEach
    public void tearDown() {
        servicio = null;
        repositorio = null;
        mailer = null;
    }

    @Test
    public void testCrearTodoValido() {
        String nombre = "Estudiar para el examen";
        LocalDate fechaLimite = LocalDate.of(12,12,3);

        boolean resultado = servicio.crearTarea(nombre, "FFFF", fechaLimite);
        assertTrue(resultado);
    }

    @Test
    public void testCrearTodoSeGuardaEnElRepositorio() {
        String nombre = "Estudiar para el examen";
        LocalDate fechaLimite = LocalDate.of(12,12,3);

        boolean resultado = servicio.crearTarea(nombre, "FFFF", fechaLimite);

        assertNotNull(repositorio.encontrarTarea("Estudiar para el examen"));
    }

    @Test
    public void testAnadirEmailValido() {
        boolean resultado = servicio.agregarEmail("usuario@ejemplo.com");
        assertTrue(resultado);
    }

    @Test
    public void testAnadirEmailSeGuardaEnElRepositorio() {
        servicio.agregarEmail("usuario@ejemplo.com");

        assertEquals("usuario@ejemplo.com", repositorio.obtenerEmails().get(0));
    }
}
