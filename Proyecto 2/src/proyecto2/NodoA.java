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
    int idd=1;
    int balance;
    int rotacion;
    int altura;
    NodoA izquierda;
    NodoA derecha;
    NodoA AsociacionABB;//este es el apuntador para asociar el Nodo del Arbl AVL "noticia" con el Arbol de "complementos" ABB
    ////////////////////VARIABLES DE INFORMACION/////////////////////////
    String Titulo,Descripcion,Path,Time,Propietario;
    NodoA(){
        balance=0;
        rotacion=0;
        altura=0;
        izquierda=null;
        derecha=null;
        AsociacionABB=null;
        Titulo="";
        Descripcion="";
        Path="";
        Time="";
        Propietario="";
    }
    public void Cambiar_Balance(int balance){
        this.balance=balance;
    }
    public void Cambiar_izquierda(NodoA izquierda){
        this.izquierda=izquierda;
    }
    public void Cambiar_altura(int altura){
    this.altura=altura;
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
        public void Cambiar_Time(String Time){
        this.Time=Time;
    }
        public void Cambiar_Propietario(String Propietario){
        this.Propietario=Propietario;
    }
    public String getCodigoGraphviz() {
    return "digraph grafica{\n" +
               "rankdir=TB;\n" +
               "node [shape = record, style=filled, fillcolor=seashell2];\n"+
                getCodigoInterno()+
                "}\n";
    }
    public String getCodigoInterno() {
        
        String etiqueta;
        if(izquierda==null && derecha==null){
            etiqueta="nodo"+idd+" [ label =\"Nombre:"+Titulo+"\\nContenido:"+Descripcion+"\\nAltura:"+altura+"\\nFE:"+balance+"\\nTimestamp:"+Time+"\\nPropietario:"+Propietario+"\"];\n";
        }else{
            etiqueta="nodo"+idd+" [ label =\"<C0>|"+Titulo+"\\nContenido:"+Descripcion+"\\nAltura:"+altura+"\\nFE:"+balance+"\\nTimestamp:"+Time+"\\nPropietario:"+Propietario+"|<C1>\"];\n";
        }
        if(izquierda!=null){  
            etiqueta=etiqueta + izquierda.getCodigoInterno() +
               "nodo"+idd+":C0->nodo"+izquierda.idd+"\n";
        }
        if(derecha!=null){
            etiqueta=etiqueta + derecha.getCodigoInterno() +
               "nodo"+idd+":C1->nodo"+derecha.idd+"\n";                    
        }
        return etiqueta;
    }
}
