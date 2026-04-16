package com.mycompany.sistemabiblioteca;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        // 1. Creamos la lógica (El Modelo)
        Biblioteca miBiblioteca = new Biblioteca();
     
        // 2. Creamos el cerebro (El Controlador)
        Controlador control = new Controlador(miBiblioteca);
        
        // 3. Creamos la ventana (La Vista) y le pasamos el controlador
        // Nota: Asegúrate de crear el JFrame con este nombre
        VistaBiblioteca ventana = new VistaBiblioteca(control);
        
        // 4. Hacemos que la ventana sea visible
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null); // Para que salga al centro
    }
}