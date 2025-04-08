package Ejercicio_2;

import java.time.LocalDate;

public class Productos_Frescos extends Producto{

	private LocalDate fechaEnvasado;
	private String paisOrigen; 
	
	public Productos_Frescos() {
		super();
		paisOrigen = "Sin Pais";
		fechaEnvasado = LocalDate.of(0000, 1, 1);
	}
	
	public Productos_Frescos(int nLote, LocalDate fechaCaducidad, String paisOrigen, LocalDate fechaEnvasado) {
		super(nLote, fechaCaducidad);
		this.paisOrigen = paisOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
}
