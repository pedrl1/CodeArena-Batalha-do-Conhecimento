public class BattleManager {

    Round round = new Round(1, 3);
    QuestionBank question = new QuestionBank();
    ScoreSystem scoreSystem = new ScoreSystem(0);   

    public void startBattle() {

        if (round.getRoundNumber() == 1) {
            //attack phase 
            question.askQuestion();
            scoreSystem.updateScore();
            System.out.println("Your current score is: " + scoreSystem.getScore());
        } 

        else if (round.getRoundNumber() == 2) {
            //the fucking logic goes here, but i dont know how to do it yet, so i will leave it for later again
        }

        else if (round.getRoundNumber() == 3) {
            //the fucking logic goes here, but i dont know how to do it yet, so i will leave it for later again again 
        }
    }
    
}
