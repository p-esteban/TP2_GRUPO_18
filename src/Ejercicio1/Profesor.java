package Ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {

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
	
	public int compareTo(Profesor otro) {
		return Integer.compare(otro.antiguedadDocente, this.antiguedadDocente);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
}
