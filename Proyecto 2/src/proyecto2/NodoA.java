/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author beto
 */
public class NodoA {
    ////////////////////VARIABLES MANEJO//////////////////////////////// 
    int llave;
    int balance;
    int rotacion;
    NodoA izquierda;
    NodoA derecha;
    NodoA AsociacionABB;//este es el apuntador para asociar el Nodo del Arbl AVL "noticia" con el Arbol de "complementos" ABB
    ////////////////////VARIABLES DE INFORMACION/////////////////////////
    String Titulo,Descripcion,Path;
    NodoA(){
        llave=0;
        balance=0;
        rotacion=0;
        izquierda=null;
        derecha=null;
        AsociacionABB=null;
        Titulo="";
        Descripcion="";
        Path="";
    }
    public void Cambiar_Balance(int balance){
        this.balance=balance;
    }
    public void Cambiar_llave(int llave){
        this.llave=llave;
    }
    public void Cambiar_izquierda(NodoA izquierda){
        this.izquierda=izquierda;
    }
    public void Cambiar_derecha(NodoA derecha){
        this.derecha=derecha;
    }
     public void Cambiar_Titulo(String Titulo){
        this.Titulo=Titulo;
    }
      public void Cambiar_Descripcion(String Descripcion){
        this.Descripcion=Descripcion;
    }
       public void Cambiar_Path(String Path){
        this.Path=Path;
    }
        public void Cambiar_AsociacionABB(NodoA AsociacionABB){
        this.AsociacionABB=AsociacionABB;
    }
}