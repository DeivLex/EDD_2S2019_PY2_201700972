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
public class Matriz_de_adyacencia {
    private int n;
    private int[][] matriz;
    
    /**
     * Constructor de clase
     * @param n numero de nodos
     */
    public Matriz_de_adyacencia(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        //se inicializa matriz en 0
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }            
        }
    }
    
    public void agregar(int i, int j){
        matriz[i][j] += 1;
    }
    
    public void remover(int i, int j){
        if(matriz[i][j]>0)
            matriz[i][j] -= 1;
    }
    
    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
    }
}
