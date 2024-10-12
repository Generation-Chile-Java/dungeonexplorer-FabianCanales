package PlayerStuff;

import Interfaces.GameObject;

import java.util.ArrayList;
import java.util.List;

public class PlayerStats implements GameObject {
    // Definiendo los Stats que el jugador tendra durante el juego  [A futuro si agrego clases el usuario tendra stats distintos basados en la clase que elija ]
    private String playerName;
    private  Integer vidaJugador = 10;
    private  Integer mana = 15 ;
    private Integer daniojugador = 2 ;
    private List<String> inventario = new ArrayList<String>();

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
    public Integer getDaniojugador() {
        return daniojugador;
    }

    public void setDaniojugador(Integer daniojugador) {
        this.daniojugador = daniojugador;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public void setInventario(List<String> inventario) {
        this.inventario = inventario;
    }

    public PlayerStats() {
    }

    public PlayerStats(String playerName, Integer vidaJugador, Integer manaMaximo, Integer daniojugador, List<String> inventario) {
        this.playerName = playerName;
        this.vidaJugador = vidaJugador;
        this.mana = manaMaximo;
        this.daniojugador = daniojugador;
        this.inventario = inventario;
    }

    // Usada para mostrar los stats del jugador
  public void PlayerStatDisplay(){
      System.out.println(playerName + "" + " Tiene la siguiente cantidad de vida " + vidaJugador +" '\n'"  + "Actualmente Haces el siguiente daño " + daniojugador +" ♥  De daño  ");
    }

    // ingresar objeto al inventario
    public void IgresarAlInventario(String objeto){
        inventario.add(objeto);
        System.out.println("Recibiste el siguiente objeto" + objeto);

    }

    //Inventario inicial jugador

    public List<String> InicializarInventario(){
        inventario.add("AWA");
        inventario.add("Piedra fea");
        inventario.add("Nota Sin Sentido");
        return inventario;
    }

    //Permite al jugador recibir daño
    public void jugadorRecibeDaño(Integer danioEnemigo){
        this.vidaJugador = vidaJugador - danioEnemigo;
        System.out.println("Recibiste " + danioEnemigo + " De daño ");
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "playerName='" + playerName + '\'' +
                ", vidaJugador=" + vidaJugador +
                ", mana=" + mana +
                ", dañojugador=" + daniojugador +
                ", inventario=" + inventario +
                '}';
    }

    @Override
    public void tomarObjeto(String objeto) {
        System.out.println("Tomas el objeto" + objeto );
        inventario.add(objeto);

    }

    @Override
    public void mostrarInfoObjeto(String objetoDescripcion) {
        System.out.println(objetoDescripcion);

    }
}
