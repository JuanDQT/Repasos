import arrays.Persona;

import java.util.HashMap;

/**
 * Created by Juan Daniel on 11/07/2015.
 */
public class hashmap {
    public static void main(String... args){
        Persona p = new Persona();
        p.setName("Mario");
        p.setSuerte(23);

        HashMap hashMap = new HashMap();

        if (hashMap.isEmpty())
            System.out.println("El hashmap esta vacio");

        hashMap.put("Name",p.getName());


        String contenido = hashMap.get("Name").toString();
        System.out.println(contenido);


        if (hashMap.isEmpty())
            System.out.println("El hashmap esta vacio");
        else
            System.out.println("El hashmap esta lleno");

        boolean check = hashMap.containsValue(p.getName());
        //boolean check = hashMap.containsKey("Name");


        System.out.println(check);

    }
}
