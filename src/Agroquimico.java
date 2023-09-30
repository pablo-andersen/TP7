import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosNoRecomendados;
    private ArrayList<String> estadosPatologicosQueTrata;

    public Agroquimico(String nombre){
        this.nombre = nombre;
        cultivosNoRecomendados = new ArrayList<Cultivo>();
        estadosPatologicosQueTrata = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cultivo> getCultivosNoRecomendados() {
        return new ArrayList<Cultivo>(cultivosNoRecomendados);
    }

    public ArrayList<String> getEstadosPatologicosQueTrata() {
        return new ArrayList<String>(estadosPatologicosQueTrata);
    }

    public void addCultivo (Cultivo unCultivo) {
        boolean existe = false;
        int i = 0;
        while (!existe && i < cultivosNoRecomendados.size()){
            if (cultivosNoRecomendados.get(i).equals(unCultivo)) {
                existe = true;
            }
            i++;
        }
        if (!existe){
            cultivosNoRecomendados.add(unCultivo);
        }
    }

    public void addEstadoPatologico(String unEstadoPatologico){
        boolean existe = false;
        int i = 0;
        while (!existe && i < estadosPatologicosQueTrata.size()){
            if (estadosPatologicosQueTrata.get(i).equalsIgnoreCase(unEstadoPatologico)) {
                existe = true;
            }
            i++;
        }
        if (!existe){
            cultivosNoRecomendados.add(unEstadoPatologico);
        }
    }

    public boolean trata(String estadoPatologico){
        for (String ep : estadosPatologicosQueTrata) {
            if (ep.equalsIgnoreCase(estadoPatologico)){
                return true;
            }
        }
        return false;
    }
    
}


