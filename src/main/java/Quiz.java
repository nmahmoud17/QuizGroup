import java.util.Collections;
import java.util.Scanner;


public class Quiz {


    private QuestionBank questionsList = new QuestionBank();
    private ScoreKeeper scoreKeeper = new ScoreKeeper();
    private QuizQuestion quizQuestion;
    private Scanner myScanner = new Scanner(System.in);


    public QuizQuestion retrieveQuestionAndAnswerAndRemoveFromBank() {
        Collections.shuffle(questionsList.getQuestionsArray());
        QuizQuestion question = questionsList.getQuestionsArray().get(0);
        questionsList.getQuestionsArray().remove(0);
        return question;
    }

    public void checkAnswer(QuizQuestion answer, String userAnswer) {
        if (userAnswer.equalsIgnoreCase(answer.getAnswer())) {
            scoreKeeper.increaseScore();
            System.out.println("Woo, right on! Your score is now: " + scoreKeeper.getScore());
        } else {
            System.out.println("Sorry, wrong answer!");
            scoreKeeper.decreaseScore();
            System.out.println("Score: " + scoreKeeper.getScore());
        }

    }

    public void startQuiz() {

        System.out.println("Welcome to the quiz game, what is your name?");
        String name = myScanner.nextLine();

        System.out.println("Hello, " + name);

        for (int i = 0; i < 5; i++) {
            quizQuestion = retrieveQuestionAndAnswerAndRemoveFromBank();
            quizQuestion.printQuestion();
            System.out.println("\nEnter your answer: ");
            String userAnswer = myScanner.nextLine();
            checkAnswer(quizQuestion, userAnswer);

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
