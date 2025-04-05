package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

    public static void main(String[] args) {
        TreeSet<Profesor> profesores = new TreeSet<>();

        profesores.add(new Profesor("Ana García", 40, "Titular", 15));
        profesores.add(new Profesor("Juan Pérez", 35, "Adjunto", 10));
        profesores.add(new Profesor("Marta López", 50, "JTP", 25));
        profesores.add(new Profesor("Luis Gómez", 45, "Ayudante", 20));
        profesores.add(new Profesor("Sofía Ramírez", 38, "Titular", 12));

        Iterator<Profesor> iterador = profesores.iterator();

        System.out.println("=== Profesores ordenados por antigüedad (mayor a menor) ===");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}