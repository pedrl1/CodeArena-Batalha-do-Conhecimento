public class Enemy extends Character {

    public Enemy(String name, int maxHealth, int attack, int defense) {
        super(name, maxHealth, attack, defense);
    }

    Character[] enemy = {
        
        new Enemy(null, 150, null, null), // very easy normal enemy
        new Enemy(null, 200, null, null), // very easy boss

        new Enemy(null, 250, null, null), // easy normal enemy 
        new Enemy(null, 300, null, null), // easy boss

        new Enemy(null, 350, null, null), // medium normal enemy
        new Enemy(null, 400, null, null), // medium boss

        new Enemy(null, 500, null, null), // hard normal enemy
        new Enemy(null, 1000, null, null), // hard boss

        new Enemy(null, 1500, null, null), // very hard normal enemy
        new Enemy(null, 2000, null, null) // very hard boss
    };

    Character getEnemy(int index) {
        if (index >= 0 && index < enemy.length) {
            return enemy[index];
        }
        return null; // Return null if index is out of bounds
    }
    

}
