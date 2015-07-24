package NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by Juan Daniel on 22/07/2015.
 */
public class NavigableMmap {

    public static void main(String[] args) {
        NavigableMap<String, String> strings = new TreeMap<>();
        strings.put("Juan", "Juan Daniel Quispe Ticona");
        strings.put("Madre", "Gloria Ticona Gumercina");
        strings.put("Padre", "Daniel Quispe Zenteno");

        System.out.println(strings);

        System.out.println("Lower Key: Devuelve el valor anterior del array a partir del valor que pasamos: "+ strings.lowerKey("Madre"));

        System.out.println("floorKey: Devuelve el "+strings.floorKey("Madre"));

    }
}
