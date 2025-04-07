package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {

    public static void main(String[] args) {

       
        ArrayList<Profesor> profesores = new ArrayList<>();

        profesores.add(new Profesor("Ana García", 40, "Titular", 15));
        profesores.add(new Profesor("Juan Pérez", 35, "Adjunto", 10));
        profesores.add(new Profesor("Marta López", 50, "JTP", 25));
        profesores.add(new Profesor("Luis Gómez", 45, "Ayudante", 20));
        profesores.add(new Profesor("Sofía Ramírez", 38, "Titular", 12));
        
        Iterator<Profesor> iterador = profesores.iterator();

        System.out.println("=== Lista de Profesores ===");
        while (iterador.hasNext()) {
            Profesor profe = iterador.next();
            System.out.println(profe);
        }
        
        System.out.println("=== Comparacion de Profesores ===");
        Profesor profesor1 = new Profesor("Alejandro",30,"Titular",5);
        Profesor profesor2 = new Profesor("Alejandro",30,"Titular",5);
        
        if(profesor1.equals(profesor2)) 
        	System.out.println("Es el mismo profesor");
        else 
        	 System.out.println("No es el mismo profesor");
        
    }
}
