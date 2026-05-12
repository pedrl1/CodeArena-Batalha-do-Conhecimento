public class AnswerEvaluation extends Question {

    public AnswerEvaluation(String text, String[] alternatives, int difficulty, int correctAltIndex) {
        super(text, alternatives, difficulty, correctAltIndex);
    }   

    Question question;

    public boolean evaluateAnswer(int altIndex) {
        if (altIndex == question.getCorrectAltIndex()) {
            return true;
        }
        return false;
    }


}