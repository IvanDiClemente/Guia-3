package Punto2;

public class Pato implements Caracteristicas{

    private boolean muerto=false;
    private boolean amistad=false;

    public boolean isMuerto(){return muerto;}

    public boolean isAmistad(){return amistad;}

    public void comer(boolean semillas){
        if(semillas==true){
            System.out.println("Estoy comiendo semillitas ñam ñam cuak cuak, eres un grande ;D");
            amistad=true;
        }else{
            System.out.println("Que me ofreces? No tenes nada, pobre");
        }
    }

    public int atacar(boolean espada){

        if(!muerto) {
            if(espada) {

                System.out.println("RIP");
                amistad = false;
                muerto = true;
                return 1;

            } else {

                System.out.println("No me diste, malvado demonio, CUAK CUAK");
                amistad = false;
                return 0;

            }
        }else {
            return 0;
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
