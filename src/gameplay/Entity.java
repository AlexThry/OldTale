package gameplay;

public abstract class Entity {
    private String name;
    private double posX;
    private double posY;
    private String sprite;

    /**
     * Une entité est un objet dont la position et l'état peuvent varier. Une entité peut avoir un comportement et peut avoir des interraction avec le reste du jeu.
     * @param name Nom de l'entité
     * @param posX Position X de l'entité
     * @param posY Position Y de l'entité
     * @param sprite Chemin vers le fichier image utilisé dans le jeu  >>  Pourra changer avec la classe DataBase je sais pas
     */
    public Entity(String name,  double posX, double posY, String sprite) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public String getSprite() {
        return sprite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
}
