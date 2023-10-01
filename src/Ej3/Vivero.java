package Ej3;

import java.util.ArrayList;

import Ej3.Filtros.Filtro;

public class Vivero {

    private String nombre;
    private ArrayList<Planta> plantas;
    private static final int UMBRAL_BAJO_RIEGO = 3;

    public Vivero(String unNombre) {
        nombre = unNombre;
        plantas = new ArrayList<Planta>();
    }
    
    public void addPlanta(Planta unaPlanta){
        if(!plantas.contains(unaPlanta)) {
            plantas.add(unaPlanta);
        }
    }

    public ArrayList<Planta> filtrarPlantas(Filtro unFiltro) {
        ArrayList<Planta> resultado = new ArrayList<>();
        for (Planta p : plantas){
            if (unFiltro.esCumplidoPor(p)){
                resultado.add(p);
            }
        }
        return resultado;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getUmbralBajoRiego() {
		return UMBRAL_BAJO_RIEGO;
	}
    
}
