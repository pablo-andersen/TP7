package Ej3.Filtros;

import Ej3.Planta;

public class FiltroOR extends Filtro{
    
    private Filtro filtro1, filtro2;

    public FiltroOR(Filtro filtro1, Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean esCumplidoPor(Planta unaPlanta){
        return filtro1.esCumplidoPor(unaPlanta) || filtro2.esCumplidoPor(unaPlanta);
    }
}
