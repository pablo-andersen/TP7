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


    
}
