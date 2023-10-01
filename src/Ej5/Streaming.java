package Ej5;

import java.util.ArrayList;

import Ej5.Filtros.Filtro;

public class Streaming {

    private String nombre;
    private ArrayList<Pelicula> peliculas;

    public Streaming(String nombre){
        this.nombre = nombre;
        peliculas = new ArrayList<Pelicula>();
    }
    
    public void addPelicula(Pelicula unaPelicula){
        if (peliculas.size()>0){
            boolean existe = false;
            for (Pelicula p : peliculas) {
                if(p.equals(unaPelicula)) {
                    existe = true;
                }
            }
            if (!existe){
                peliculas.add(unaPelicula);
            }
        }
        else {
            peliculas.add(unaPelicula);
        }
    }

    public ArrayList<Pelicula> cumple (Filtro unfiltro) {
        ArrayList<Pelicula> resultado = new ArrayList<Pelicula>();

        for(Pelicula p: peliculas){
            if (unfiltro.esCumplidoPor(p)){
                resultado.add(p);
            }

        }
        return resultado;
    }

	public String getNombre() {
		return nombre;
	}
    
}
