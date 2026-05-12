public class Question {

    private String text;
    private String[] alternatives;
    private int difficulty;
    private int correctAltIndex;
    private int altIndex;
    

    public Question(String text, String[] alternatives, int difficulty, int correctAltIndex) {
        this.text = text;
        this.alternatives = alternatives;
        this.difficulty = difficulty;
        this.correctAltIndex = correctAltIndex;
        this.altIndex = altIndex;
    }

    public String getText() {
        return text;
    }

    public String[] getAlternatives() {
        return alternatives;
    }

    public int getDifficulty() {
        return difficulty;
    }
    
    public int getCorrectAltIndex() {
        return correctAltIndex;
    }
    public int getAltIndex() {
        return altIndex;
    }

    public boolean evaluateAnswer(int altIndex) {
        return altIndex == correctAltIndex;
    }
}
