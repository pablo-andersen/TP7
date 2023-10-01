package Ej5.Filtros;

import Ej5.Pelicula;

public class TituloContiene extends Filtro{

    private String titulo;

    public TituloContiene(String unTexto){
        titulo = unTexto;
    }
    
    @Override
    public boolean esCumplidoPor(Pelicula unaPelicula){
        return unaPelicula.getTitulo().toUpperCase().contains(getTitulo().toUpperCase());
    }

	public String getTitulo() {
		return titulo;
	}
    
}
