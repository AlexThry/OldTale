package gameplay.items;
import gameplay.Item;

public abstract class Weapon extends Item {
    private double damage;
    private double cooldown;
    private double range;
    private double stamina_cost;
    public Weapon(String name, int rarity, double damage, double cooldown, double range, double stamina_cost) {
        super(name, rarity);
        this.damage = damage;
        this.cooldown = cooldown;
        this.range = range;
        this.stamina_cost = stamina_cost;
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
