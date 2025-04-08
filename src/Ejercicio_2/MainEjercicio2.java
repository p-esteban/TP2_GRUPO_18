package Ejercicio_2;

import java.time.LocalDate;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		//Producto fresco
				Productos_Frescos fresco = new Productos_Frescos(101, LocalDate.of(2025, 5, 20), "Argentina", LocalDate.of(2025, 5, 10));
				
				//Producto refrigerado
				Producos_Refrigerados refrigerado = new Producos_Refrigerados(202, LocalDate.of(2025, 6, 15), 1234);
				
				//Producto congelado
				Producos_Congelados congelado = new Producos_Congelados(303, LocalDate.of(2026, 1, 10), -18);
				
				//Mostrar datos
				System.out.println("=== PRODUCTO FRESCO ===");
				System.out.println(fresco);
				System.out.println("Número de lote: " + fresco.getnLote());
				System.out.println("Fecha de caducidad: " + fresco.getFechaCaducidad());

				System.out.println("\n=== PRODUCTO REFRIGERADO ===");
				System.out.println(refrigerado);
				System.out.println("Número de lote: " + refrigerado.getnLote());
				System.out.println("Fecha de caducidad: " + refrigerado.getFechaCaducidad());

				System.out.println("\n=== PRODUCTO CONGELADO ===");
				System.out.println(congelado);
				System.out.println("Número de lote: " + congelado.getnLote());
				System.out.println("Fecha de caducidad: " + congelado.getFechaCaducidad());
		
	}

}
