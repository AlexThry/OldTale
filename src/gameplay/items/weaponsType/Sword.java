package gameplay.items.weaponsType;

import gameplay.items.Weapon;

public class Sword extends Weapon {
    int multi_target;


    public Sword(String name, int rarity, double damage, double cooldown, double range, int multi_target) {
        super(name,rarity, damage, cooldown, range);
        this.multi_target = multi_target;
    }


}
