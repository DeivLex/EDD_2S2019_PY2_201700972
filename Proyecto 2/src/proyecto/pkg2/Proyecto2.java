/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Davis
 */
public class Proyecto2 {
    public static int tamanio_hash = 7;
    public static String[] Tabla_hash = new String[tamanio_hash];

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Inicio v = new Inicio();
        v.show();
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(null);
        a.add(7,"Hola");
        for (int i=0; i<a.size();i++){
        System.out.println(a.get(i));
        }
        // TODO code application logic here
    }
    
}
