package Punto2;

public class Protagonista implements Caracteristicas{

    private int comida=0;
    private boolean semillas=false;
    private String nombre;
    private boolean espada=false;
    private boolean muerto=false;


    public boolean isMuerto(){
        return muerto;
    }

    public int getComida() {
        return comida;
    }

    public boolean isSemillas() {
        return semillas;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEspada() {
        return espada;
    }

    public void morir(){
        muerto=true;
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo");
    }

    public Protagonista(String nombre) {
        this.nombre = nombre;
    }

}
