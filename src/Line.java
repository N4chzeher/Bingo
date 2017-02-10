import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by NACHZEHER on 07/02/2017.
 */

public class Line {

    private List<Integer> numeros = new ArrayList<>();
    private Map<Integer, Boolean> hits = new HashMap<>();

    public Line() {

        // el constructor tiene que inicializar un array con 4 numeros del 0 al 9 que sean diferentes

        for (int i = 0; i < 4; i++) {
            while (true) {

                int numero = ThreadLocalRandom.current().nextInt(0, 10);
                if (!numeros.contains(numero)) {
                    numeros.add(numero);
                }
            }
        }
        for (Integer numero : numeros) {
            hits.put(numero, false);
        }

    }

    public boolean checkNumber(int numero) {

        //este metodo checkea si el numero pasado como parametro esta presente en el arraylist
        // si esta presente entonces actualiza el array de hits

        if (hits.containsKey(numero)) {
            hits.put(numero, true);
            return true;
        }

        return false;
    }

    public boolean lineCompleted() {
        // devuelve cierto si se ha completado una linea

        for (Boolean present : hits.values()) {
            if (!present) {
                return false;
            }
        }
        return true;
    }

    public boolean numberHit(int numero){

        return hits.getOrDefault(numero, false);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (numeros != null ? !numeros.equals(line.numeros) : line.numeros != null) return false;
        return hits != null ? hits.equals(line.hits) : line.hits == null;
    }

    @Override
    public int hashCode() {
        int result = numeros != null ? numeros.hashCode() : 0;
        result = 31 * result + (hits != null ? hits.hashCode() : 0);
        return result;
    }
}


