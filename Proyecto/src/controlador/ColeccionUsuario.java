package controlador;

import Modelo.Usuario;
import java.util.ArrayList;


public class ColeccionUsuario {
    ArrayList <Usuario> lista;

    public ColeccionUsuario() {
        this.lista = new ArrayList <>();
    }
    
    
    public boolean rutUnico(String rut){
        for(Usuario u : lista){
            if(u.getRut().equals(rut)){
                return false;
            }
        }
        return true;
    }
    public boolean correoUnico(String correo){
        for(Usuario u : lista){
            if(u.getRut().equals(correo)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Agrega un usuario a la coleccion, estos tienen un rut y correo unico.
     * @param fechaN
     * @param comuna
     * @param telefono
     * @param rut
     * @param nombre
     * @param direccion
     * @param correo 
     */
    public void agregar(String fechaN, String comuna, String telefono, String rut, String nombre, String direccion, String correo){
        if(rutUnico(rut)){
            throw new NullPointerException("Este rut ya existe en el sistema.");
        }
        if(correoUnico(correo)){
            throw new NullPointerException("Este correo ya existe en el sistema.");
        }
        this.lista.add(new Usuario(fechaN, comuna, telefono, rut, nombre, direccion, correo));
    }
    
    /**
     * Busca un usuario por su rut, y retorna la posicion en la que se encuentra.
     * @param rut
     * @return 
     */
    public int existeUsuario(String rut){
        int cont=0;
        for(Usuario u : lista){
            if(u.getRut().equals(rut)){
                return cont;
            }
            cont++;
        }
        throw new NullPointerException("Usuario no encontrado.");
    }
    
    /**
     * Esta funcion esta encargada de actualizar los datos de un usuario en una posicion dada.
     * @param posicion
     * @param fono
     * @param nombre
     * @param direccion 
     */
    public void actualizar(int posicion, String fechaN, String comuna, String telefono, String nombre, String direccion){
        Usuario u = lista.get(posicion);
        u.setFechaN(fechaN);
        u.setComuna(comuna);
        u.setTelefono(telefono);
        u.setNombre(nombre);
        u.setDireccion(direccion);
    }
    
    /**
     * Busca un usuario por su rut y si existe lo elimina.
     * @param rut 
     */
    public void eliminar(String rut){
        try{
            int posicion = existeUsuario(rut);
            lista.remove(posicion);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    }
}
