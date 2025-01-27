package org.example.pruebaspringboot.Casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Casa {

    @Autowired
    private Habitacion habitacion;

    public Casa(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "habitacion=" + habitacion +
                '}';
    }
}
