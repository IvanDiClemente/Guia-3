import Punto1.Autobus;
import Punto1.Bicicleta;
import Punto1.TipoTransporte;
import Punto1.Tranvia;
import Punto2.Murcielago;
import Punto2.Pato;
import Punto2.Pez;
import Punto2.Protagonista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        // Guia 3 Punto 1

        //DECLARACIONES
        Autobus autobus=new Autobus(551, 40, TipoTransporte.AUTOBUS);
        Tranvia tranvia=new Tranvia("El Camino", 60, TipoTransporte.TRANVIA);
        Bicicleta bicicleta=new Bicicleta("223", TipoTransporte.BICICLETA);
        //DECLARACIONES

        autobus.arrancar();
        autobus.detener();
        System.out.println("La capacidad es: " + autobus.obtenerCapacidad());

        tranvia.arrancar();
        tranvia.detener();
        System.out.println("La capacidad es: " + tranvia.obtenerCapacidad());

        bicicleta.arrancar();
        bicicleta.detener();
        System.out.println("La capacidad es: " + bicicleta.obtenerCapacidad());

        System.out.println("Autobus: " + autobus.getTipo());
        System.out.println("Tranvia: " + tranvia.getTipo());
        System.out.println("Bicicleta: " + bicicleta.getTipo());

        // Guia 3 Punto 1




        // Guia 3 Punto 2

        //DECLARACIONES
        Protagonista protagonista=new Protagonista("Zalmo");
        Pato pato=new Pato();
        Murcielago murcielago=new Murcielago();
        Pez pez=new Pez();
        boolean flag=false;
        int eleccion=0;
        Scanner scanner=new Scanner(System.in);
        boolean juego=false;
        int i;
        boolean maldadWin=false;
        boolean basura;

        //DECLARACIONES

        System.out.println("Bienvenido/a a un mundo fantastico llamado 'Planeta Tierra', donde hay animales" +
                " increiblemente magicos que hacen cosas re magicas, se te van a dar opciones para tomar decisiones");

        while(!juego){

            System.out.println("Te encontras en un prado con 3 caminos yendo a distintos lugares.");
            System.out.println("1-Ir a la charca");
            System.out.println("2-Ir a la cueva");
            System.out.println("3-Ir a el mar");
            System.out.println("4-Investigar");

            eleccion= scanner.nextInt();

            switch(eleccion){

                case 1:

                    while(eleccion!=6) {

                        if (pato.isMuerto()) {

                            System.out.println("El pato ya esta muerto maldito");
                            eleccion=6;

                        } else {
                            System.out.println("En la charca te encontras un pato");
                            System.out.println("1-Hablarle");
                            System.out.println("2-Atacarlo");
                            System.out.println("3-Darle semillas");
                            System.out.println("6-Irte");
                            eleccion = scanner.nextInt();


                            switch (eleccion) {

                                case 1:

                                    if(!pato.isMuerto()){
                                        pato.caminar();
                                    }else{

                                        System.out.println("Esta muerto.............");

                                    }


                                    break;
                                case 2:

                                    System.out.println("Atacas al pato");
                                    i=pato.atacar(protagonista.isEspada());
                                    protagonista.setComida(i);
                                    eleccion=6;

                                    break;
                                case 3:

                                    System.out.println("Le das semillas al pato:");
                                    pato.comer(protagonista.isSemillas());
                                    protagonista.setSemillas(false);

                                    break;
                                case 6:

                                    System.out.println("Te retiras de la charca");

                                    break;
                                default:
                                    System.out.println("Eleccion incorrecta");
                                    break;

                            }

                        }
                    }
                    break;

                case 2:

                    while(eleccion!=6) {

                        if (murcielago.isMuerto()) {

                            System.out.println("Se encuentra tirado boca arriba, con una herida en el pecho");
                            eleccion = 6;

                        } else {

                            System.out.println("En la cueva te encontras un murcielago!");
                            System.out.println("1-Hablarle");
                            System.out.println("2-Atacarlo");
                            System.out.println("3-Darle carne");
                            System.out.println("6-Irte");
                            eleccion = scanner.nextInt();

                            switch(eleccion) {

                                case 1:

                                    if(!murcielago.isMuerto()) {
                                        if (murcielago.isAmistad()) {

                                            System.out.println("Muchas gracias por la carne amigo mio! Por el poder de la maldad, ahora eres todo poderoso!");
                                            maldadWin = true;
                                            eleccion = 6;

                                        } else {
                                            System.out.println("No me interesa hablar con vos >:( ÑAM");
                                            protagonista.morir();
                                            eleccion = 6;
                                        }
                                    }else{
                                        System.out.println("No hay con quien hablar");
                                    }

                                    break;

                                case 2:

                                    basura= murcielago.atacar(protagonista.isEspada());

                                    break;

                                case 3:

                                    if(murcielago.comer(protagonista.getComida())){
                                        protagonista.morir();
                                        protagonista.setComida(-1);
                                        eleccion = 6;
                                    } else {
                                        protagonista.setComida(-1);
                                    }

                                    break;

                                case 6:

                                    System.out.println("Te vas de la cueva");

                                    break;

                                default:
                                    System.out.println("Opcion incorrecta");
                                    break;

                            }


                        }

                    }

                case 3:

                    while(eleccion!=6){

                        System.out.println("En el mar te encontras un pez");
                        System.out.println("1-Hablarle");
                        System.out.println("2-Atacarle");
                        System.out.println("6-Irte");
                        eleccion= scanner.nextInt();

                        switch(eleccion){

                            case 1:

                                pez.dormir();

                                break;

                            case 2:

                                if(pez.isMuerto()){

                                    System.out.println("Esta muerto");
                                    eleccion=6;

                                }else{

                                    pez.atacar(protagonista.isEspada());
                                    eleccion=6;

                                }

                                break;


                        }

                    }


                    break;

                case 4:

                    if(!flag) {
                        System.out.println("Investigando te encuentras unas semillas!");
                        protagonista.setSemillas(true);
                        flag=true;
                    }else {
                        System.out.println("Investigando encontras una espada!");
                        protagonista.setEspada();
                    }

                    break;

                default:
                    System.out.println("Eleccion incorrecta >:(");
                    break;

            }

            if(pato.isAmistad() && murcielago.isMuerto() && pez.isAmistad()){
                System.out.println("Ganaste el juego! Omedetō!");
                juego=true;
            }else if(protagonista.isMuerto()){
                System.out.println("Te moriste! GAME OVER");
                juego=true;
            } else if (maldadWin){
                System.out.println("Ganaste el juego! final malvado >:)");
                juego=true;
            }else if(pato.isMuerto() && murcielago.isMuerto() && pez.isMuerto()){

                System.out.println("Ganaste el juego, final genocida >:))))");
                juego=true;

            }

        }




        // Guia 3 Punto 2
*/

    }
}