/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_melvinrivas;

import java.util.Date;

/**
 *
 * @author l3306
 */
public class Libros {

    private String titulo;
    private String autor;
    private String genero;
    private Date añopubli;
    private boolean disponibilidad;

    public Libros(String titulo, String autor, String genero, Date añopubli, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añopubli = añopubli;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public Date getAñopubli() {
        return añopubli;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAñopubli(Date añopubli) {
        this.añopubli = añopubli;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libros: " + "titulo: " + titulo + ", autor: " + autor + ", genero: " + genero + ", a\u00f1opubli: " + añopubli + ", disponibilidad: " + disponibilidad;
    }

}
