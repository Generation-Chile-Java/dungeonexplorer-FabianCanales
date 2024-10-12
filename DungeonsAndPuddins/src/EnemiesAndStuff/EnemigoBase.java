package EnemiesAndStuff;

public class EnemigoBase {
    //Se definen los Stats base del prototipo de enemigo que las demas clases expandiran
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


    public EnemigoBase() {}

    public EnemigoBase(Integer vidaEnemigo, Integer mana, Integer danioEnemigo) {
        this.vidaEnemigo = vidaEnemigo;
        this.mana = mana;
        this.danioEnemigo = danioEnemigo;
    }
    public  void tauntEnemigo(){
        System.out.println("Estoy atacando");
    }

    public void ataqueEnemigo(){
         int ataquesaliente = danioEnemigo;
        System.out.println("Muere puddin Detestable");
    }
}

