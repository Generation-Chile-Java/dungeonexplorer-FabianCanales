package EnemiesAndStuff;

public class EnemigoBase {
    //Se definen los Stats base del prototipo de enemigo que las demas clases expandiran
    private Integer vidaActual ;
    private Integer armadura = 0;
    private Integer manaActual ;
    private Integer dañoBase = 2 ;

    public Integer getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(Integer vidaActual) {
        this.vidaActual = vidaActual;
    }

    public Integer getArmadura() {
        return armadura;
    }

    public void setArmadura(Integer armadura) {
        this.armadura = armadura;
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


    public EnemigoBase() {}

    public EnemigoBase(Integer vidaActual, Integer armadura, Integer manaActual, Integer dañoBase) {
        this.vidaActual = vidaActual;
        this.armadura = armadura;
        this.manaActual = manaActual;
        this.dañoBase = dañoBase;
    }
    public  void tautEnemigo(){
        System.out.println("Estoy atacando");
    }

    public void ataqueEnemigo(){
        System.out.println("Estoy atacando");
    }
}
