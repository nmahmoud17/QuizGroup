import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class QuizTest {

    private Quiz testQuiz;

    @Before
    public void create(){
        testQuiz = new Quiz();

    }

    @Test
    public void generateQuestion() {

        ArrayList<QuizQuestion> result = testQuiz.getQuestionsList().getQuestionsArray();
        assertThat(result.size(), equalTo(10));

        testQuiz.retrieveQuestionAndAnswerAndRemoveFromBank();
        assertThat(result.size(), equalTo(9));

    }

//    @Test
//    public void removeQuestion() {
//    }
}