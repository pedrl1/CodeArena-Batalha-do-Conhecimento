public class AnswerEvaluation extends Question {

    public AnswerEvaluation(String text, String[] alternatives, int difficulty, int correctAltIndex) {
        super(text, alternatives, difficulty, correctAltIndex);
    }   

    boolean evaluateAnswer(int altIndex) {
        if (altIndex == correctAltIndex) {
            return true;
        }
        return false; // Incorrect answer
    }


}