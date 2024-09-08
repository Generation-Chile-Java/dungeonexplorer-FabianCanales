package PlayerStuff;

import java.util.Map;

public class PlayerStats {
    // Definiendo los Stats que el jugador tendra durante el juego  [A futuro si agrego clases el usuario tendra stats distintos basados en la clase que elija ]
    private String playerName;
    private  Integer vidaMaxima = 150;
    private Integer vidaActual ;
    private Integer vidaInicial ;
    private Integer armadura = 0;
    private  Integer manaMaximo = 150 ;
    private Integer manaActual ;
    private Integer dañoBase = 2 ;
    private Map<String, Integer> inventario;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(Integer vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public Integer getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(Integer vidaActual) {
        this.vidaActual = vidaActual;
    }

    public Integer getVidaInicial() {
        return vidaInicial;
    }

    public void setVidaInicial(Integer vidaInicial) {
        this.vidaInicial = vidaInicial;
    }

    public Integer getArmadura() {
        return armadura;
    }

    public void setArmadura(Integer armadura) {
        this.armadura = armadura;
    }

    public Integer getManaMaximo() {
        return manaMaximo;
    }

    public void setManaMaximo(Integer manaMaximo) {
        this.manaMaximo = manaMaximo;
    }

    public Integer getManaActual() {
        return manaActual;
    }

    public void setManaActual(Integer manaActual) {
        this.manaActual = manaActual;
    }

    public Integer getDañoBase() {
        return dañoBase;
    }

    public void setDañoBase(Integer dañoBase) {
        this.dañoBase = dañoBase;
    }

    public Map<String, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(Map<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public PlayerStats() {
    }

    public PlayerStats(String playerName, Integer vidaMaxima, Integer vidaActual, Integer vidaInicial, Integer armadura, Integer manaMaximo, Integer manaActual, Integer dañoBase, Map<String, Integer> inventario) {
        this.playerName = playerName;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaActual;
        this.vidaInicial = vidaInicial;
        this.armadura = armadura;
        this.manaMaximo = manaMaximo;
        this.manaActual = manaActual;
        this.dañoBase = dañoBase;
        this.inventario = inventario;
    }

    public void playerAtack(){
        System.out.println("Estoy atacando ");
    }
    public void playerTaunt(){
        System.out.println("Te estoy insultando");
    }
    public void playerDie(){
        System.out.println("Estoy Muerto");
    }

}
