package EX_DNIES;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Juan Daniel on 21/07/2015.
 */
public class ex2 {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int limite = scanner.nextInt();
        int ppp = scanner.nextInt();
        int puntos = scanner.nextInt();

        System.out.println(limite + "-" + ppp + "-" + puntos);
        scanner.nextLine();
        integers.add(scanner.nextInt());

        for(Integer i: integers)
            System.out.println(i+"-");


    }
}
