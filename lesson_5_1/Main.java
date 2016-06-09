package lesson_5_1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-09
 */



class Main {
    public static void main(String[] args) {

        String question1 = new String("Which is a primitive type?");
        String question2 = new String("Who walked on the moon?");
        String question3 = new String("To be or not to be?");

        ArrayList<String> choices1 = new ArrayList<>(Arrays.asList("int", "Integer", "char", "double"));
        ArrayList<String> choices2 = new ArrayList<>(Arrays.asList("int", "Integer", "char", "double"));
        ArrayList<String> choices3 = new ArrayList<>(Arrays.asList("int", "Integer", "char", "double"));

        String answer1 = "B";
        String answer2 = "B";
        String answer3 = "B";


        Quiz quiz1 = new Quiz(question1, choices1, answer1);
        Quiz quiz2 = new Quiz(question2, choices2, answer2);
        Quiz quiz3 = new Quiz(question3, choices3, answer3);

//        Quiz[] quizzes = {quiz1, quiz2, quiz3}; //eller enligt nedan

        Quiz[] quizzes = new Quiz[3];
        quizzes[0] = quiz1;
        quizzes[1] = quiz2;
        quizzes[2] = quiz3;

        int count = 0;

        for (int i = 0; i < quizzes.length; i++) {
            System.out.println(i+1 + ". " + quizzes[i]);
            System.out.println("A: "+ quizzes[i].getChoices()[0]);

        }




    }






}
