package clase13;

public abstract class SistemaArmas {

    private Integer energia;

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

    public void mostrar() {
        System.out.println(
                this.toString()
        );
    }

    @Override
    public String toString() {
        return "SistemaArmas{" +
                "energia=" + energia +
                '}';
    }
}
