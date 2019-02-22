import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {


    private QuestionBank questionsList = new QuestionBank();
//    private ScoreKeeper scoreKeeper;


//    public Quiz(QuestionBank questionsList, ScoreKeeper scoreKeeper) {
//        this.questionsList = questionsList;
//        this.scoreKeeper = scoreKeeper;
//    }

    public QuizQuestion generateQuestion() {
        Collections.shuffle(questionsList.getQuestionsArray());
        QuizQuestion question = questionsList.getQuestionsArray().get(0);
        questionsList.getQuestionsArray().remove(0);
        return question;
    }

    public QuestionBank getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(QuestionBank questionsList) {
        this.questionsList = questionsList;
    }
}
