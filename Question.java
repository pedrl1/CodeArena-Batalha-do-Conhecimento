public class Question {

    private String text;
    private String[] alternatives;
    private int difficulty;
    private int correctAltIndex;
    

    public Question(String text, String[] alternatives, int difficulty, int correctAltIndex) {
        this.text = text;
        this.alternatives = alternatives;
        this.difficulty = difficulty;
        this.correctAltIndex = correctAltIndex;
    }

    public String getText() {
        return text;
    }

    public String[] getAlternatives() {
        return alternatives;
    }
}
