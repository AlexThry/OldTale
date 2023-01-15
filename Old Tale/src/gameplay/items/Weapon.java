package gameplay.items;
import gameplay.Item;

public abstract class Weapon extends Item {
    private double damage;
    private double cooldown;
    public Weapon(String name, int rarity, double damage, double cooldown) {
        super(name, rarity);
        this.damage = damage;
        this.cooldown = cooldown;
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
