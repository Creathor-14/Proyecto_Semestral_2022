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
     * Esta funcion esta encargada de agregar Desarrolladores a la coleccion, estos tienen un rut y correo unico.
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
    
    
}
