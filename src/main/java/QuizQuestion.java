public class QuizQuestion {

    private String question;
    private String answer;

    public QuizQuestion(String question, String answer){
        this.question = question;
        this.answer = answer;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void printQuestionDetails() {
        System.out.println(question);
        System.out.println(answer);
    }




}
