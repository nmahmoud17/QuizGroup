public class ScoreKeeper {

    private int score = 0;


    public void increaseScore(){
        score +=1;
    }

    public void decreaseScore(){
        score-=1;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
