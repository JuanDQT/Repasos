package objetos;


/**
 * Created by Juan Daniel on 10/07/2015.
 */
public class Humanoide {
    private String      name;
    private Double      salud;
    private Long        mana;
    private Double      damage;

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    private Bando bando;

    public Bando getBando() {
        return bando;
    }

    public void setBando(Bando bando) {
        this.bando = bando;
    }

    public Humanoide() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Long getMana() {
        return mana;
    }

    public void setMana(Long mana) {
        this.mana = mana;
    }

}
