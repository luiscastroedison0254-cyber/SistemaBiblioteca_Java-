package com.mycompany.sistemabiblioteca;

public class Controlador {
    private final Biblioteca biblioteca;

    // Constructor que recibe la lógica
    public Controlador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void manejarAgregar(String titulo, String autor) {
        biblioteca.agregarLibro(titulo, autor);
    }

    public void manejarEliminar(String titulo) {
        biblioteca.eliminarLibro(titulo);
    }

    public String manejarListar() {
        return biblioteca.listarLibros();
    }

    public boolean manejarBuscar(String titulo) {
        return biblioteca.buscarLibro(titulo);
    }
}