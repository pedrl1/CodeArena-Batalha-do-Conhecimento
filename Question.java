public class Question {

    QuestionBank[] questions = new QuestionBank[30];
    String text;
    String altText;
    int altValue;

    public Question(String text, String altText, int altValue){
        this.text = text;
        this.altText = altText;
        this.altValue = altValue;
    }
    
}
