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
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    
        
    public String imprimir() {
        String get="";
        Nodo reco=raiz;
        while (reco!=null) {
            get+="Usuario:"+reco.User+" Operacion:"+reco.Operacion+" TimeStamp:"+reco.TimeStamp+"\n";
            reco=reco.sig;
        }
        return get;
    }
}
