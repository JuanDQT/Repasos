package SetyList.ArrayList.ArrayListts;

import java.util.LinkedList;

/**
 * Created by Juan Daniel on 19/07/2015.
 * ADD, REMOVE MAS RAPIDO, ITERACION MAS LENTA
 */
class Alumno{
    private String name;

    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class LinkedListt {
    public static void main(String... arhs){
        LinkedList<Alumno> linkedList = new LinkedList();
        linkedList.add(new Alumno("Pedro"));
        linkedList.add(new Alumno("Edgar trolazo"));
        linkedList.add(new Alumno("Manolo"));
        show(linkedList, "TODO");

        linkedList.addFirst(new Alumno("Primerizo"));
        show(linkedList, ".addFirst");

        System.out.println("El ultimo es: " + linkedList.getLast().getName());
    }

    public static void show(LinkedList<Alumno> alumno, String texto){
        System.out.println("["+texto+"]");
        for(Alumno a: alumno)
            System.out.println(a.getName());
    }
}
