package Ej2;

public class CriterioTituloIgual extends Criterio{
    
    private String titulo;

    
    public CriterioTituloIgual(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Object unDocumento){
        return ((Documento)unDocumento).getTitulo().equalsIgnoreCase(titulo);
    }


}
