/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_melvinrivas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author l3306
 */
public class Lab2P2_MelvinRivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                    
                    break;
                }
                case 2: {
                    
                    break;
                }
                case 3: {
                    
                    break;
                }
                case 4: {
                    
                    break;
                }
                case 5: {
                    
                    break;
                }
                default: {
                    
                    break;
                }
            } // fin del switch
            
            
        } while (op != 5); // fin del do while
    }//fin de todo
    
}
