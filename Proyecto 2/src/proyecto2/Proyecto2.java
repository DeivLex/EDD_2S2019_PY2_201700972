/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.*;

/**
 *
 * @author Davis
 */
public class Proyecto2 {
    public static Pila bitacora = new Pila();
    public static Pila Errores = new Pila();
    public static  Usuario[] Tabla_Hash = new Usuario[7];
    public static Matriz_de_adyacencia Matriz;
    public static int Login=0;
    public static int tamanio_hash = 7;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio v = new Inicio();
        v.show();
        Registrar b = new Registrar();
        for(int i=0; i<7;i++){
        Tabla_hash.add(null);
        }
        String passE=b.sha_256("Admin");
        b.insertar("Admin",passE);
        //----------------------------
        for(int k=0;k<10;k++){
        Tabla_francisco.add(4);
        Tabla_francisco.add(2);
        Tabla_francisco.add(4);
        Tabla_francisco.add(2);
        Tabla_francisco.add(4);
        Tabla_francisco.add(6);
        Tabla_francisco.add(2);
        Tabla_francisco.add(6);
        Tabla_francisco.add(4);
        Tabla_francisco.add(2);
        Tabla_francisco.add(4);
        Tabla_francisco.add(6);
        Tabla_francisco.add(6);
        Tabla_francisco.add(2);
        Tabla_francisco.add(6);
        Tabla_francisco.add(6);
        Tabla_francisco.add(2);
        }
        //-----------------------
    }
    public static ArrayList<Usuario> Tabla_hash= new ArrayList();
    public static ArrayList<Integer> Tabla_francisco = new ArrayList<>();
}
