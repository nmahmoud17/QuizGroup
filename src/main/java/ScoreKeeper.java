public class ScoreKeeper {

    private int scoreKeeper;
    QuestionBank bank = new QuestionBank();


    public int getScoreKeeper() {
        return scoreKeeper;
    }

    public void setScoreKeeper(int scoreKeeper) {
        this.scoreKeeper = scoreKeeper;
    }

    public  void scoreTracker(QuizQuestion quizAnswer, String userAnswer) {
        int counter = 0;
        for (int i=0; i<bank.questionsArray.size(); i++)
        if (quizAnswer.getAnswer().equalsIgnoreCase(userAnswer)) {
            counter++;

            System.out.println("You just gained a point! Your score is: " + counter);

        } else {
            counter--;
            System.out.println("Wrong userAnswer! Your score is now: " + counter);
        }

    }

}
