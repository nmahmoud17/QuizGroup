import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScoreKeeper {

    private int score = 0;
    private ArrayList<String> insult1 = new ArrayList<>();
    private ArrayList<String> insult2 = new ArrayList<>();

    public void addInsults(){
        insult1.add("Dumb");
        insult1.add("Goofy");
        insult1.add("Weird");
        insult1.add("Rusty");
        insult1.add("Chunky");
        insult2.add("monkey!");
        insult2.add("banana!");
        insult2.add("human!");
        insult2.add("cookie!");
        insult2.add("clown");

    }

    public String makeInsult(){
        Collections.shuffle(insult1);
        Collections.shuffle(insult2);
        String word1 = insult1.get(0);
        String word2 = insult2.get(0);

        return word1 + " "+ word2;

    }


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

    public ArrayList<String> getInsult1() {
        return insult1;
    }

    public void setInsult1(ArrayList<String> insult1) {
        this.insult1 = insult1;
    }

    public ArrayList<String> getInsult2() {
        return insult2;
    }

    public void setInsult2(ArrayList<String> insult2) {
        this.insult2 = insult2;
    }

    public ScoreKeeper() {
        addInsults();
        makeInsult();
    }
}
