package Ejercicio_2;

import java.time.LocalDate;

public class Producos_Congelados extends Producto{

	private int temperatura;
	
	public Producos_Congelados() {
		super();
		temperatura = 00;
	}
	
	public Producos_Congelados(int nLote, LocalDate fechaCaducidad, int temperatura) {
		super(nLote, fechaCaducidad);
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "temperatura recomendada: " + temperatura + " °C";
	}
	
	
	
}
