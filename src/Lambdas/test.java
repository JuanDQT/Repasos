package Lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Daniel on 15/07/2015.
 */

public class test {

    public static void main(String... args) {
        //List<Integer> oNumbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oNumbers = new ArrayList<>();
        oNumbers.add(1);
        oNumbers.add(2);
        oNumbers.add(3);
        oNumbers.add(4);
        oNumbers.add(5);

        for (int oNumber : oNumbers) {
            System.out.println(oNumber);
        }

        Runnable oRunnableDos = () -> System.out.println("oRunnableDos está siendo ejecutado!(Lambda)");
        oRunnableDos.run();
    }
}