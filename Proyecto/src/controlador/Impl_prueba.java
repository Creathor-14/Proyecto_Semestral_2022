/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author thoma
 */
public class Impl_prueba{
    public boolean login(String usuario,String contraseña){
        //Inicio campos en blanco
        boolean usuarioEnBlanco = usuario.equals("ingrese su correo") || usuario.equals("");
        boolean contraseñaEnBlanco = contraseña.equals("************") || contraseña.equals("");
        if(usuarioEnBlanco && contraseñaEnBlanco){
            throw new NullPointerException("Es nesesario ingresar datos en los campos.");
        }//Fin campos en blanco
        
        if(usuario.indexOf(" ")!=-1){
            throw new NullPointerException("El usuario no debe contener espacios.");
        }
        if(usuario.equals("usuario")){
            if(contraseña.equals("contraseña")){
                return true;//usuario y contraseña correctos
            }else{
                throw new NullPointerException("Contraseña incorrecta.");
            }
        }
        return false;
    }

}
