package Punto2;

public class Murcielago implements Caracteristicas{

    private static int alimentado=0;
    private boolean muerto=false;
    private boolean comio=false;
    private boolean amistad=false;

    public boolean isMuerto(){return muerto;}

    public boolean isAmistad(){return amistad;}


    public boolean comer(int comida){

        if(comida!=0){

            alimentado++;
            comio=true;
            amistad=true;
            System.out.println("Ñam ñam carne chirp");

        }

        if(alimentado==2){
            System.out.println("Gracias por alimentarme tanto! Ahora soy grande y fuerte, vas a morir >:)");
            return true;
        }

        return false;
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando chirp chirp");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo zzz chirp chirp chirp");
    }

    public Murcielago() {
    }
}
