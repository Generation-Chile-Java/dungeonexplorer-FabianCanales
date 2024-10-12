package EnemiesAndStuff;

public class EnemigoBase {
    //Se definen los Stats base del prototipo de enemigo que las demas clases expandiran
    private String nombreEnemigo = "Amargaditos";
    private Integer vidaEnemigo;
    private Integer mana;
    private Integer danioEnemigo = 2 ;

    public Integer getVidaEnemigo() {
        return vidaEnemigo;
    }

    public void setVidaEnemigo(Integer vidaEnemigo) {
        this.vidaEnemigo = vidaEnemigo;
    }



    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getDanioEnemigo() {
        return danioEnemigo;
    }

    public void setDanioEnemigo(Integer danioEnemigo) {
        this.danioEnemigo = danioEnemigo;
    }


    public String getNombreEnemigo() {
        return nombreEnemigo;
    }

    public void setNombreEnemigo(String nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
    }

    public EnemigoBase() {
    }

    public EnemigoBase(String nombreEnemigo, Integer vidaEnemigo, Integer mana, Integer danioEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
        this.vidaEnemigo = vidaEnemigo;
        this.mana = mana;
        this.danioEnemigo = danioEnemigo;
    }

    public  void tauntEnemigo(){
        System.out.println("Te Comere entero  !  no dejare nada de ti !  ");
    }

    public void enemigoGetHurt(int danioJugador){
        this.vidaEnemigo = vidaEnemigo - danioJugador;
        if (vidaEnemigo > 0){
            System.out.println( nombreEnemigo + "Ha recibido " + danioJugador + " daño de Daño ");
        }else {
            System.out.println(nombreEnemigo + " Ha muerto por el daño causado ");
        }

    }


    public void ataqueEnemigo(){
        System.out.println("Muere puddin Detestable");
    }
}

