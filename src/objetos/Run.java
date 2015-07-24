package objetos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Daniel on 10/07/2015.
 */
public class Run {


    public static void main(String... args){
        Humanoide orco = new Humanoide();
        orco.setName("Thrall");
        orco.setSalud(700.);
        orco.setMana(900L);
        orco.setDamage(40.);
        orco.setBando(Bando.HORDA);

        Humanoide humano = new Humanoide();
        humano.setName("Uther");
        humano.setSalud(700.);
        humano.setMana(450L);
        humano.setDamage(38.);
        humano.setBando(Bando.ALIANZA);

        List<Humanoide> humanoides = new ArrayList<>();
        Combate c = new Combate();

        humanoides.add(orco);
        humanoides.add(humano);

        for(Humanoide h: humanoides){
            System.out.println("Mi nombre es: "+ h.getName());
            System.out.println("Salud: "+h.getSalud());
            System.out.println("Mana: "+h.getMana());
            System.out.println("Bando: "+h.getBando());
        }

        c.lucha(humanoides);


    }
}
