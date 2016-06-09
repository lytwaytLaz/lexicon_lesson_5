package lesson_5_1;

import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-09
 */



public class Main {
    public static void main(String[] args) throws IOException
    {
        // create quiz objects
        String question1 = new String("Which of the following is not a primitive type in Java?");
        String question2 = new String("Which of the following statements is correct?");
        String question3 = new String("To Java or not to Java?");

        Map<String, String> choices1 = new TreeMap<>();
        choices1.put("A ", " boolean");
        choices1.put("B ", " Integer");
        choices1.put("C ", " char");
        choices1.put("D ", " double");

        Map<String, String> choices2 = new TreeMap<>();
        choices2.put("A ", " Java is a peace of cake");
        choices2.put("B ", " Java is very easy to learn");
        choices2.put("C ", " Java is a walk in the park");
        choices2.put("D ", " Java is like climbing Mount Everest");

        Map<String, String> choices3 = new TreeMap<>();
        choices3.put("A ", " Not to Java");
        choices3.put("B ", " Not to Java");
        choices3.put("C ", " To Java!");
        choices3.put("D ", " Not to Java");

        String answer1 = "B";
        String answer2 = "D";
        String answer3 = "C";

        Quiz quiz1 = new Quiz(question1, choices1, answer1);
        Quiz quiz2 = new Quiz(question2, choices2, answer2);
        Quiz quiz3 = new Quiz(question3, choices3, answer3);

        Quiz[] quizzes = new Quiz[3];
        quizzes[0] = quiz1;
        quizzes[1] = quiz2;
        quizzes[2] = quiz3;


        for (int i = 0; i < quizzes.length; i++)
        {
            String input = "";
            System.out.println(quizzes[i]);
            try
            {
                while (!input.equals("A") &&
                        !input.equals("B") &&
                        !input.equals("C") &&
                        !input.equals("D"))
                {

                    System.out.println("\nPlease answer A, B, C or D");
                    input = Character.toString((char) System.in.read()).toUpperCase();
                    System.in.skip(1);
                }

                if (input.equals(quizzes[i].getCorrect()))
                    System.out.println("Correctomundo!\n");

                else
                    System.out.println("Ooops, better luck next time!\n");

//                System.out.println(" " + quizzes[i].getChoices().get(quizzes[i].getCorrect()) + " is " +
//                                    "the correct answer to the question:\n" + quizzes[i].getQuestion());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
