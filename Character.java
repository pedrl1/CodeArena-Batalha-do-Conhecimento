public class Character {

    String name; //name
    int life; //life points will be int but will be from 0 ~ 1k
    String[] type; //aint that a RPG? so we have types! (idk if it is a RPG (yet))
    int damage; // as I said, life is from 0 to 1k so int will make it useful ( im not doing anything weird on the abilities)

    //constructor
    public Character(String name, int life, String[] type, int damage){
        this.name = name;
        this.life = life;
        this.type = type;
        this.damage = damage;
    }
}
