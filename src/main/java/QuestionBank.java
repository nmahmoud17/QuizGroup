import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionBank {

    private ArrayList<QuizQuestion> questionsArray = new ArrayList<>();


    public QuestionBank() {
        addQuestionAndAnswer();
    }

    public void addQuestionAndAnswer() {

        questionsArray.add(new QuizQuestion("Q1", "A1"));
        questionsArray.add(new QuizQuestion("Q2", "A2"));
        questionsArray.add(new QuizQuestion("Q3", "A3"));
        questionsArray.add(new QuizQuestion("Q4", "A4"));
        questionsArray.add(new QuizQuestion("Q5", "A5"));
        questionsArray.add(new QuizQuestion("Q6", "A6"));
        questionsArray.add(new QuizQuestion("Q7", "A7"));
        questionsArray.add(new QuizQuestion("Q8", "A8"));
        questionsArray.add(new QuizQuestion("Q9", "A9"));
        questionsArray.add(new QuizQuestion("Q10","A10"));
        questionsArray.add(new QuizQuestion("Q11","A11"));
        questionsArray.add(new QuizQuestion("Q12","A12"));
        questionsArray.add(new QuizQuestion("Q13","A13"));
        questionsArray.add(new QuizQuestion("Q14","A14"));
        questionsArray.add(new QuizQuestion("Q15","A15"));

    }

    public ArrayList<QuizQuestion> getQuestionsArray() {
        return questionsArray;
    }

    public void setQuestionsArray(ArrayList<QuizQuestion> questionsArray) {
        this.questionsArray = questionsArray;
    }
}

