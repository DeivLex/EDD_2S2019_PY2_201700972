/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Davis
 */
public class Matriz_Ad {
    private String Padre;
    private String Nombre;
    private Arbol avl;

    public Matriz_Ad(String Nombre, Arbol avl) {
        this.Nombre = Nombre;
        this.avl = avl;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Arbol getAvl() {
        return avl;
    }

    public void setAvl(Arbol avl) {
        this.avl = avl;
    }

    public String getPadre() {
        return Padre;
    }

    public void setPadre(String Padre) {
        this.Padre = Padre;
    }
}
