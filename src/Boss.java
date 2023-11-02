public class Boss {
    private int health;
    private int damage;
    private String defenseType;

    public Boss() {
        this.health = health;
        this.damage = damage;
        this.defenseType = defenseType;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int setDamage(int damage) {
        this.damage = damage;
        return damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public String setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return defenseType;
    }
}
