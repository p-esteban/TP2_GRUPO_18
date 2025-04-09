package ejercicio3;

public class EdificioDeOficinas extends Edificio {
	
	private int numeroDeOficinas;

    public EdificioDeOficinas(double superficie, int numeroDeOficinas) {
        super(superficie);
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    
    public void mostrarDatos() {
        System.out.println("Edificio de Oficinas");
        System.out.println("Superficie: " + getSuperficie());
        System.out.println("Número de oficinas: " + numeroDeOficinas);
        System.out.println("Tipo de instalación: Techado");
        System.out.println("------------------------");
    }

}
