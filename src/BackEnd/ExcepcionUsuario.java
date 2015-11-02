/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BackEnd;

/**
 *
 * @author Usuario
 */
public class ExcepcionUsuario extends Exception{
    @Override
    public String getMessage(){
        return "Un campo de entrada está vacio"; 
    }
}
