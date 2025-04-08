package Ejercicio_2;

import java.time.LocalDate;

public class Producto {
	
	private int nLote;
	private LocalDate fechaCaducidad;
	
	public Producto() {
		nLote = 0;
		fechaCaducidad = LocalDate.of(0000, 1, 1);
	}
	
	public Producto(int nLote, LocalDate fechaCaducidad) {
		this.nLote = nLote;
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getnLote() {
		return nLote;
	}
	public void setnLote(int nLote) {
		this.nLote = nLote;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Número de lote: " + nLote + ", fecha de caducidad: " + fechaCaducidad;
	}
	
	
	
}