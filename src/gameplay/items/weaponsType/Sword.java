package gameplay.items.weaponsType;

import gameplay.items.Weapon;

public class Sword extends Weapon {
    int multi_target;

    /**
     *
     * @param name
     * @param rarity
     * @param damage
     * @param cooldown
     * @param range
     * @param multi_target
     */
    public Sword(String name, int rarity, double damage, double cooldown, double range, double stamina_cost, int multi_target) {
        super(name,rarity, damage, cooldown, range, stamina_cost);
        this.multi_target = multi_target;
    }


}
