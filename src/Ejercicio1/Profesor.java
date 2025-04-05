package Ejercicio1;

public class Profesor extends Empleado {

	private String cargo;
	private int antiguedadDocente;

	public Profesor() {
		super();
		this.cargo= "Sin cargo";
		this.antiguedadDocente =0;
	}
	public Profesor(String nombre, int edad, String cargo, int antiguedad) {
		super(nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedad;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	public String toString() {
		return super.toString() + " CARGO: " + cargo + " - ANTIGUEDAD: " + antiguedadDocente;
	}
	
}
