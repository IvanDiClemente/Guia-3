package Punto1;

public class Bicicleta implements Transporte{

    private String numeroSerie;
    private final TipoTransporte tipo;

    public TipoTransporte getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void ajustarAsiento(int altura){
        System.out.println("Estoy ajustando el asiento a la altura: " + altura);
    }

    @Override
    public void arrancar() {
        System.out.println("Estoy arrancando ring ring");
    }

    @Override
    public void detener() {
        System.out.println("Estoy frenando SKSHHHH hey mira por donde vas!");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public Bicicleta(String numeroSerie, TipoTransporte tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }
}
