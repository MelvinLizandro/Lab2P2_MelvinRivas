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
public class Articulo {

    private String titulo;
    private String autor;
    private String tema;
    private Date fechpubli;
    private boolean accelinea;

    public Articulo(String titulo, String autor, String tema, Date fechpubli, boolean accelinea) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fechpubli = fechpubli;
        this.accelinea = accelinea;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public Date getFechpubli() {
        return fechpubli;
    }

    public boolean isAccelinea() {
        return accelinea;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setFechpubli(Date fechpubli) {
        this.fechpubli = fechpubli;
    }

    public void setAccelinea(boolean accelinea) {
        this.accelinea = accelinea;
    }

    @Override
    public String toString() {
        return "Articulo: " + "Titulo: " + titulo + ", Autor: " + autor + ", Tema: " + tema + ", Fecha publicacion: " + fechpubli + ", Acceso en linea: " + accelinea;
    }

}
