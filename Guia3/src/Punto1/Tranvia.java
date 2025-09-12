package Punto1;

public class Tranvia implements Transporte{

    private String ruta;
    private int capacidad;
    private final TipoTransporte tipo;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void cambiarDeVia(int nuevaVia){
        System.out.println("Estamos cambiando a la via: " + nuevaVia);
    }

    @Override
    public void arrancar() {
        System.out.println("Estamos arrancando bzzzzttt");
    }

    @Override
    public void detener() {
        System.out.println("Estamos frenando SKREEEEE");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }


    public Tranvia(String ruta, int capacidad, TipoTransporte tipo) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
}
