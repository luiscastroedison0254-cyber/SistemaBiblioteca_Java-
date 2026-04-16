package com.mycompany.sistemabiblioteca;

public class Libro {
    // Atributos según el UML (el "-" significa private)
    private final String titulo;
    private final String autor;

    // Constructor (el "+" significa public)
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos (el "+" significa public)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}