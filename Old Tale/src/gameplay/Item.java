package gameplay;

public abstract class Item {
    private String name;
    private int rarity;
    public Item(String name, int rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public int getRarity() {
        return rarity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
}
