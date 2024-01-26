/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class Cursolinea {

    private String titulo;
    private String instructor;
    private String duresemanas;
    private String plataforma; //plataforma en la que enseña

    public Cursolinea(String titulo, String instructor, String duresemanas, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duresemanas = duresemanas;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getDuresemanas() {
        return duresemanas;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDuresemanas(String duresemanas) {
        this.duresemanas = duresemanas;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Curso en linea: " + "Titulo: " + titulo + ", Instructor: " + instructor + ", Duracion: " + duresemanas + ", Plataforma: " + plataforma;
    }

}
