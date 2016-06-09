package lesson_5_1;

import java.util.Map;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-09
 */
public class Quiz {
    private String question;
    private Map<String, String> choices;
    private String correct;

    public Quiz(String question, Map<String, String> choices, String correct) {
        this.question = question;
        this.choices = choices;
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public Map<String, String> getChoices() {
        return choices;
    }

    public String getCorrect() {
        return correct;
    }

    @Override
    public  String toString()
    {
        return getQuestion() + "\n" + getChoices().toString();
    }

}
