package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.time.LocalDate;

class Test_Repositorio {
    private Repositorio repositorio;
    private DBStub db;
    private ToDo tareaEjemplo;

    @BeforeEach
    public void setUp() {
        db = new DBStub();
        repositorio = new Repositorio(db);
        tareaEjemplo = new ToDo("Tarea de prueba", "Descripción", LocalDate.of(2025, 10, 15), false);
    }

    @AfterEach
    public void tearDown() {
        repositorio = null;
        db = null;
        tareaEjemplo = null;
    }

    @Test
    public void testGuardarYEncontrarTarea() {
        repositorio.guardarTarea(tareaEjemplo);
        ToDo resultado = repositorio.encontrarTarea("Tarea de prueba");

        assertNotNull(resultado);
        assertEquals("Tarea de prueba", resultado.getNombre());
    }

    @Test
    public void testMarcarComoCompletadaExistente() {
        repositorio.guardarTarea(tareaEjemplo);

        boolean resultado = repositorio.marcarComoCompletada(tareaEjemplo);

        // Assert
        assertTrue(resultado);
        ToDo tarea = repositorio.encontrarTarea("Tarea de prueba");
        assertTrue(tarea.isCompletado());
    }

    @Test
    public void testGuardarEmail() {
        repositorio.guardarEmail("correo@test.com");

        List<String> emails = repositorio.obtenerEmails();
        assertEquals(1, emails.size());
        assertEquals("correo@test.com", emails.get(0));
    }
}
