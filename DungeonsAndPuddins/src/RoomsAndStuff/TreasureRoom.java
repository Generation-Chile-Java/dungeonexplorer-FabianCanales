package RoomsAndStuff;


import Interfaces.Room;
import PlayerStuff.PlayerStats;

public class TreasureRoom implements Room {
    private String Tesoros = "DVD SHREK" ;
    private String Infosala ="Al entrar a la sala Ves Un cofre cerrado \n" +
            "Al abrir el cofre te encuentras con un objeto el cual no reconoces \n" +
            "Decides guartadelo ";

    public String getTesoros() {
        return Tesoros;
    }

    public void setTesoros(String tesoros) {
        Tesoros = tesoros;
    }

    public TreasureRoom() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Entrar(PlayerStats jugador) {
        System.out.println(jugador.getPlayerName() + "Entra a una sala  Extraña  "  + Infosala);
    }
}
