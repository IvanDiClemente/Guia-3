package Punto2;

public class Pez {

    private boolean muerto=false;
    private boolean amistad=true;

    public boolean isMuerto(){return muerto;}
    public boolean isAmistad(){return amistad;}

    public void dormir(){
        System.out.println("Estoy durmiendo blu blu blu");
    }

    public int atacar(boolean espada){

        if(!muerto) {
            if (espada) {

                System.out.println("RIP");
                amistad = false;
                muerto = true;
                return 1;

            } else {

                System.out.println("Ja no me diste tonto blu blu blu");
                amistad = false;
                return 0;

            }
        }
        return 0;
    }

    public Pez() {
    }
}
