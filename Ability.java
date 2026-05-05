public class Ability {

    int enumIndex;
    String[] abilities = {"PEN", "BOOK", "NOTEBOOK", "CALCULATOR","LAPTOP"};

    public Ability(int enumIndex, String[] abilities) {
        this.enumIndex = enumIndex;
        this.abilities = abilities;
    }

    public int getEnumIndex() {
        return enumIndex;
    }


}
