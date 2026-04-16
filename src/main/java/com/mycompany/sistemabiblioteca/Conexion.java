package com.mycompany.sistemabiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Datos para conectar con XAMPP
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error: ¿Ya iniciaste MySQL en XAMPP? " + e.getMessage());
            return null;
        }
    }
}