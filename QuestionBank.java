public class QuestionBank {

    private Question[] questions = {
        //very easy questions
        new Question("", new String[]{}, 1, 0),
        new Question("", new String[]{}, 1, 0),
        new Question("", new String[]{}, 1, 0),
        new Question("", new String[]{}, 1, 0),
        new Question("", new String[]{}, 1, 0),
        new Question("", new String[]{}, 1, 0),
        
        //easy questions
        new Question("", new String[]{}, 2, 0),
        new Question("", new String[]{}, 2, 0),
        new Question("", new String[]{}, 2, 0),
        new Question("", new String[]{}, 2, 0),
        new Question("", new String[]{}, 2, 0),
        new Question("", new String[]{}, 2, 0),
        
        //medium questions
        new Question("", new String[]{}, 3, 0),
        new Question("", new String[]{}, 3, 0),
        new Question("", new String[]{}, 3, 0),
        new Question("", new String[]{}, 3, 0),
        new Question("", new String[]{}, 3, 0),
        new Question("", new String[]{}, 3, 0),
        
        //hard questions
        new Question("", new String[]{}, 4, 0),
        new Question("", new String[]{}, 4, 0),
        new Question("", new String[]{}, 4, 0),
        new Question("", new String[]{}, 4, 0),
        new Question("", new String[]{}, 4, 0),
        new Question("", new String[]{}, 4, 0),
        
        //very hard questions
        new Question("", new String[]{}, 5, 0),
        new Question("", new String[]{}, 5, 0),
        new Question("", new String[]{}, 5, 0),
        new Question("", new String[]{}, 5, 0),
        new Question("", new String[]{}, 5, 0),
        new Question("", new String[]{}, 5, 0)
    };

    public Question[] getQuestions() {
        return questions;
    }

    public Question getQuestion(int index) {
        if (index >= 0 && index < questions.length) {
            return questions[index];
        }
        return null;
    }
}
