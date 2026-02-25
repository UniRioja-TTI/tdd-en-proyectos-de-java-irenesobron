package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

class Test_DBStub {
    private DBStub db;
    private ToDo tarea1;

	@BeforeEach
	void setUp() throws Exception {
        db = new DBStub();
        tarea1 = new ToDo("Estudiar Java", "Repasar Java", LocalDate.of(2026, 11, 2), false);
	}

	@AfterEach
	void tearDown() throws Exception {
        db = null;
	}

	@Test
    void testCrearTarea() {
        db.crearTarea(tarea1);

        List<ToDo> todas = db.obtenerTareas();
        assertEquals(1, todas.size());
        assertEquals("Estudiar Java", todas.get(0).getNombre());
    }

    @Test
    void testBuscaTareaporNombre() {
        db.crearTarea(tarea1);

        ToDo esta = db.buscarTarea("EstudiarJava");
        assertEquals("Estudiar Java", esta.getNombre());
    }
    @Test
    public void testActualizarTarea() {
        db.crearTarea(tarea1);
        tarea1.setCompletado(true);

        boolean actualizado = db.actualizarTarea(tarea1);

        assertTrue(actualizado);
        ToDo resultado = db.buscarTarea("Estudiar Java");
        assertTrue(resultado.isCompletado());
    }

    @Test
    public void testEliminarTarea() {
        db.crearTarea(tarea1);
        boolean eliminado = db.delete("Estudiar Java");

        assertTrue(eliminado);
        assertEquals(0, db.obtenerTareas().size());
    }

    @Test
    public void testAgregarEmail() {
        db.agregarEmail("usuario@ejemplo.com");

        List<String> emails = db.obtenerEmails();
        assertEquals(1, emails.size());
        assertEquals("usuario@ejemplo.com", emails.get(0));
    }

    @Test
    public void testAgregarEmailDuplicadoNoSeGuarda() {
        db.agregarEmail("usuario@ejemplo.com");
        db.agregarEmail("usuario@ejemplo.com");

        assertEquals(1, db.obtenerEmails().size());
    }

    @Test
    public void testEliminarEmail() {
        db.agregarEmail("usuario@ejemplo.com");

        boolean eliminado = db.eliminarEmail("usuario@ejemplo.com");

        assertTrue(eliminado);
        assertEquals(0, db.obtenerEmails().size());
    }

}
