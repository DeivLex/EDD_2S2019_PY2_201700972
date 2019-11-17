/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

/**
 *
 * @author beto
 */
public class Arbol {
    int ingresados=0;
    private NodoA raiz;
    private NodoA Aux;
    private boolean rotacion=false;
    private boolean aumento=false;
    private boolean borrado=false;
    private boolean apuntado=false;
    private boolean apuntado2=false;
    private boolean buscar=false;
    private int UltimaPosicionCadenaInterna=0;//para la comparacion de cadenas
    private boolean CadenaAceptada=false; // para la comparacion de cadenas
    private LinkedList<NodoA> Lista = new LinkedList<NodoA>();
     private LinkedList<String> grafica = new LinkedList<String>();
    private NodoA Busqueda;
    private NodoA nuevaRaiz;
    public void insertar(String Titulo,String Descripcion,String Time,String Propietario){
        ingresados++;
        insertar(Titulo,Descripcion,Time,Propietario,raiz);
    }
    private NodoA insertar(String Titulo,String Descripcion,String Time,String Propietario,NodoA A){
        if(A==null){
            A = new NodoA();
            if(raiz==null){
            raiz = A;
            }
            A.idd=ingresados+1;
            A.Cambiar_Balance(0);
            A.Cambiar_Titulo(Titulo);
            A.Cambiar_Descripcion(Descripcion);
            A.Cambiar_Time(Time);
            A.Cambiar_Propietario(Propietario);
            return A;
        }
        else{
            if(Titulo.compareTo(A.Titulo)<0)
            {
                if(A.izquierda==null){
                    A.balance--;
                    aumento = (A.balance!=0);
                     A.izquierda=insertar(Titulo,Descripcion,Time,Propietario,A.izquierda);
                }
                else
                {
                    insertar(Titulo,Descripcion,Time,Propietario,A.izquierda);
                    if(aumento){
                        if(rotacion!=true){  
                            A.balance--;
                            aumento=(A.balance!=0);
                        }
                    }
                    if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                    {
                        A.izquierda=nuevaRaiz;
                        nuevaRaiz=null;
                        rotacion=false;
                    } 
                    if(A.balance<-1)
                    {
                      if(A.izquierda.balance>0)
                      {
                          if(raiz.hashCode()!=A.hashCode()){ID(A);aumento=false;return null;}
                          else{raiz=ID(A);aumento=false;rotacion=false;return null;}
                          
                      }
                      else
                      {
                          if(raiz.hashCode()!=A.hashCode()){II(A);aumento=false;return null;}
                          else{raiz=II(A);aumento=false;rotacion=false;return null;}
                          
                      }
                  }
               }
            }
            else
            {
                if(A.derecha==null)
                {
                    A.balance++;
                    aumento = (A.balance!=0);
                    A.derecha=insertar(Titulo,Descripcion,Time,Propietario,A.derecha);
                }
                else
                {
                    insertar(Titulo,Descripcion,Time,Propietario,A.derecha);
                    if(aumento){
                        if(rotacion!=true){
                            A.balance++;
                            aumento=(A.balance!=0);
                        }
                    }
                    if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                    {
                        A.derecha=nuevaRaiz;
                        nuevaRaiz=null;
                        rotacion=false;
                    }
                   if(A.balance>1)
                   {
                       if(A.derecha.balance<0)
                       {
                           if(raiz.hashCode()!=A.hashCode()){DI(A);aumento=false;return null;}
                           else{raiz=DI(A);aumento=false;rotacion=false;return null;}
                       }
                       else
                       {
                           if(raiz.hashCode()!=A.hashCode()){DD(A);aumento=false;return null;}
                                else{raiz=DD(A);aumento=false;rotacion=false;return null;}
                       }
                   }
                }
            }
        }
        return null;
    }
    public NodoA RetornarRaiz(){
        return raiz;
    }
    // rotaciones
    //rotacion izquierda izquierda
    private NodoA II(NodoA A){
        rotacion=true;
        NodoA aux = A.izquierda.derecha;
        A.izquierda.derecha=A;
        if(aux==null){
           if(A.derecha!=null)A.izquierda.balance++;
           if(A.derecha==null)A.izquierda.balance=0;
        }
        else{
           if(A.derecha!=null)A.izquierda.balance=0;
           if(A.derecha==null)A.izquierda.balance++;
               }
       
        NodoA aux2 = A.izquierda;
        A.izquierda=aux;
        if(aux==null){
            if(A.derecha!=null)A.balance++;
            if(A.derecha==null)A.balance=0;
        }
        else{
            if(A.derecha!=null)A.balance=0;
            if(A.derecha==null)A.balance--;
           }
         nuevaRaiz=aux2;
         aux2.rotacion=10;
        return aux2;
    }
    //rotacion derecha derecha
    private NodoA DD(NodoA A){
        rotacion=true;
        NodoA aux = A.derecha.izquierda;
        A.derecha.izquierda = A;
        if(aux==null){
            if(A.izquierda!=null)A.derecha.balance--;
            if(A.izquierda==null)A.derecha.balance=0;}
        else{
            if(A.izquierda!=null)A.derecha.balance=0;
            if(A.izquierda==null)A.derecha.balance--;
            
        }
      
        NodoA aux2 = A.derecha;
        A.derecha = aux;
        if(aux==null){
            if(A.izquierda!=null)A.balance--;
            if(A.izquierda==null)A.balance=0;
        }
        else{
          if(A.izquierda!=null)A.balance=0; 
          if(A.izquierda==null)A.balance++;
            
            /*else{
                A.balance=1;
            }*/
        }
        
        nuevaRaiz=aux2;
        aux2.rotacion=11;
        return aux2;
        
        
    }
    //rotacion izquierda derecha
    private NodoA ID(NodoA A){
      A.izquierda=DD(A.izquierda);
        return II(A);
    }
    //rotacion derecha izquierda
    private NodoA DI(NodoA A){
        A.derecha=II(A.derecha);
        return DD(A);
    }
    //buscar
    public NodoA Buscar(String Titulo){//buscar por llave
        return Buscar(Titulo,raiz);
    } //busqueda por llave
    /*public LinkedList<NodoA> Buscar(String Titulo){
        Lista.clear();
        return Buscar(Titulo,raiz);
    }
    private LinkedList<NodoA> Buscar(String Titulo,NodoA A){
        if(A!=null){
        if(ComparacionCadenas(Titulo,A.Titulo,0,0)==true){
            Lista.add(A);
            this.CadenaAceptada=false;
            this.UltimaPosicionCadenaInterna=0;
        }
        Buscar(Titulo,A.izquierda);
        Buscar(Titulo,A.derecha);
        }
        return Lista;
    }*/
    private boolean ComparacionCadenas(String CadenaIngresada,String CadenaInterna,int Ingresada,int Interna ){
        String posicion = CadenaIngresada.substring(Ingresada, Ingresada+1);
        if(posicion.equalsIgnoreCase(CadenaInterna.substring(Interna, Interna+1))){
            if(Ingresada==0)UltimaPosicionCadenaInterna=Interna;
            if(Ingresada<CadenaIngresada.length()-1){
                if(Interna<CadenaInterna.length()-1){
                    ComparacionCadenas(CadenaIngresada,CadenaInterna,Ingresada+1,Interna+1);
                }
            }else CadenaAceptada=true;
        }else{
            if(Ingresada==0){
              if(Interna<CadenaInterna.length()-1)
                ComparacionCadenas(CadenaIngresada,CadenaInterna,0,Interna+1); 
            }
            else{
            if(UltimaPosicionCadenaInterna<CadenaInterna.length()-1)
            ComparacionCadenas(CadenaIngresada,CadenaInterna,0,this.UltimaPosicionCadenaInterna+1);
            }
        }
        return CadenaAceptada;
    }
    private NodoA Buscar(String Titulo,NodoA A){//busqueda interna por llave
        if(A!=null){
        if(Titulo.compareTo(A.Titulo)<0){
          Buscar(Titulo,A.izquierda);
         
      }
      else{
          if(Titulo.compareTo(A.Titulo)>0){
            Buscar(Titulo,A.derecha);
          }
          else{
              this.Busqueda=A;
              }
      }
        }else{
            Busqueda=null;}
      return Busqueda;
       
    }//busque interna por llave
    public void eliminar(String llave){
        eliminar(llave,raiz);
    }
    private void eliminar(String llave,NodoA A){
        if(raiz.izquierda!=null || raiz.derecha!=null){
        if(A!=null){
            if(A.Titulo.compareTo(llave)<0){
                eliminar(llave,A.derecha);
                if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                {
                    A.izquierda=nuevaRaiz;
                    nuevaRaiz=null;
                }
                if(borrado==true){
                    A.balance--;
                    rotarBorrado(A);
                    borrado=(A.balance==0);
                }
                if(apuntado==true){
                    A.derecha=Aux;
                    apuntado=false;
                }
            }else{
                if(A.Titulo.compareTo(llave)>0){
                    eliminar(llave,A.izquierda);
                    if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
                    {
                        A.izquierda=nuevaRaiz;
                        nuevaRaiz=null;
                    }
                    if(borrado==true){
                        A.balance++;
                        rotarBorrado(A);
                        borrado=(A.balance==0);
                    }
                    if(apuntado==true){
                        A.izquierda=Aux;
                        apuntado=false;
                    }
                }else{
                    if(A.Titulo.equalsIgnoreCase(llave)){
                        borrado=true;
                        apuntado=true;
                        if(A.izquierda == null){
                            Aux = A.derecha;
                        }else{
                            if(A.derecha == null){
                                Aux = A.izquierda;
                            }else{
                                Aux=Reemplazar(A,A,true);                   
                            }
                        }  
                    }
                }
           }
       }
        }
        else{
           raiz=null; 
        }
    }
    private NodoA Aux2;
    private NodoA Reemplazar(NodoA A,NodoA buscado,boolean estado){
     if(estado==true){
         Reemplazar(A.izquierda,buscado,false);
         if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
         {
           A.izquierda=nuevaRaiz;
           nuevaRaiz=null;
         }
         if(buscado.hashCode()==raiz.hashCode()){
              raiz=Aux2;
         }
         if(Aux2.hashCode()!=buscado.izquierda.hashCode()){
            Aux2.izquierda=buscado.izquierda; buscado.izquierda=null;
         }else{buscado.izquierda=null;}
         Aux2.derecha = buscado.derecha;   buscado.derecha=null;
         if(borrado==true){
             Aux2.balance++;
             rotarBorrado(Aux2);
             borrado=(Aux2.balance==0);
         }
     }else{
        if(A.derecha==null){
            Aux2=A;
            borrado=true;
            apuntado2=true;
        }else{ 
            Reemplazar(A.derecha,buscado,estado);
            if(nuevaRaiz!=null && nuevaRaiz.hashCode()!=raiz.hashCode())
            {
                A.derecha=nuevaRaiz;
                nuevaRaiz=null;
            } 
            if(apuntado2==true){
                A.derecha=Aux2.izquierda;
                apuntado2=false;
            }
            if(borrado==true){
                A.balance--;
                rotarBorrado(A);
                borrado=(A.balance==0);
            }
      }
     }
      //if(A.derecha!=null)Aux2=null;
      return Aux2;
     }
    private boolean rotarBorrado(NodoA A){
        if(A.balance<-1)
        {
                      if(A.izquierda.balance>0)
                      {
                          if(raiz.hashCode()!=A.hashCode()){ID(A);borrado=false;return true;}
                          else{raiz=ID(A);borrado=false;return true;}
                          
                      }
                      else
                      {
                          if(raiz.hashCode()!=A.hashCode()){II(A);borrado=false;return true;}
                          else{raiz=II(A);borrado=false;return true;}
                          
                      }
         }
        else{
             if(A.balance>1)
                   {
                       if(A.derecha.balance<0)
                       {
                           if(raiz.hashCode()!=A.hashCode()){DI(A);borrado=false;return true;}
                           else{raiz=DI(A);borrado=false;return true;}
                       }
                       else
                       {
                           if(raiz.hashCode()!=A.hashCode()){DD(A);borrado=false;return true;}
                                else{raiz=DD(A);aumento=false;borrado=false;return true;}
                       }
                   }
        }
        return false;
    }
    public LinkedList<String> graficar(){
        grafica.clear();
        raiz.altura=AlturaArbol(ingresados);
        return graficar(raiz);
    }
    private LinkedList<String> graficar(NodoA A){
        if(A!=null){
            if(A.izquierda!=null){
                A.izquierda.altura=A.altura-1;
                grafica.add(A.Titulo+" FE:"+A.balance+" Altura:"+A.altura+" izquierda "+A.izquierda.Titulo+" FE:"+A.izquierda.balance+" Altura:"+A.izquierda.altura);
            }
            if(A.derecha!=null){
                A.derecha.altura=A.altura-1;
                grafica.add(A.Titulo+" FE:"+A.balance+" Altura:"+A.altura+" derecha "+A.derecha.Titulo+" FE:"+A.derecha.balance+" Altura:"+A.derecha.altura);
            }
            graficar(A.izquierda);
            graficar(A.derecha);
        }
        return grafica;
    }
    public int AlturaArbol(int a){
    for(int i=0;i<a;i++){
    int k=(int)Math.pow(2, i);
    if(a<(k)){
    return i-1;
    }
    }
    return -1;
    }
    public void ReporteArbol(){
        graficar();
        try {
            String contenido= raiz.getCodigoGraphviz();
            String ruta = "..\\REPORTES\\Arbol.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
