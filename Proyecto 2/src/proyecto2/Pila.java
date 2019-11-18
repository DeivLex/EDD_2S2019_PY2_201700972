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
public class Pila { 
    class Nodo {
        String User;
        String Operacion;
        String TimeStamp;
        Nodo sig;
    }
 
    private Nodo raiz;
    
    public Pila () {
        raiz=null;
    }
    
    public void insertar(String User,String Operacion,String TimeStamp) {
     Nodo nuevo;
        nuevo = new Nodo();
        nuevo.User = User;
        nuevo.Operacion = Operacion;
        nuevo.TimeStamp = TimeStamp;
        
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig=raiz;
            raiz=nuevo;
        }
    }
    
    
        
    public String imprimir() {
        String get=" Pila ↓ ↑ ";
        Nodo reco=raiz;
        while (reco!=null) {
            get+="|Usuario: "+reco.User+"\\nOperacion: "+reco.Operacion+"\\nTimeStamp: "+reco.TimeStamp;
            reco=reco.sig;
        }
        return get;
    }
    public String ImprimirErrores(){
        String get=" Usuarios con errores ";
        Nodo reco=raiz;
        while (reco!=null) {
            get+="|Usuario: "+reco.User+"\\nContraseña: "+reco.Operacion+"\\nError: "+reco.TimeStamp;
            reco=reco.sig;
        }
        return get;
    }
}
