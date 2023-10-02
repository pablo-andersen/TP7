package Ej2;

public class Main {
    public static void main(String[] args) {

        //Instanciamos los documentos
        Documento biblia = new Documento("La Biblia", "Salmo 119");
        Documento principito = new Documento("El Principito", "Lo esencial es invisible a los ojos");
        Documento pulgarcito = new Documento("Pulgarcito", "Habia una vez");
        Documento blancanieves = new Documento("Blancanieves", "espejito, espejito");

        //Agregamos autores
        biblia.addAutor("Apostoles");
        principito.addAutor("Exupery");
        pulgarcito.addAutor("Laura Lelong");
        blancanieves.addAutor("Walt Disney");


        //Agregamos palabras clave
        biblia.addPalabrasClave("Amor");
        biblia.addPalabrasClave("Maestro");
        biblia.addPalabrasClave("Lazaro");
        
        principito.addPalabrasClave("Principe");
        principito.addPalabrasClave("Zorro");
        principito.addPalabrasClave("Piloto");
        
        pulgarcito.addPalabrasClave("Viaje");
        pulgarcito.addPalabrasClave("Enano");
        pulgarcito.addPalabrasClave("Calavera");

        blancanieves.addPalabrasClave("Manzana");
        blancanieves.addPalabrasClave("Espejito");
        blancanieves.addPalabrasClave("Bruja");
        blancanieves.addPalabrasClave("Principe");

        System.out.println(biblia);
        System.out.println(principito);
        System.out.println(pulgarcito);
        System.out.println(blancanieves);

        Coleccion coleccion = new Coleccion();

        coleccion.addDocumento(blancanieves);
        coleccion.addDocumento(pulgarcito);
        coleccion.addDocumento(biblia);
        coleccion.addDocumento(principito);

        System.out.println("imprimo lista con lo agregado");
        coleccion.imprimirDocumentos();

        System.out.println("Imprimo lista con un documento repetido");
        Documento repetido = new Documento("puLGARCIto", "texto de prueba");
        coleccion.addDocumento(repetido);

        coleccion.imprimirDocumentos();

        System.out.println("*** IMPRIMIR FILTRO IGUAL A....***");
        System.out.println(coleccion.filtrarDocumentos(new CriterioTituloIgual("LA bibLIA")));

        System.out.println("*** IMPRIMIR FILTRO CONTIENE PALABRA CLAVE....***");
        System.out.println(coleccion.filtrarDocumentos(new CriterioContienePalabraClave("Principe")));

    }
}
