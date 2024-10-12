package Interfaces;



public interface DamageControl {
     Integer VidaDelJugador(Integer getPlayerHealt);

     //trae el daño del jugador para poder ser usado
     Integer traerDañoJugador(Integer getPlayerDamage);
     // trae el daño del enemigo para poder ser usado
     Integer traerDañoEnemigo(Integer getEnemigoDanio);

}
