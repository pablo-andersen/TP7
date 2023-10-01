package Ej3.Filtros;

import Ej3.Planta;

public class ClasificacionEsIgual extends Filtro{

    private String textoBuscado;

    public ClasificacionEsIgual(String unTexto){
        textoBuscado = unTexto;
    }

	@Override
	public boolean esCumplidoPor(Planta unaPlanta) {
		return unaPlanta.getClasificacionSup().equalsIgnoreCase(textoBuscado);
	}    
    
}
