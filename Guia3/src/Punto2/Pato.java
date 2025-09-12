package Punto2;

public class Pato implements Caracteristicas{

    private boolean muerto=false;
    private boolean comio=false;
    private boolean amistad=false;

    public boolean isMuerto(){return muerto;}

    public boolean isAmistad(){return amistad;}

    public void comer(boolean semillas){
        if(semillas==true){
            System.out.println("Estoy comiendo semillitas ñam ñam cuak");
        }
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando cuak cuak");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo zzz cuak cuak cuak");
    }

    public Pato() {
    }
}
