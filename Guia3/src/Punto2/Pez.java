package Punto2;

public class Pez {

    private boolean muerto=false;
    private boolean amistad=false;

    public boolean isMuerto(){return muerto;}
    public boolean isAmistad(){return amistad;}

    public void dormir(){

        if(!muerto) {
            System.out.println("Estoy durmiendo blu blu blu");
            amistad=true;
        }else{
            System.out.println("Esta muertisimo");
        }

    }

    public int atacar(boolean espada){

        if(!muerto) {
            if (espada) {

                System.out.println("RIP");
                System.out.println("+1 de carne");
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
