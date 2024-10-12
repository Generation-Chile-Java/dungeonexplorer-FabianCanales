package RoomsAndStuff;

import Interfaces.Room;
import PlayerStuff.PlayerStats;

public class EmptyRoom implements Room {

    //Sala completamente vacia
   private String Infosala = "Esta sala se encuentra completamente vacia " ;

    public String getInfosala() {
        return Infosala;
    }

    public void setInfosala(String infosala) {
        Infosala = infosala;
    }

    public EmptyRoom(String infosala) {
        Infosala = infosala;
    }
    public EmptyRoom() {}

    @Override
    public void Entrar(PlayerStats jugador) {
        System.out.println(jugador + "Entra a " + Infosala);

    }
}
