import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        estadosPatologicos = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstadosPatologicos() {
        return new ArrayList<String>(estadosPatologicos);
    }
    
    public boolean esTratadaPor(Agroquimico unAgroquimico){
        for (String ep : estadosPatologicos){
            if (!unAgroquimico.trata(ep))
                return false;
        }
        return true;
    }

}
