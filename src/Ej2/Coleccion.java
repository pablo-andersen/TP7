package Ej2;

import java.util.ArrayList;

public class Coleccion {

    private ArrayList<Documento> documentos;

    public Coleccion() {
        documentos = new ArrayList<Documento>();
    }

    public void addDocumento(Documento unDocumento){
        if (unDocumento == null) return;
        // recorrer el arreglo de documentos. 
        // para cada posicion comparo los documentos.
        // si son iguales, RETURN.
        // si salgo del for, es porque no lo encontro, entonces lo agrego

        // for (Documento d: documentos) {
        //  if(d.equals(unDocumento))
        // }    
        for (int i = 0; i < documentos.size(); i++){
            if(documentos.get(i).equals(unDocumento))
                return;
        }        
        documentos.add(unDocumento);
    }
    
    public void imprimirDocumentos(){
        for(Documento d: documentos){
            System.out.println(d);
        }
    }

    public ArrayList<Documento> filtrarDocumentos(Criterio unCriterio){ // for (Documento d: documentos)
        ArrayList<Documento> resultado = new ArrayList<Documento>();
        for(int i=0; i < documentos.size(); i++) {
            if (unCriterio.cumple(documentos.get(i))){
                resultado.add(documentos.get(i));
            };
        }   
        return resultado;
    }
}
