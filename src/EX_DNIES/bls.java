package EX_DNIES;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by Juan Daniel on 22/07/2015.
 */
/*
ALTERNATIVA CON UN FOR EN LUGAR DE UN WHILE
 */
public class bls {
    public static void main(String[] args) {
        String[] mensaje = "Hola caracola puta".split(" ");

        TreeSet<String> strings = new TreeSet<>();

        for(String m: mensaje){
            strings.add(m);
        }

        NavigableSet<String> reverse = strings.descendingSet();
        Iterator iterator = reverse.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String s: reverse){
            System.out.println(s);
        }

    }
}
