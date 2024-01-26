/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_melvinrivas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author l3306
 */
public class Lab2P2_MelvinRivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        ArrayList<Libros> lib = new ArrayList<>(); //arreglo de la clase libros
        ArrayList<Articulo> arti = new ArrayList<>(); //arreglo de la clase articulos
        ArrayList<Cursolinea> curso = new ArrayList<>(); //arreglo de la clase curso en linea
        ArrayList<Confevirtuales> confe = new ArrayList<>(); //arreglo de la clase Conferencia virtuales
        ArrayList<Usuario> user = new ArrayList<>(); // arreglo de la clase usuario
        ArrayList union = new ArrayList(); //Aqui van a ir todo los arreglos juntos 

        int op = 0; // op == opciones
        do {//inicio do while

            System.out.println("***Bienvenidos a nuestro sistema de inventarios***");
            System.out.println("1. Listar recurso");
            System.out.println("2. Crear recurso");
            System.out.println("3. Eliminar recurso");
            System.out.println("5. Salir ");
            System.out.print("Que desea realizar: ");
            op = input.nextInt();

            switch (op) { //inicio switch
                case 1: {// Listar recursos

                    union.clear();
                    union.addAll(lib);
                    union.addAll(arti);
                    union.addAll(curso);
                    union.addAll(confe);
                    System.out.println("------Lista-----");
                    for (int i = 0; i < union.size(); i++) {

                        System.out.println(i + ". " + union.get(i));

                    }
                    break;
                }
                case 2: {// agregar articulo 

                    if (true) {
                        System.out.println("");
                        System.out.println("---Menu de crear---");
                        System.out.println("1. Agregar Libro");
                        System.out.println("2. Agregar Articulo");
                        System.out.println("3. Agregar curso en linea");
                        System.out.println("4. Agregar conferencia virtual");
                        System.out.print("Que desea realizar: ");

                        int op2 = input.nextInt(); //op2 opciones de crear 

                        switch (op2) {
                            case 1: {
                                System.out.print("Ingrese el titulo: ");
                                String titlibro = input.nextLine();
                                titlibro = input.nextLine();
                                System.out.print("Ingrese el autor: ");
                                String aulibro = input.nextLine(); //autor del libro
                                System.out.print("Ingrese genero: ");
                                String genlibro = input.nextLine(); //genero del libro
                                System.out.print("Imgrese fecha de publicacion (dd/MM/yyyy): ");
                                String fechalib = input.nextLine();
                                SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date fecha3 = fecha2.parse(fechalib);
                                boolean disponibilidad = true;

                                Libros libros = new Libros(titlibro, aulibro, genlibro, fecha3, disponibilidad);
                                lib.add(libros);
                                break;
                            }
                            case 2: {
                                System.out.print("Ingrese el titulo: ");
                                String titarti = input.nextLine();
                                titarti = input.nextLine();
                                System.out.print("Ingrese el autor: ");
                                String auarti = input.nextLine(); //autor del libro
                                System.out.print("Ingrese tema: ");
                                String temaarti = input.nextLine(); //genero del libro
                                System.out.print("Imgrese fecha de publicacion (dd/MM/yyyy): ");
                                String fechalib = input.nextLine();
                                SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date fecha3 = fecha2.parse(fechalib);
                                boolean acceso = true;
                                
                                Articulo articulo = new Articulo(titarti,auarti,temaarti,fecha3,acceso);
                                
                                arti.add(articulo);
                                break;
                            }
                            case 3: {
                                System.out.print("Ingrese el titulo: ");
                                String  titcurso = input.nextLine();
                                titcurso = input.nextLine();
                                System.out.print("Ingrese el instructor: ");
                                String instructor = input.nextLine();
                                System.out.print("Ingrese duracion de semanas: ");
                                String duresemanas = input.nextLine();
                                System.out.print("Ingrese la plataforma: ");
                                String plataforma = input.nextLine();
                                
                                Cursolinea cursolinea = new Cursolinea(titcurso,instructor,duresemanas,plataforma);
                                
                                 curso.add(cursolinea);
                                break;
                            }
                            case 4: {
                                System.out.print("Ingrese el titulo: ");
                                String titconfe = input.nextLine();
                                titconfe = input.nextLine();
                                System.out.print("Ingrese nombre del conferencista: ");
                                String conferencista = input.nextLine();
                                System.out.print("Ingrese la fecha: ");
                                String fechalib = input.nextLine();
                                SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date fecha3 = fecha2.parse(fechalib);
                                System.out.print("Ingrese la duracion: ");
                                String fechaconfe = input.nextLine();
                                System.out.print("Ingrese el enlace: ");
                                String enlace = input.nextLine();
                                
                                Confevirtuales confevirtuales = new Confevirtuales(titconfe,conferencista,fecha3,fechaconfe,enlace);
                                
                                confe.add(confevirtuales);
                                break;
                            }
                            default: {
                                System.out.println("---Caracter Invalido---");
                                break;
                            }
                        }
                    }

                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                case 5: {
                    System.out.println("***Gracias por su preferencia, hasta luego***");
                    break;
                }
                default: {
                    System.out.println("---Caracter Invalido---");
                    break;
                }
            } // fin del switch
            System.out.println("");
        } while (op != 5); // fin del do while
    }//fin de main

}//fin de todo
