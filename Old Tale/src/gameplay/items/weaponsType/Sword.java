package gameplay.items.weaponsType;

import gameplay.items.Weapon;

public class Sword extends Weapon {
    int multiTarget;


    public Sword(String name, int rarity, double damage, double cooldown, int multiTarget) {
        super(name,rarity, damage, cooldown);
        this.multiTarget = multiTarget;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "multiTarget=" + multiTarget +
                '}';
    }

    public int getMultiTarget() {
        return multiTarget;
    }

    public void setMultiTarget(int multiTarget) {
        this.multiTarget = multiTarget;
    }
}
