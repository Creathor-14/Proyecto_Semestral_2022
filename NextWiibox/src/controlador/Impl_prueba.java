package controlador;

import Modelo.Desarrollador;
import Modelo.Usuario;
import Modelo.Vendedor;
import java.util.ArrayList;

public class Impl_prueba{
    
    private ArrayList <Desarrollador> lDesarrollador; 
    private ArrayList <Usuario> lUsuario; 
    private ArrayList <Vendedor> lVendedor; 
    
    public Impl_prueba(){
        lDesarrollador = new ArrayList<>();
        lUsuario = new ArrayList<>();
        lVendedor = new ArrayList<>();
    }
    
    public boolean rutUnico(String rut){
        for(Desarrollador d : lDesarrollador){
            if(d.getRut().equals(rut)){
                return false;
            }
        }
        for(Vendedor v : lVendedor){
            if(v.getRut().equals(rut)){
                return false;
            }
        }
        for(Usuario u : lUsuario){
            if(u.getRut().equals(rut)){
                return false;
            }
        }
        return true;
    }
    public boolean correoUnico(String rut){
        for(Desarrollador d : lDesarrollador){
            if(d.getCorreo().equals(rut)){
                return false;
            }
        }
        for(Vendedor v : lVendedor){
            if(v.getCorreo().equals(rut)){
                return false;
            }
        }
        for(Usuario u : lUsuario){
            if(u.getCorreo().equals(rut)){
                return false;
            }
        }
        return true;
    }
    
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
