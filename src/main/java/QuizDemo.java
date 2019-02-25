import java.util.Scanner;


public class QuizDemo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        String userInput;

        quiz.retrieveQuestionAndAnswerAndRemoveFromBank();

        System.out.println("Enter answer");
        userInput = myScanner.nextLine();

        quiz.checkAnswer(userInput);


    }
}
