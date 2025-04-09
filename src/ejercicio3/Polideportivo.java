package ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva {

	private String nombre;
	private int tipoDeInstalacion;// 1 = Techado, 2 = Abierto
	
	
	public Polideportivo(String nombre,double superficie,int TipoDeInstalacion) {
		super(superficie);
		this.nombre=nombre;
		this.tipoDeInstalacion=TipoDeInstalacion;
	}


	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}





	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}



	public void mostrarDatos() {
	    System.out.println("Polideportivo: " + nombre);
	    System.out.println("Superficie: " + getSuperficie());
	    System.out.println("Tipo de instalación: " + (tipoDeInstalacion == 1 ? "Techado" : "Abierto"));
	    System.out.println("------------------------");
	}


}
