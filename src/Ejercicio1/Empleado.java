package Ejercicio1;

public class Empleado {

    private static int contador = 1000; 
    private final int id;
    private String nombre;
    private int edad;
    
 
    public Empleado() {
    	contador++;
        this.id = contador;
        this.nombre = "sin nombre";
        this.edad = 99;
    }
    
    public Empleado(String nombre, int edad) {
    	contador++;
        this.id = contador;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public static int devuelveProximoID()
    {
    	return contador+1;
    	
    }
    
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Empleado.contador = contador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	
	public String toString() {
		return "ID: " + id + " - NOMBRE: " + nombre + " - EDAD: " + edad;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
