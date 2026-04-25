public class Question {

    String text;
    String[] alternatives;
    int difficulty;
    int correctAltIndex;
    

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

    public boolean isCorrect(int altIndex) {
        return altIndex == correctAltIndex;
    }

    

}
