package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Juan Daniel on 20/07/2015.
 */
public class test {

    public static int calculo() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu numero: ");
        int a = scanner.nextInt();

        return a;
    }

    public static void main(String... args){
        int a = 0;
        try{
            a = calculo();
        }catch (InputMismatchException e){
            a = 4;
            System.out.println("Convertido: "+a);
        }
        finally {
            System.out.println("Filtro procesado correctamente: " + a);
        }

    }
}
