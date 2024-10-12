import PlayerStuff.PlayerStats;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner playerSC = new Scanner(System.in);
        PlayerStats jugador = new PlayerStats();
        System.out.println("Bienvenido A Pudines y mazmorras \n En Este juego tomaras el control de nuestro querido heroe \n El puddin con bigote \n O valiente puddin con bigote Por favor Dinos tu nombre ");
        jugador.setPlayerName(playerSC.nextLine());
        System.out.println("Acontinuacion ");
        System.out.println(jugador.InicializarInventario());
        jugador.PlayerStatDisplay();
    }

}