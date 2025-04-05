package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {

    public static void main(String[] args) {

        // Crea ArrayList de Profesores
        ArrayList<Profesor> profesores = new ArrayList<>();

        // Crea y agrega 5 profesores al ArrayList
        profesores.add(new Profesor("Ana García", 40, "Titular", 15));
        profesores.add(new Profesor("Juan Pérez", 35, "Adjunto", 10));
        profesores.add(new Profesor("Marta López", 50, "JTP", 25));
        profesores.add(new Profesor("Luis Gómez", 45, "Ayudante", 20));
        profesores.add(new Profesor("Sofía Ramírez", 38, "Titular", 12));

        // Mostrar la información usando un iterador
        Iterator<Profesor> iterador = profesores.iterator();

        System.out.println("=== Lista de Profesores ===");
        while (iterador.hasNext()) {
            Profesor profe = iterador.next();
            System.out.println(profe);
        }
    }
}
