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
public class Confevirtuales {

    private String titulo;
    private String confe; //conferencista
    private Date fecha;
    private String duracion;
    private String enlace; //enlace de acceso

    public Confevirtuales(String titulo, String confe, Date fecha, String duracion, String enlace) {
        this.titulo = titulo;
        this.confe = confe;
        this.fecha = fecha;
        this.duracion = duracion;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConfe() {
        return confe;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConfe(String confe) {
        this.confe = confe;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Confevirtuales: " + "titulo: " + titulo + ", confe: " + confe + ", fecha: " + fecha + ", duracion: " + duracion + ", enlace: " + enlace;
    }

}
