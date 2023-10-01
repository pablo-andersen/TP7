package Ej3;

public class Planta{

    private String nombreCientifico;
    private String nombreVulgar;
    private String clasificacionSup;
    private String familia;
    private String clase;
    private boolean deInterior;
    private int riego; 
    private int sol;

    public Planta(String nombreCientifico, String nombreVulgar, String clasificacionSup, String familia, String clase,boolean deInterior, int riego, int sol) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
        this.clasificacionSup = clasificacionSup;
        this.familia = familia;
        this.clase = clase;
        this.deInterior = deInterior;
        this.riego = riego;
        this.sol = sol;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getClasificacionSup() {
        return clasificacionSup;
    }

    public void setClasificacionSup(String clasificacionSup) {
        this.clasificacionSup = clasificacionSup;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean esDeInterior() {
        return deInterior;
    }

    public void setDeInterior(boolean deInterior) {
        this.deInterior = deInterior;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

	@Override
	public String toString() {
		return "\nPLANTA\nNombre Cientifico: " + nombreCientifico + ",\nNombre Vulgar: " + nombreVulgar + ",\nDe Interior: "
				+ deInterior + ",\nRiego: " + riego + ",\nSol: " + sol + ".\n";
	}

    
}
