public class ScoreSystem {
    int score;

    public ScoreSystem(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void addPoints(int points) {
        score += points;
    }
}
