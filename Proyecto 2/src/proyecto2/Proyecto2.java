/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.ArrayList;

/**
 *
 * @author Davis
 */
public class Proyecto2 {
    public static int tamanio_hash = 7;
    public static ArrayList Tabla_hash= new ArrayList();
    public static ArrayList<Integer> Tabla_francisco = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio v = new Inicio();
        v.show();
        Tabla_hash.add(new Usuario("a","",0,""));
        for(int i=0; i<6;i++){
        Tabla_hash.add(null);
        }
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
        //----------------------------
        
    }
    
}
