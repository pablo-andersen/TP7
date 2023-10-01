package Ej3.Filtros;

import Ej3.Planta;

public class NombreVulgarEsIgual extends Filtro {

    private String textoBuscado;
    
    public NombreVulgarEsIgual(String unTexto){
        textoBuscado = unTexto;
    }

    @Override
    public boolean esCumplidoPor(Planta unaPlanta){
        return unaPlanta.getNombreVulgar().equalsIgnoreCase(textoBuscado);
    }
}
