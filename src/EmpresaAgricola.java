import java.util.ArrayList;

public class EmpresaAgricola {
    private String nombre;
    private ArrayList<Agroquimico> productosQuimicos;    
    
    public EmpresaAgricola(String nombre) {
        this.nombre = nombre;
        productosQuimicos = new ArrayList<Agroquimico>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Agroquimico> getProductosQuimicos() {
        return new ArrayList<Agroquimico>(productosQuimicos);
    }

    public ArrayList<Agroquimico> AgroquimicosSegunEnfermedad(Enfermedad unaEnfermedad){
        ArrayList<Agroquimico> agroquimicosAdecuados = new ArrayList<Agroquimico>();
        for (Agroquimico a: productosQuimicos){
            if (unaEnfermedad.esTratadaPor(a)) {
                agroquimicosAdecuados.add(a);
            }
        }
        return agroquimicosAdecuados
    }

    public ArrayList<Agroquimico> AgroquimicosSegunCultivosYEnfermedad(Cultivo unCultivo, Enfermedad unaEnfermedad){
        ArrayList<Agroquimico> agroquimicosAdecuados = new ArrayList<Agroquimico>();
        for (Agroquimico a: productosQuimicos){
            if (unCultivo.esDeUtilidad(a) && unaEnfermedad.esTratadaPor(a)) {
                agroquimicosAdecuados.add(a);
            }
        }
        return agroquimicosAdecuados;
    }
}
