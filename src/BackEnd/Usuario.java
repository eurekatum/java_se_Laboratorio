/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

/**
 *
 * @author David
 */
public class Usuario {
    //Variables
    private String nombre;
    private String apellido;
    private int edad;
    private char tipo;
    private String usr;
    private String pwd;

    public Usuario(){
        usr = "admin";
        pwd = "123";
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public char getTipo() {
        return tipo;
    }

    public String getUsr() {
        return usr;
    }

    public String getPwd() {
        return pwd;
    }
    
    public void setTipo(int tip){
        switch(tip){
            case 1: this.tipo = 'A';
                    break;
            case 2: this.tipo = 'B';
                    break;
        }
    }
    
}
