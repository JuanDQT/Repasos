package instancias;

import java.util.ArrayList;

/**
 * Created by Juan Daniel on 22/07/2015.
 */
abstract class Religion{
    private String dios;

    public void rezar(){
        System.out.println("Rezando a su dios");
    }

    public String getDios() {
        return dios;
    }

    public void setDios(String dios) {
        this.dios = dios;
    }
}

class Cristianismo extends Religion{

    public void irIglesia(){
        System.out.println("El cristianismo reza en la iglesia");
    }
}

class Musulman extends Religion{
    public void irMezquita(){
        System.out.println("Los musulmanes van a la mezquita");
    }
}

public class test {
    public static void main(String[] args) {
        ArrayList<Religion> treeSet = new ArrayList<>();
        Religion c = new Cristianismo();
        Religion m = new Musulman();

        c.setDios("Jesucristo");
        m.setDios("Ala");

        treeSet.add(c);
        treeSet.add(m);

        for(Religion r: treeSet){
            System.out.println(r.getDios());
            if(r instanceof Cristianismo){
                ((Cristianismo) r).irIglesia();
            }
            else if (r instanceof Musulman){
                ((Musulman) r).irMezquita();
            }
        }


    }
}
