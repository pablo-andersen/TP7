package Ej5.Filtros;

import Ej5.Pelicula;

public class ActuoElActor extends Filtro{
    
    private String nombreActor;

    public ActuoElActor(String nombre){
        nombreActor = nombre;
    }

    @Override
    public boolean esCumplidoPor(Pelicula unaPelicula){
        return unaPelicula.actua(nombreActor);
    }
}
