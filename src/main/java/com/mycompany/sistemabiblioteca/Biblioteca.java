package com.mycompany.sistemabiblioteca;

import java.sql.*;

public class Biblioteca {

    // Método para ALTA (Pista 1: INSERT)
    public void agregarLibro(String titulo, String autor) {
        String sql = "INSERT INTO libros (titulo, autor) VALUES (?, ?)";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            pstmt.setString(1, titulo);
            pstmt.setString(2, autor);
            pstmt.executeUpdate();
            System.out.println("¡Libro guardado con éxito!");
            
        } catch (SQLException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    // Método para ELIMINAR (Pista 3: DELETE y Pista 4: WHERE)
    public void eliminarLibro(String titulo) {
        String sql = "DELETE FROM libros WHERE titulo = ?";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            pstmt.setString(1, titulo);
            int filas = pstmt.executeUpdate();
            
            if (filas > 0) {
                System.out.println("Libro eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún libro con ese título.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }// Método para LISTAR (Pista 2: SELECT)
    }public String listarLibros(){
        StringBuilder lista = new StringBuilder();
        String sql = "SELECT * FROM libros";
        
        try (Connection con = Conexion.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                lista.append("ID: ").append(rs.getInt("id"))
                     .append(" | Título: ").append(rs.getString("titulo"))
                     .append(" | Autor: ").append(rs.getString("autor")).append("\n");
            }
        } catch (SQLException e) {
            return "Error al listar: " + e.getMessage();
        }
        return lista.toString();
    }

    // Método para BUSCAR (Pista 4: WHERE)
    public boolean buscarLibro(String titulo) {
        String sql = "SELECT * FROM libros WHERE titulo = ?";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            pstmt.setString(1, titulo);
            ResultSet rs = pstmt.executeQuery();
            return rs.next(); 
            
        } catch (SQLException e) {
            System.out.println("Error al buscar: " + e.getMessage());
            return false;
        }
    }
    }
