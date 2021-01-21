package sample;

import java.util.ArrayList;

/**
 *
 * @author Youcode
 */
public class Level {
    private ArrayList <Question> questions = new ArrayList <Question>();
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

}

