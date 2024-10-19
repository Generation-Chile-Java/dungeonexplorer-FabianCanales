package RoomsAndStuff;


import EnemiesAndStuff.EnemigoBase;
import Interfaces.Room;
import PlayerStuff.PlayerStats;

public class EnemyRoom implements Room {
    private String Infosala = "Al entrar a esta sala puedes ver la presencia de 1 persona la cual te mira y se prepara para atacarte con una cuchara \n" +
            "Te has encontra un  Amargadito  " ;



    @Override
    public void Entrar(PlayerStats jugador) {
        System.out.println(jugador.getPlayerName() + "Entra a una sala  en la cual se siente una presencia   "  + Infosala);
        EnemigoBase Amargadito;

    }
}
