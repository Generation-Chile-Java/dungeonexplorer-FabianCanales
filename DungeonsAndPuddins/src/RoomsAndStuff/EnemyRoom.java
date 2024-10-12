package RoomsAndStuff;


import EnemiesAndStuff.EnemigoBase;
import Interfaces.Room;
import PlayerStuff.PlayerStats;

public class EnemyRoom implements Room {
    private String Infosala = "Esta sala se encuentra completamente vacia " ;
    EnemigoBase Amargadito;


    @Override
    public void Entrar(PlayerStats jugador) {
        System.out.println();

    }
}
