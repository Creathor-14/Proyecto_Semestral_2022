package controlador;

import Modelo.Desarrollador;
import java.util.ArrayList;


public class ColeccionDesarrollador {
    ArrayList <Desarrollador> lista;

    public ColeccionDesarrollador() {
        this.lista = new ArrayList <>();
    }
    
    public boolean rutUnico(String rut){
        for(Desarrollador d : lista){
            if(d.getRut().equals(rut)){
                return false;
            }
        }
        return true;
    }
    public boolean correoUnico(String correo){
        for(Desarrollador d : lista){
            if(d.getRut().equals(correo)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Agrega un desarrolladores a la coleccion, estos tienen un rut y correo unico.
     * @param fono
     * @param rut
     * @param nombre
     * @param direccion
     * @param correo 
     */
    public void agregar(String fono, String rut, String nombre, String direccion, String correo){
        if(rutUnico(rut)){
            throw new NullPointerException("Este rut ya existe en el sistema.");
        }
        if(correoUnico(correo)){
            throw new NullPointerException("Este correo ya existe en el sistema.");
        }
        this.lista.add(new Desarrollador(fono,rut,nombre,direccion,correo));
    }
    
    /**
     * Busca un desarrollador por su rut, y retorna la posicion en la que se encuentra.
     * @param rut
     * @return 
     */
    public int existeDesarrollador(String rut){
        int cont=0;
        for(Desarrollador d : lista){
            if(d.getRut().equals(rut)){
                return cont;
            }
            cont++;
        }
        throw new NullPointerException("Desarrollador no encontrado.");
    }
    
    /**
     * Esta funcion esta encargada de actualizar los datos de un desarrollador en una posicion dada.
     * @param posicion
     * @param fono
     * @param nombre
     * @param direccion 
     */
    public void actualizar(int posicion, String fono, String nombre, String direccion){
        Desarrollador d = lista.get(posicion);
        d.setFono(fono);
        d.setNombre(nombre);
        d.setDireccion(direccion);
    }
    
    /**
     * Busca un desarrollador por su rut y si existe lo elimina.
     * @param rut 
     */
    public void eliminar(String rut){
        try{
            int posicion = existeDesarrollador(rut);
            lista.remove(posicion);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    }
    
}
