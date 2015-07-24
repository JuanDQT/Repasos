package EX_DNIES;

import java.util.*;

/**
 * Created by Juan Daniel on 21/07/2015.
 */
public class ex1 {

    public static void main(String... args){
        String[] valor = "hola peluca sabe".split(" ");

        TreeSet<String> strings = new TreeSet<>();


        for ( String s : valor) {
            strings.add(s);
        }

        NavigableSet<String> reverse = strings.descendingSet();

        Iterator iterator = reverse.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
