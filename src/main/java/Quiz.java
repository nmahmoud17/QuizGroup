import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {


    private QuestionBank questionsList = new QuestionBank();
    private ScoreKeeper scoreKeeper;
    private QuizQuestion quizQuestion;


    public QuizQuestion retrieveQuestionAndAnswerAndRemoveFromBank() {
        Collections.shuffle(questionsList.getQuestionsArray());
        QuizQuestion question = questionsList.getQuestionsArray().get(0);
        questionsList.getQuestionsArray().remove(0);
        return question;
    }

    public void checkAnswer (String userAnswer){
        if (userAnswer.equalsIgnoreCase()){
            scoreKeeper.increaseScore();
            System.out.println("Woo, right on! Your score is now: " + scoreKeeper.getScore());
        } else {
            System.out.println("Sorry, wrong answer!");
            scoreKeeper.decreaseScore();
            System.out.println("Score: " + scoreKeeper.getScore());
        }

    }


    public QuestionBank getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(QuestionBank questionsList) {
        this.questionsList = questionsList;
    }

    public ScoreKeeper getScoreKeeper() {
        return scoreKeeper;
    }

    public void setScoreKeeper(ScoreKeeper scoreKeeper) {
        this.scoreKeeper = scoreKeeper;
    }
}
