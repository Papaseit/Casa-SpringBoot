package org.example.pruebaspringboot.Casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Puerta {
    @Autowired
    private Picaporte picaporte;
    @Autowired
    private Marco marco;

    public Puerta(Picaporte picaporte, Marco marco) {
        this.picaporte = picaporte;
        this.marco = marco;
    }

    public Picaporte getPicaporte() {
        return picaporte;
    }

    public void setPicaporte(Picaporte picaporte) {
        this.picaporte = picaporte;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "picaporte=" + picaporte +
                ", marco=" + marco +
                '}';
    }
}
