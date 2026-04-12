public class Round {
    int roundIndex;

    public Round(int roundIndex){
        this.roundIndex = roundIndex;
    }
    
    public void nextRound(int roundIndex){
        roundIndex++;
    }

    public void resetRound(int roundIndex){
        roundIndex = 0;
    }
}
