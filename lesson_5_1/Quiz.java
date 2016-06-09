package lesson_5_1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-09
 */
public class Quiz {
    private String question;
    private ArrayList<String> choices;
    private String correct;

    public Quiz(String question, ArrayList<String> choices, String correct) {
        this.question = question;
        this.choices = choices;
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getCorrect() {
        return correct;
    }

}
