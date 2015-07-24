package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Juan Daniel on 11/07/2015.
 */
public class test {

    public static void main (String... args){

        List<Persona> linkedList = new LinkedList<>();
        ArrayList<Persona> arrayList = new ArrayList<>();


        Long i = System.currentTimeMillis();
        Long f = 0L;


        for(int x = 0; x <10000 ; x++){
            arrayList.add(new Persona());
        }

        f = System.currentTimeMillis();

        System.out.println("CREATE AL: " + (f-i));


        i = 0L;
        f = 0L;

        i = System.currentTimeMillis();

        for(int x = 0; x < 10000 ; x++){
            linkedList.add(new Persona());
        }

        f = System.currentTimeMillis();

        System.out.println("CREATE LL: "+ (f-i));
        i = System.currentTimeMillis();

        for(int x = 0; x <10000 ; x++){
            arrayList.get(x);
        }
        f = System.currentTimeMillis();

        System.out.println("GET AL: "+ (f-i));

        i = System.currentTimeMillis();

        for(int x = 0; x <10000 ; x++){
            linkedList.get(x);
        }
        f = System.currentTimeMillis();

        System.out.println("GET LL: "+ (f-i));

//
        i = System.currentTimeMillis();

        for(int x = 9999; x >0 ; x--){
            arrayList.remove(x);
        }
        f = System.currentTimeMillis();

        System.out.println("REMOVE AL: "+ (f-i));

        i = System.currentTimeMillis();

        for(int x = 9999; x >0 ; x--){
            linkedList.remove(x);
        }
        f = System.currentTimeMillis();

        System.out.println("REMOVE LL: "+ (f-i));

    }

}
