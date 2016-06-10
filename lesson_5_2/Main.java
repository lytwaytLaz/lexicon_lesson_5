package lesson_5_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.Character.isLetter;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-10
 */
public class Main
{
    Map<String, Integer> wordCount = new HashMap<>();
    String words = new String();

    public void Reader(String words) {
        StringBuilder toMap = new StringBuilder();

        for (int i = 0; i < words.length(); i++) {
            if (isLetter(words.charAt(i)))
                toMap.append(words.charAt(i));
            else if (toMap.length() > 0) {
                Mapper(toMap.toString());
//                System.out.println(toMap);
                toMap.delete(0, toMap.length() + 1);
            }
        }
    }

    public void Mapper(String word) {

        if (wordCount.containsKey(word))
            wordCount.put(word, wordCount.get(word) + 1);
        else
            wordCount.put(word, 1);
    }

    public Map<String, Integer> getMap()
    {
        return wordCount;
    }

    public static void main(String[] args) {
        // create a Stringer object to be mapped
        // Stringer class can later be modified
        Stringer toCount = new Stringer("Hello hello hello hello hello world. What the what? " +
                                        "To Java or not to Java that is the question.");

        Main mapIt = new Main();
        mapIt.words = toCount.getInput();
        mapIt.Reader(mapIt.words);

        System.out.println(mapIt.getMap().entrySet());
    }
}
