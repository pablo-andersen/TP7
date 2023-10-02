package Ej2;

import java.util.ArrayList;

public class Documento {
    private String titulo, texto;
    private ArrayList<String> autores;
    private ArrayList<String> palabrasClave;


    public Documento(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        autores = new ArrayList<String>();
        palabrasClave = new ArrayList<String>();
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getTexto() {
        return texto;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }


    public void addAutor(String unAutor) {
        if (unAutor == null) return;
        boolean encontro = false;
        int i = 0;
        while (!encontro && i < autores.size()){
            if(autores.get(i).equalsIgnoreCase(unAutor)){
                encontro = true;
            }
            i++;
        }
        if (!encontro){
            autores.add(unAutor);
        }
    }

    public void addPalabrasClave(String unaPalabraClave) {
        if (unaPalabraClave == null) return;
        boolean encontro = false;
        int i = 0;
        while (!encontro && i < palabrasClave.size()){
            if(palabrasClave.get(i).equalsIgnoreCase(unaPalabraClave)){
                encontro = true;
            }
            i++;
        }
        if (!encontro){
            palabrasClave.add(unaPalabraClave);
        }
    }

    public boolean equals(Documento otroDocumento){
        return this.getTitulo().equalsIgnoreCase(otroDocumento.getTitulo());
    }

    public String toString(){
        return "Titulo: " + getTitulo() + ".\n";
    }


    public boolean contienePalabraClave(String palabra){
       for (String clave: palabrasClave){
        if (clave.equalsIgnoreCase(palabra)){
            return true;
        }
       }
       return false;
    }
}
