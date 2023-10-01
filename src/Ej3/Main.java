package Ej3;

import Ej3.Filtros.ClasificacionEsIgual;
import Ej3.Filtros.FiltroAND;
import Ej3.Filtros.NombreCientificoIncluye;
import Ej3.Filtros.NombreVulgarEsIgual;
import Ej3.Filtros.RiegoEsMayorQue;
import Ej3.Filtros.RiegoEsMenorQue;
import Ej3.Filtros.SolEsMayorQue;
import Ej3.Filtros.SolEsMenorQue;

public class Main {
    public static void main(String[] args) {
        Planta margarita = new Planta("Bellis perennis", "margarita", "Plantae", "Asteraceae", "Magnoliopsida", false, 6, 2);
        Planta alegria = new Planta("Impatienis Walleriana", "Alegria del hogar", "herbacea", "Balsaminácea", "Magnoliopsida", true, 2, 8);

        Vivero vivero = new Vivero("vivero");

        vivero.addPlanta(alegria);
        vivero.addPlanta(margarita);

        System.out.println("\n\n *** BUSCO PLANTAS CUYO NOMBRE CIENTIFICO CONTENGA 'is' ***");
        System.out.println(vivero.filtrarPlantas(new NombreCientificoIncluye("is")));

        System.out.println("\n\n *** BUSCO PLANTAS CUYO NOMBRE VULGAR SEA IGUAL A 'MargaRita' ***");
        System.out.println(vivero.filtrarPlantas(new NombreVulgarEsIgual("MargaRita")));

        System.out.println("\n\n *** BUSCO PLANTAS CUYA CLASIFICACION SEA IGUAL A 'plantae' ***");
        System.out.println(vivero.filtrarPlantas(new ClasificacionEsIgual("PlantAe")));

        System.out.println("\n\n *** BUSCO PLANTAS CON SOL MAYOR A 5 Y RIEGO MENOR A 3 ***");
        System.out.println(vivero.filtrarPlantas(new FiltroAND(new SolEsMayorQue(5), new RiegoEsMenorQue(3))));

        System.out.println("\n\n *** BUSCO PLANTAS CON SOL MENOR A 4 Y RIEGO MAYOR A 4 ***");
        System.out.println(vivero.filtrarPlantas(new FiltroAND(new SolEsMenorQue(4), new RiegoEsMayorQue(4))));

        System.out.println("\n\n *** BUSCO PLANTAS QUE NECESITEN POCO RIEGO (INFERIOR A 3) ***");
        System.out.println(vivero.filtrarPlantas(new RiegoEsMenorQue(Vivero.getUmbralBajoRiego())));

        //EL EJERCICIO PIDE CUALQUIER COMBINACION LOGICA DE LAS FORMAS ANTERIORES, SOLO HAY QUE UTILIZAR FILTRO AND O FILTRO OR PARA COMBINAR.

    }
}
