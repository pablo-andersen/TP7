package Ej5;

import Ej5.Filtros.ActuoElActor;
import Ej5.Filtros.GeneroEsIgualA;
import Ej5.Filtros.TituloContiene;

/*
 * Una plataforma de streaming de video permite a sus usuarios consultar su catálogo de
películas disponibles. 
De cada película se guarda el título, la sinopsis, los géneros (“acción”,“terror”, “drama”, etc), 
el director, los actores, el año de estreno, la duración de la película (en minutos), y 
la edad mínima requerida para ver la película.
La plataforma debe permitir realizar búsquedas de películas según diversos criterios, por
ejemplo:
● Buscar todas las películas que en el título contenga la palabra “luna”.
● Buscar todas las películas que contengan un género específico (por ejemplo,
“terror”).
● Buscar todas las películas en las que haya actuado Will Smith y cuyo director
NO haya sido Martin Scorsese.
● Buscar todas las películas que se hayan grabado antes del 2015 y cuya
duración sea menor a 95 minutos.
A su vez, dado que algunas películas son más exitosas que otras, a la hora de analizar si
adquirir la licencia de una nueva película, la plataforma analiza si la película resultará
rentable o no. Una película será rentable si cumple con ciertos criterios que hace que los
usuarios prefieran verla. Por ejemplo, el CEO de la plataforma observó que los usuarios
suelen ver:
● Películas cuya duración sea menor a 120 minutos, que no sean del género
“comedia”.
● Películas posteriores del 2017, a no ser que se trate de películas del género
“infantil” o “documental”.
Dado que las preferencias de los clientes cambian con el tiempo, el CEO de la plataforma de
streaming desea poder cambiar en tiempo de ejecución las políticas de adquisición de
licencias de películas, en caso de ser necesario. Proveer un servicio que le permita a la
plataforma determinar si una película resultará rentable o no.
 */

public class Main {

    public static void main(String[] args) {        
        Pelicula titanic = new Pelicula("Titanic", "En 1912 un barco que supuestamente era inhundible choca un iceberg y se hunde.", "Drama", "James Cameron", 1997, 130, 16);
        Pelicula batman = new Pelicula("Batman", "Un joven millonario combate el crimen por las noches con un traje de murcielago.", "accion", "Tim Burton", 1989, 95, 14);
        Pelicula harryPotter = new Pelicula("Harry Potter y la piedra filosofal", "Un huérfano entra a una escuela de magia y hechicería donde se dará cuenta de la verdad sobre su familia, de sí mismo y del mal que asecha el mundo mágico.",    "Fantasia", "Chris Columbus", 2001, 150, 0);
        Pelicula oppenheimer = new Pelicula("Oppenheimer", "La historia del científico estadounidense J. Robert Oppenheimer y su papel en el desarrollo de la bomba atómica.", "drama", "Christopher Nolan", 2023, 180, 13);

        Streaming nerdFlix = new Streaming("NerdFlix");
        nerdFlix.addPelicula(titanic);
        nerdFlix.addPelicula(batman);
        nerdFlix.addPelicula(harryPotter);
        nerdFlix.addPelicula(oppenheimer);

        System.out.println("*** BUSCO PELICULAS CUYO TITULO CONTENGA 'Harry' ***");        
        System.out.println(nerdFlix.cumple(new TituloContiene("Harry")));   
        
        System.out.println("*** BUSCO PELICULAS CUYO GENERO SEA 'Drama' ***");        
        System.out.println(nerdFlix.cumple(new GeneroEsIgualA("Drama")));   
        
        System.out.println("*** BUSCO PELICULAS DONDE NO ACTUO EL ACTOR 'Will Smith' ***");        
        System.out.println(nerdFlix.cumple(new CriterioNOT (new ActuoElActor("Will Smith"))));   


        
    }    
}
