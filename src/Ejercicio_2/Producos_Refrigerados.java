package Ejercicio_2;

import java.time.LocalDate;

public class Producos_Refrigerados extends Producto{

	private int codigo;
	
	public Producos_Refrigerados() {
		super();
		codigo = 0000;
	}
	
	public Producos_Refrigerados(int nLote, LocalDate fechaCaducidad, int codigo) {
		super(nLote, fechaCaducidad);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo;
	}
	
	
	
}
