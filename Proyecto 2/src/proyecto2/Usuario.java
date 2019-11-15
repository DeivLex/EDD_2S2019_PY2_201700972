/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.*;
import javax.swing.tree.TreeModel;

/**
 *
 * @author Davis
 */
public class Usuario {
    private String User;
    private String Pass;
    private int Id;
    private String Time;
    private List<List<Matriz_Ad>> Carpetas;
    private TreeModel modelo;

    public Usuario(String User, String Pass, int Id, String Time) {
        this.User = User;
        this.Pass = Pass;
        this.Id = Id;
        this.Time = Time;
    }

    public Usuario(String User, String Pass, int Id, String Time, List<List<Matriz_Ad>> Carpetas) {
        this.User = User;
        this.Pass = Pass;
        this.Id = Id;
        this.Time = Time;
        this.Carpetas = Carpetas;
    }
    
    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }  

    public List<List<Matriz_Ad>> getCarpetas() {
        return Carpetas;
    }

    public void setCarpetas(List<List<Matriz_Ad>> Carpetas) {
        this.Carpetas = Carpetas;
    }

    public TreeModel getModelo() {
        return modelo;
    }

    public void setModelo(TreeModel modelo) {
        this.modelo = modelo;
    }

}
