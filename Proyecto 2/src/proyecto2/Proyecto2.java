/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Davis
 */
public class Proyecto2 {
    public static int Login=0;
    public static int tamanio_hash = 7;
    public static ArrayList<Usuario> Tabla_hash= new ArrayList();
    public static ArrayList<Integer> Tabla_francisco = new ArrayList<>();
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
        String passE=b.sha_256("");
        b.insertar("a",passE);
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
    }
}
