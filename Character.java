public abstract class Character {

    String name;
    int maxHealth;
    int currentHealth;
    int attack;
    int defense;

    public Character(String name, int maxHealth, int attack, int defense) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }
    public int getAttack() {
        return attack;
    }   

    public int getDefense() {
        return defense;
    }

    public int getCurrentHealth() {
        return currentHealth;  
    }

}
