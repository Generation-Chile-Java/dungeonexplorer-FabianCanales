package Loot;

public class Loot {
    private String lootName;
    private String lootDescription;

    public String getLootName() {
        return lootName;
    }

    public void setLootName(String lootName) {
        this.lootName = lootName;
    }

    public String getLootDescription() {
        return lootDescription;
    }

    public void setLootDescription(String lootDescription) {
        this.lootDescription = lootDescription;
    }

    public Loot() {
    }

    public Loot(String lootName, String lootDescription) {
        this.lootName = lootName;
        this.lootDescription = lootDescription;
    }


    public void espadaObjeto(){
        this.lootName ="Espada de luz reveladora ";
        this.lootDescription ="Espada de luz reveladora creada por el pudin supremo  ";
    }
}

