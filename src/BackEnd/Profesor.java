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
public class Profesor extends Usuario implements UsuarioValido{

    public Profesor(){
       
    }
    @Override
    public boolean usuarioValido(String usr, String pwd) throws ExcepcionUsuario{
        boolean retorno = false;
        if(usr.isEmpty() || pwd.isEmpty()){
            throw  new ExcepcionUsuario();
        }
        else{
            if(usr.equals(getUsr()) && pwd.equals(getPwd())){ 
                retorno = true; 
            }
        }
        return retorno;
    }
    
    
}
