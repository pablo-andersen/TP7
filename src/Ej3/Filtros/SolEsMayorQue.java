package Ej3.Filtros;

import Ej3.Planta;

public class SolEsMayorQue extends Filtro{

    private int referencia;

    public SolEsMayorQue(int unNumero){
        setReferencia(unNumero);
    }

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int unNumero) {
		if (unNumero > 0)
            referencia = unNumero;
        else
          referencia = 1;
	}

	@Override
	public boolean esCumplidoPor(Planta unaPlanta) {
		return unaPlanta.getSol() > referencia;
	}
       
}
