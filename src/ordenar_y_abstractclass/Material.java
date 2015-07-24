package ordenar_y_abstractclass;

/**
 * Created by Juan Daniel on 10/07/2015.
 */
public abstract class Material implements Comparable<Material>{
    private String name;

    private Long costo;

    public Material() {
    }

    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCosto() {
        return costo;
    }

    public void setCosto(Long costo) {
        this.costo = costo;
    }

    public abstract void accion();

    public int compareTo(Material o) {
        return name.compareTo(o.getName());
    }


}
