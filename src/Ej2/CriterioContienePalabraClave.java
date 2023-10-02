package Ej2;

public class CriterioContienePalabraClave extends Criterio{

    private String palabraClave;

    public CriterioContienePalabraClave(String clave){
        palabraClave = clave;
    }
    
    @Override
    public boolean cumple(Object unObjeto){
        return ((Documento)unObjeto).contienePalabraClave(palabraClave);
    }

}
