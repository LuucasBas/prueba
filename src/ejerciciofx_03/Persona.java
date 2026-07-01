package ejerciciofx_03;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Persona{" + "nombre= " + nombre + '}';
    }
    
    
}
