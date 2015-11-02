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
public interface UsuarioValido {
    public boolean usuarioValido(String usr, String pwd) throws Exception;
}
