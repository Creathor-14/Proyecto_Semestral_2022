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
    public void agregar(String fechaN, String comuna, String telefono, String rut, String nombre, String direccion, String correo){
        if(rutUnico(rut)){
            throw new NullPointerException("Este rut ya existe en el sistema.");
        }
        if(correoUnico(correo)){
            throw new NullPointerException("Este correo ya existe en el sistema.");
        }
        this.lista.add(new Usuario(fechaN, comuna, telefono, rut, nombre, direccion, correo));
    }
    public void actualizar(int posicion, String fechaN, String comuna, String telefono, String nombre, String direccion){
        Usuario u = lista.get(posicion);
        u.setFechaN(fechaN);
        u.setComuna(comuna);
        u.setTelefono(telefono);
        u.setNombre(nombre);
        u.setDireccion(direccion);
    }
}
