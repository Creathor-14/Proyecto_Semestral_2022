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
    
    /**
     * Busca un vendedor por su rut, y retorna la posicion en la que se encuentra
     * @param rut
     * @return 
     */
    public int existeVendedor(String rut){
        int cont=0;
        for(Vendedor v : lista){
            if(v.getRut().equals(rut)){
                return cont;
            }
            cont++;
        }
        throw new NullPointerException("Vendedor no encontrado.");
    }
    
    /**
     * Esta funcion esta encargada de actualizar los datos de un vendedor en una posicion dada.
     * @param posicion
     * @param fono
     * @param nombre
     * @param direccion 
     */
    public void actualizar(int posicion,String fono, String nombre, String direccion){
        Vendedor v = lista.get(posicion);
        v.setFono(fono);
        v.setNombre(nombre);
        v.setDireccion(direccion);
    }
    
    /**
     * Busca un vendedor por su rut y si existe lo elimina.
     * @param rut 
     */
    public void eliminar(String rut){
        try{
            int posicion = existeVendedor(rut);
            lista.remove(posicion);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    }
}
