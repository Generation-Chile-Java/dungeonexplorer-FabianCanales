package PlayerStuff;

import EnemiesAndStuff.EnemigoBase;
import Interfaces.DamageControl;

import java.util.List;

public class PlayerStats  {
    // Definiendo los Stats que el jugador tendra durante el juego  [A futuro si agrego clases el usuario tendra stats distintos basados en la clase que elija ]
    private String playerName;
    private  Integer vidaJugador = 10;
    private  Integer mana = 15 ;
    private Integer dañojugador = 2 ;
    private List<String> inventario;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getVidaJugador() {
        return vidaJugador;
    }

    public void setVidaJugador(Integer vidaJugador) {
        this.vidaJugador = vidaJugador;
    }
    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }
    public Integer getDañojugador() {
        return dañojugador;
    }

    public void setDañojugador(Integer dañojugador) {
        this.dañojugador = dañojugador;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public void setInventario(List<String> inventario) {
        this.inventario = inventario;
    }

    public PlayerStats() {
    }

    public PlayerStats(String playerName, Integer vidaJugador, Integer manaMaximo, Integer dañojugador, List<String> inventario) {
        this.playerName = playerName;
        this.vidaJugador = vidaJugador;
        this.mana = manaMaximo;
        this.dañojugador = dañojugador;
        this.inventario = inventario;
    }

    // Usada para mostrar los stats del jugador
  public void PlayerStatDisplay(){
      System.out.println(playerName + "" + " Tiene la siguiente cantidad de vida " + vidaJugador +" '\n'"  + "Actualmente Haces el siguiente daño " + dañojugador +" ♥  De daño  ");
    }
    // ingresar objeto al inventario
    public void IgresarAlInventario(String objeto){
        inventario.add(objeto);
        System.out.println("Recibiste el siguiente objeto" + objeto);

    }
    //Permite al jugador recibir daño
    public void jugadorRecibeDaño(Integer dañoEnemigo){
        this.vidaJugador = vidaJugador -dañoEnemigo ;
        System.out.println("Recibiste " + dañoEnemigo + " De daño ");
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "playerName='" + playerName + '\'' +
                ", vidaJugador=" + vidaJugador +
                ", mana=" + mana +
                ", dañojugador=" + dañojugador +
                ", inventario=" + inventario +
                '}';
    }
}
