package Ej5.Filtros;

import Ej5.Pelicula;

public class GeneroEsIgualA extends Filtro{
    
    private String genero;

    public GeneroEsIgualA(String texto){
        genero = texto;
    }

    @Override
    public boolean esCumplidoPor(Pelicula unaPelicula){
        return unaPelicula.getGenero().equalsIgnoreCase(genero);
    }
}
