package grande;

/**
 * Created by Juan Daniel on 16/07/2015.
 */
public class Empresario extends Persona{
    @Override
    void hola() {
        System.out.println("Soy un emrpesario");
    }

    private Long nss;
    private Double salario;
    enum Cargo{NUEVO,MEDIO,AVANZADO}
    private Cargo cargo;

    public Long getNss() {
        return nss;
    }


    public void setNss(Long nss) {
        this.nss = nss;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
