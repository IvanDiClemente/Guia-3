package Punto1;

public class Autobus implements Transporte{

    private int numeroLinea;
    private int capacidad;
    private final TipoTransporte tipo;


    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void anunciarParada(String parada){

        System.out.println("La siguiente parada: " + parada);

    }

    @Override
    public void arrancar() {
        System.out.println("Estoy arrancando brrummm");
    }

    @Override
    public void detener() {
        System.out.println("Estoy frenando HIIII, pii pii");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    @Override
    public String toString(){

        return "El vehiculo es un: " + tipo.name() + ", su numero es: " + numeroLinea + ", y su capacidad es: " +
                capacidad;

    }


    public Autobus(int numeroLinea, int capacidad, TipoTransporte tipo) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }


}
