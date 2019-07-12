/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.logging.Logger;

/**
 *
 * @author Cheverria Paz
 */
public class Principal {
    
    public static void main(String[] args) {
        Deportista deportista1 = new Deportista();
        // Ingreso los datos con los Setter a la nueva instancia de
        // Deportista, estos datos pueden ingresarse desde teclado
        // o a través de una GUI
        deportista1.setNombre("Ever");
        deportista1.setApellido("Paucar");
        deportista1.setCorreo("ever.paucar@epn.edu.ec");
        deportista1.setCategoria("Soccer");
        deportista1.setEdad("29");
        
        System.out.println(deportista1.getNombre());
        System.out.println(deportista1.getApellido());
        System.out.println(deportista1.getCorreo());
        System.out.println(deportista1.getCategoria());
        System.out.println(deportista1.getEdad());
    }
    private final Deportista outer;

    public Principal(final Deportista outer) {
        this.outer = outer;
    }
    private static final Logger LOG = Logger.getLogger(Principal.class.getName());
    
}
