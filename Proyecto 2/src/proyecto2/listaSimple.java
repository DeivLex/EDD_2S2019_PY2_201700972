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
public class listaSimple {
    class Nodo{
    private int elemento;
    private Nodo siguiente;

public Nodo (int elem, Nodo sig){
    elemento = elem;
    siguiente = sig;
}
public int getElemento(){
    return elemento;
}
public Nodo getSig(){
    return siguiente;
}
public void setElemento(int elem){
    elemento = elem;
}
public void setSig(Nodo sig){
    siguiente = sig;
}   
}
    private Nodo primero;
    private int numElem; 
public listaSimple(){ 
    primero = null;
    numElem = 0;
}

public void insertarPrimero (int elemento){
    Nodo nuevo = new Nodo (elemento, primero);
    primero = nuevo;
    numElem++;
}

public void insertarFinal (int elemento){ 
    Nodo nuevo = new Nodo(elemento, null);
    if (primero == null){
    primero = nuevo;
    }
    else {
        Nodo actual = primero;
        while (actual.getSig()!= null){
            actual = actual.getSig();
            
        }
        actual.setSig(nuevo);
        numElem++;
    }
System.out.println("Final");
}
public void borrar (int elem){
    if (primero == null) 
        System.out.println("lista vacía");
    else
        if (primero.getElemento()== elem){
        primero = primero.getSig();
        numElem--;
        }
        else {
            Nodo actual = primero;
            while (actual.getSig()!=null && actual.getSig().getElemento() != elem)
                actual = actual.getSig();
                if (actual.getSig()== null )
                    System.out.println ("elemento "+elem+" no esta en la lista");
                else{
                    actual.setSig(actual.getSig().getSig());
                    numElem--;
                }
        }
} 
public void listar(){
    
    Nodo actual = primero;
    while (actual.getSig()!= null){
        System.out.println(actual.getElemento());
        actual = actual.getSig();
    
    }
    System.out.println(actual.getElemento());
}
    
}
