package Ej5;

import java.util.ArrayList;

public class Pelicula {

    private String titulo, sinopsis, genero, director;
    private int anioEstreno, duracion, edadMinima;
    private ArrayList<String> actores;

    

	public Pelicula(String titulo, int anio) {
		this.titulo = titulo;
        anioEstreno = anio;
        actores = new ArrayList<>();
	}

    
	public Pelicula(String titulo, String sinopsis, String genero, String director, int anioEstreno, int duracion,
			int edadMinima) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
        actores = new ArrayList<>();
    }

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	public void addActor(String unActor) {
        if (!actores.contains(unActor))
		    actores.add(unActor);
	}

    public boolean actua(String nombreActor){
        for (String actor : actores){
            if (actor.equalsIgnoreCase(nombreActor)){
                return true;
            }
        }
        return false;
    }
    
    public boolean equals(Pelicula unaPelicula){
        return getTitulo().equalsIgnoreCase(unaPelicula.getTitulo()) && getAnioEstreno() == unaPelicula.getAnioEstreno();
    }

    public String toString(){
        return "\nTitulo: " + getTitulo() + ",\nSinopsis: " + getSinopsis() + ",\nAño de Estreno: " + getAnioEstreno() + ",\nDirector: " + getDirector() + ".\n";
    }
}
