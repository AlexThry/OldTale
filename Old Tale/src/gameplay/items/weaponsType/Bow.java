package gameplay.items.weaponsType;

import gameplay.items.Weapon;

public class Bow extends Weapon {
    private double range;
    public Bow(String name, int rarity, int damage, double cooldown, double range) {
        super(name, rarity, damage, cooldown);
        this.range = range;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "range=" + range +
                '}';
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }
}
