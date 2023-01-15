package gameplay.items;

import gameplay.Item;

public abstract class Armor extends Item {
    private int protection;

    public Armor(String name, int rarity, int protection) {
        super(name, rarity);
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }
}
