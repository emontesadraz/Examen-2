
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Singleton miUnicaInstancia = Singleton.getInstance();
        System.out.println("¡Hola! Bienvenido al juego. Por favor,  introduce tu nombre: ");
        miUnicaInstancia.setAlias(sc.nextLine());
        System.out.println("Bien, "+miUnicaInstancia.getAlias()+", las reglas on muy sencillas:\nVas a tener que adivinar un numero aleatorio del 1 al 10\nTendrás dos intentos como máximo\nUna partida tendrá 10 rondas\n¡Disfruta campeón! ");
        miUnicaInstancia.setNumeroAleatorio(random.nextInt(10)+1);
        miUnicaInstancia.setNumeroPropuesto(sc.nextInt());
        miUnicaInstancia.setIntentosMax(2);
        miUnicaInstancia.setRondasPartida(0);
        miUnicaInstancia.setFallos(2);
        do {
            if (miUnicaInstancia.getNumeroAleatorio() != miUnicaInstancia.getNumeroPropuesto() && miUnicaInstancia.getIntentosMax() > 0 ){

            }else if (miUnicaInstancia.getNumeroAleatorio() > miUnicaInstancia.getNumeroPropuesto()){
                System.out.println("El numero a adivinar es mayor");
                 int fallos;
            }
        }while(miUnicaInstancia.getRondasPartida() <= 10);



    }
}