/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.List;

/**
 *
 * @author Davis
 */
public class Usuario {
    private String User;
    private String Pass;
    private int Id;
    private String Time;

    public Usuario(String User, String Pass, int Id, String Time) {
        this.User = User;
        this.Pass = Pass;
        this.Id = Id;
        this.Time = Time;
    }
    public Usuario(){
    
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
}
