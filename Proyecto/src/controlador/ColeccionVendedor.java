package controlador;


import Modelo.Vendedor;
import java.util.ArrayList;


public class ColeccionVendedor {
    ArrayList <Vendedor> lista;

    public ColeccionVendedor() {
        this.lista = new ArrayList <>();
    }
    public boolean rutUnico(String rut){
        for(Vendedor v : lista){
            if(v.getRut().equals(rut)){
                return false;
            }
        }
        return true;
    }
    public boolean correoUnico(String correo){
        for(Vendedor v : lista){
            if(v.getRut().equals(correo)){
                return false;
            }
        }
        return true;
    }
    public void agregar(String fono, String rut, String nombre, String direccion, String correo){
        if(rutUnico(rut)){
            throw new NullPointerException("Este rut ya existe en el sistema.");
        }
        if(correoUnico(correo)){
            throw new NullPointerException("Este correo ya existe en el sistema.");
        }
        this.lista.add(new Vendedor(fono, rut, nombre, direccion, correo));
    }
    public void actualizar(int posicion,String fono, String nombre, String direccion){
        Vendedor v = lista.get(posicion);
        v.setFono(fono);
        v.setNombre(nombre);
        v.setDireccion(direccion);
    }
}
