package Punto2;

public class Pez {

    private boolean muerto=false;
    private boolean amistad=true;

    public boolean isMuerto(){return muerto;}
    public boolean isAmistad(){return amistad;}

    public void dormir(){
        System.out.println("Estoy durmiendo blu blu blu");
    }

    public Pez() {
    }
}
