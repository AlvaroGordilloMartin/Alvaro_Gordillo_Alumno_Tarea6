package com.example.alvaro_gordillo_alumno_tarea6.model;

import android.os.Build;
import android.text.Editable;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class Torneo {
    private String nombre;
    private String organizador;

    public Torneo(String nombre, String organizador) {
        this.nombre = nombre;
        this.organizador = organizador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Torneo torneo = (Torneo) o;
        return nombre.equals(torneo.nombre) &&
                organizador.equals(torneo.organizador);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(nombre, organizador);
    }

    @Override
    public String toString() {
        return "Torneo{" +
                "nombre='" + nombre + '\'' +
                ", organizador='" + organizador + '\'' +
                '}';
    }
}
