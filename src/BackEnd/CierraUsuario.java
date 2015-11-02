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
public class CierraUsuario implements Runnable{

    javax.swing.JPanel panelLogin;
    javax.swing.JPanel panelInicio;
    javax.swing.JLabel mensaje;
    public CierraUsuario(javax.swing.JPanel _panelLogin, javax.swing.JPanel _panelInicio){
        panelInicio = _panelInicio;
        panelLogin = _panelLogin;
    }
    public void pasarEtiqueta(javax.swing.JLabel etiqueta){
        mensaje = etiqueta;
    }
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Primero")){
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){ e.printStackTrace(); }
            panelInicio.setVisible(false);
            panelLogin.setVisible(true);
        }else{
            
            for(int i = 10; i >= 0; i--){
                mensaje.setText("Tiempo de espera: " + i + " Seg");
                try{
                Thread.sleep(1000);
                }catch(InterruptedException e){ e.printStackTrace(); }
                
            }
        }        
        
        
        
        
        
    }
    
}
