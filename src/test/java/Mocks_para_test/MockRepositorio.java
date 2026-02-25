package Mocks_para_test;

import com.tt1.test.Irepositorio;
import com.tt1.test.ToDo;

import java.util.List;
import java.util.ArrayList;

public class MockRepositorio implements Irepositorio {
    private static final List<ToDo> tareas = new ArrayList<>();
    private final List<String> emails = new ArrayList<>();

    @Override
    public void guardarTarea(ToDo tarea) {
        tareas.add(tarea);
    }

    public ToDo encontrarTarea(String nombre) {
        for(ToDo d: tareas){
            if(d.getNombre() == nombre){
                return d;
            }
        }
        return null;
    }

    @Override
    public boolean marcarComoCompletada(ToDo tarea) {
        ToDo encontrada = encontrarTarea(tarea.getNombre());
        if (encontrada != null) {
            encontrada.setCompletado(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean guardarEmail(String email) {
        if (emails.contains(email)) {
            return false;
        }
        emails.add(email);
        return true;
    }

    @Override
    public List<String> obtenerEmails() {
        return new ArrayList<>(emails); // copia defensiva
    }
}
