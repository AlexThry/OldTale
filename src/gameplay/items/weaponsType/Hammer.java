package gameplay.items.weaponsType;

import gameplay.items.Weapon;

public class Hammer extends Weapon {
    private double radius;
    public Hammer(String name, int rarity, int damage, double cooldown, double range, double radius) {
        super(name, rarity, damage, cooldown, range);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
