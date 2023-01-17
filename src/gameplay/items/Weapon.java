package gameplay.items;
import gameplay.Item;

public abstract class Weapon extends Item {
    private double damage;
    private double cooldown;
    private double range;
    public Weapon(String name, int rarity, double damage, double cooldown, double range) {
        super(name, rarity);
        this.damage = damage;
        this.cooldown = cooldown;
        this.range = range;
    }

    public double getDamage() {
        return damage;
    }

    public double getCooldown() {
        return cooldown;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setCooldown(double cooldown) {
        this.cooldown = cooldown;
    }
}
