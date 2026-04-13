public class Question {

    String text;
    String[] alt;
    int difficulty;
    
    public Question(String text, String[] alt, int difficulty){
        this.text = text;
        this.alt = alt;
        this.difficulty = difficulty;
    }
}
