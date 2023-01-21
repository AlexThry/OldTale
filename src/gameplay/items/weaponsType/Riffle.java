package gameplay.items.weaponsType;

import gameplay.items.Weapon;

public class Riffle extends Weapon {
    private double penetration;
    public Riffle(String name, int rarity, double damage, double cooldown,double range, double stamina_cost, double penetration) {
        super(name, rarity, damage, cooldown, range, stamina_cost);
        this.penetration = penetration;
    }

    @Override
    public String toString() {
        return "Riffle{" +
                "penetration=" + penetration +
                '}';
    }

    public double getPenetration() {
        return penetration;
    }

    public void setPenetration(double penetration) {
        this.penetration = penetration;
    }
}
