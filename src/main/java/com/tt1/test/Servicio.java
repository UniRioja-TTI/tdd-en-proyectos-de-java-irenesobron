package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private final Irepositorio repositorio;
    private final Imailer mailer;

    public Servicio(Irepositorio repositorio, Imailer mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public boolean crearTarea(String nombre, String desc, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");

    }

    public boolean agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");

    }


    public boolean marcarComoCompletada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");

    }


    public List<ToDo> listarTareasPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");

    }

}
