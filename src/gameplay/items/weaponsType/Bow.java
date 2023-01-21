package gameplay.items.weaponsType;

import gameplay.items.Weapon;

public class Bow extends Weapon {
    private int direction;
    public Bow(String name, int rarity, int damage, double cooldown, double range, double stamina_cost, int multi_direction) {
        super(name, rarity, damage, cooldown, range, stamina_cost);
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "direction=" + direction +
                '}';
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
