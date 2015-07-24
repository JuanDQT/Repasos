package statics;

/**
 * Created by Juan Daniel on 17/07/2015.
 */
class Casa{
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Casa.name = name;
    }
}

public class test {

    public static void main(String... args){
        Casa casa = new Casa();

        casa.setName("Casa de putas");
        Casa.setName("Casa sagrada");

        System.out.println(casa.getName());
    }
}
