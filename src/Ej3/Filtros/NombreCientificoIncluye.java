package Ej3.Filtros;

import Ej3.Planta;

public class NombreCientificoIncluye extends Filtro {

    private String textoBuscado;
    public NombreCientificoIncluye(String unTexto){
        textoBuscado = unTexto;
    }

	@Override
	public boolean esCumplidoPor(Planta unaPlanta) {
		return unaPlanta.getNombreCientifico().toUpperCase().contains((textoBuscado).toUpperCase());
	}
}
