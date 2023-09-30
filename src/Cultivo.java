import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedadesFrecuentes = new ArrayList<Enfermedad>();
    }

    public Cultivo(String nombre, ArrayList<Enfermedad>enfermedades) {
        this.nombre = nombre;
        enfermedadesFrecuentes = new ArrayList<Enfermedad>(enfermedades);
    }

    public Cultivo(String nombre, Enfermedad enfermedad){
        this.nombre = nombre; 
        enfermedadesFrecuentes = new ArrayList<Enfermedad>();
        enfermedadesFrecuentes.add(enfermedad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedadesFrecuentes() {
        return new ArrayList<Enfermedad>(enfermedadesFrecuentes);
    }

    /*los cultivos son capaces de decir si en algún
    momento puede serle de utilidad o no un agroquimico, es decir si el agroquímico puede tratar una de sus
    enfermedades frecuentes y no se desaconseja su uso en el cultivo. Se considera que el
    agroquímico trata una enfermedad si todos los estados patológicos de la enfermedad están
    contenidos por las acciones del producto químico.*/
    public boolean esDeUtilidad(Agroquimico unAgroquimico){
        boolean esUtil = false;
        if(trataEnfermedades(unAgroquimico) && !esContraproducente(unAgroquimico)){
            esUtil = true;
        }
        return esUtil;
    }

    public boolean trataEnfermedades(Agroquimico unAgroquimico){
        for (Enfermedad e : enfermedadesFrecuentes){
            if (!e.esTratadaPor(unAgroquimico)){
                return false;
            }
        }
        return true;
    }

    public boolean esContraproducente(){

    }

}
