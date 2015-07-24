package objetos;

import java.util.List;

/**
 * Created by Juan Daniel on 10/07/2015.
 */
public class Combate {
    private static int turno = 0;
    private static int value = 1;

    public void lucha(List<Humanoide> humanoides){
        while(humanoides.get(0).getSalud()>0 && humanoides.get(1).getSalud()>0){
            System.out.println("["+humanoides.get(turno).getName() + " ataca a "+ humanoides.get(turno+value).getName()+"]");
            humanoides.get(turno + value).setSalud(humanoides.get(turno + value).getSalud() - humanoides.get(turno).getDamage());
            System.out.println(humanoides.get(turno).getName() + " le inflige " + humanoides.get(turno).getDamage() + " p. de dano a " + humanoides.get(turno + value).getName());
            System.out.println("Salud de "+ humanoides.get(turno+value).getName() + " : " + humanoides.get(turno+value).getSalud());
            ++turno;
            if(turno==1)
                value = -1;
            else if (turno== 2) {
                turno = 0;
                value = 1;
            }
        }

        for(Humanoide  h: humanoides){
            if(h.getSalud()>0)
                System.out.println("Ganador: "+h.getName());
        }

    }


}
