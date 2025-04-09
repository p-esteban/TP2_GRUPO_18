package ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {
    public static void main(String[] args) {
        ArrayList<Edificio> listaEdificios = new ArrayList<>();

        listaEdificios.add(new Polideportivo("Poli 1", 1500, 1));
        listaEdificios.add(new Polideportivo("Poli 2", 2000, 2));
        listaEdificios.add(new Polideportivo("Poli 3", 1800, 1));
        listaEdificios.add(new EdificioDeOficinas(1200, 10));
        listaEdificios.add(new EdificioDeOficinas(950, 8));

        Iterator<Edificio> iterador = listaEdificios.iterator();

        while (iterador.hasNext()) {
            Edificio edificio = iterador.next();
            edificio.mostrarDatos();
        }
    }
}

